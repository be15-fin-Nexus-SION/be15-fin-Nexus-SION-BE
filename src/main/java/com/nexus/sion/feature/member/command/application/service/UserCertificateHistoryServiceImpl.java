package com.nexus.sion.feature.member.command.application.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexus.sion.common.s3.service.DocumentS3Service;
import com.nexus.sion.exception.BusinessException;
import com.nexus.sion.exception.ErrorCode;
import com.nexus.sion.feature.member.command.application.dto.request.CertificateRejectRequest;
import com.nexus.sion.feature.member.command.application.dto.request.UserCertificateHistoryRequest;
import com.nexus.sion.feature.member.command.domain.aggregate.entity.Certificate;
import com.nexus.sion.feature.member.command.domain.aggregate.entity.Member;
import com.nexus.sion.feature.member.command.domain.aggregate.entity.UserCertificateHistory;
import com.nexus.sion.feature.member.command.domain.aggregate.enums.CertificateStatus;
import com.nexus.sion.feature.member.command.domain.aggregate.enums.MemberRole;
import com.nexus.sion.feature.member.command.domain.repository.CertificateRepository;
import com.nexus.sion.feature.member.command.domain.repository.MemberRepository;
import com.nexus.sion.feature.member.command.domain.repository.UserCertificateHistoryRepository;
import com.nexus.sion.feature.member.query.dto.response.UserCertificateHistoryResponse;
import com.nexus.sion.feature.notification.command.application.service.NotificationCommandService;
import com.nexus.sion.feature.notification.command.domain.aggregate.NotificationType;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserCertificateHistoryServiceImpl implements UserCertificateHistoryService {

  private final UserCertificateHistoryRepository userCertificateHistoryRepository;
  private final CertificateRepository certificateRepository;
  private final DocumentS3Service documentS3Service;
  private final NotificationCommandService notificationCommandService;
  private final MemberRepository memberRepository;

  @Override
  @Transactional
  public void registerUserCertificate(String employeeId, UserCertificateHistoryRequest request) {
    Certificate certificate =
        certificateRepository
            .findById(request.getCertificateName())
            .orElseThrow(() -> new BusinessException(ErrorCode.CERTIFICATE_NOT_FOUND));

    String prefix = "certificates";
    String uploadedUrl = documentS3Service.uploadFile(request.getPdfFileUrl(), prefix).getUrl();

    UserCertificateHistory history =
        UserCertificateHistory.builder()
            .certificateName(certificate.getCertificateName())
            .employeeIdentificationNumber(employeeId)
            .certificateStatus(CertificateStatus.PENDING)
            .pdfFileUrl(uploadedUrl)
            .issueDate(request.getIssueDate())
            .createdAt(LocalDateTime.now())
            .updatedAt(LocalDateTime.now())
            .build();

    userCertificateHistoryRepository.save(history);

    try {
      List<Member> adminMembers = memberRepository.findAllByRole(MemberRole.ADMIN);
      for (Member admin : adminMembers) {
        notificationCommandService.createAndSendNotification(
            employeeId,
            admin.getEmployeeIdentificationNumber(),
            null,
            NotificationType.CERTIFICATION_APPROVAL_REQUEST,
            String.valueOf(history.getId()));
      }
    } catch (Exception e) {
      System.err.println("관리자 알림 전송 실패: " + e.getMessage());
    }
  }

  @Override
  @Transactional
  public List<UserCertificateHistoryResponse> getAllCertificates() {
    return userCertificateHistoryRepository.findAll().stream()
        .map(UserCertificateHistoryResponse::fromEntity)
        .toList();
  }

  @Override
  @Transactional
  public void approveUserCertificate(Long certificateRequestId) {
    UserCertificateHistory history =
        userCertificateHistoryRepository
            .findById(certificateRequestId)
            .orElseThrow(() -> new BusinessException(ErrorCode.USER_CERTIFICATE_NOT_FOUND));

    history.approve();
    userCertificateHistoryRepository.save(history);
  }

  @Override
  @Transactional
  public void rejectUserCertificate(
      Long certificateRequestId, CertificateRejectRequest rejectedReason) {
    UserCertificateHistory history =
        userCertificateHistoryRepository
            .findById(certificateRequestId)
            .orElseThrow(() -> new BusinessException(ErrorCode.USER_CERTIFICATE_NOT_FOUND));

    history.reject(rejectedReason.getRejectedReason());
    userCertificateHistoryRepository.save(history);
  }
}
