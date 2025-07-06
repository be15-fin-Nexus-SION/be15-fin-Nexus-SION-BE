package com.nexus.sion.feature.notification.command.domain.aggregate;

import jakarta.persistence.*;

import com.nexus.sion.common.domain.BaseTimeEntity;

import lombok.*;

@Entity
@Table(name = "notification")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@ToString
public class Notification extends BaseTimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "notification_id")
  private Long notificationId;

  @Column(name = "notification_type", length = 50, nullable = false)
  private NotificationType notificationType;

  @Column(name = "linked_content_id", length = 30)
  private String linkedContentId;

  @Column(name = "message", columnDefinition = "TEXT", nullable = false)
  private String message;

  @Column(name = "is_read", nullable = false)
  private Boolean isRead = false;

  @Column(name = "receiver_id", length = 30, nullable = false)
  private String receiverId;

  /** 테스트용 팩토리 메서드 */
  public static Notification of(
      NotificationType notificationType, String message, String receiverId) {
    return Notification.builder()
        .notificationType(notificationType)
        .message(message)
        .receiverId(receiverId)
        .isRead(false)
        .build();
  }
}
