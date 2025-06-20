/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.tables.pojos;

import java.io.Serializable;
import java.time.LocalDateTime;

/** This class is generated by jOOQ. */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UserCertificateHistory implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long userCertificateHistoryId;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private String updatedBy;
  private String certificateName;
  private String employeeIdentificationNumber;

  public UserCertificateHistory() {}

  public UserCertificateHistory(UserCertificateHistory value) {
    this.userCertificateHistoryId = value.userCertificateHistoryId;
    this.createdAt = value.createdAt;
    this.updatedAt = value.updatedAt;
    this.updatedBy = value.updatedBy;
    this.certificateName = value.certificateName;
    this.employeeIdentificationNumber = value.employeeIdentificationNumber;
  }

  public UserCertificateHistory(
      Long userCertificateHistoryId,
      LocalDateTime createdAt,
      LocalDateTime updatedAt,
      String updatedBy,
      String certificateName,
      String employeeIdentificationNumber) {
    this.userCertificateHistoryId = userCertificateHistoryId;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.updatedBy = updatedBy;
    this.certificateName = certificateName;
    this.employeeIdentificationNumber = employeeIdentificationNumber;
  }

  /** Getter for <code>SION.user_certificate_history.user_certificate_history_id</code>. */
  public Long getUserCertificateHistoryId() {
    return this.userCertificateHistoryId;
  }

  /** Setter for <code>SION.user_certificate_history.user_certificate_history_id</code>. */
  public void setUserCertificateHistoryId(Long userCertificateHistoryId) {
    this.userCertificateHistoryId = userCertificateHistoryId;
  }

  /** Getter for <code>SION.user_certificate_history.created_at</code>. */
  public LocalDateTime getCreatedAt() {
    return this.createdAt;
  }

  /** Setter for <code>SION.user_certificate_history.created_at</code>. */
  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Getter for <code>SION.user_certificate_history.updated_at</code>. */
  public LocalDateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** Setter for <code>SION.user_certificate_history.updated_at</code>. */
  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /** Getter for <code>SION.user_certificate_history.updated_by</code>. */
  public String getUpdatedBy() {
    return this.updatedBy;
  }

  /** Setter for <code>SION.user_certificate_history.updated_by</code>. */
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  /** Getter for <code>SION.user_certificate_history.certificate_name</code>. */
  public String getCertificateName() {
    return this.certificateName;
  }

  /** Setter for <code>SION.user_certificate_history.certificate_name</code>. */
  public void setCertificateName(String certificateName) {
    this.certificateName = certificateName;
  }

  /** Getter for <code>SION.user_certificate_history.employee_identification_number</code>. */
  public String getEmployeeIdentificationNumber() {
    return this.employeeIdentificationNumber;
  }

  /** Setter for <code>SION.user_certificate_history.employee_identification_number</code>. */
  public void setEmployeeIdentificationNumber(String employeeIdentificationNumber) {
    this.employeeIdentificationNumber = employeeIdentificationNumber;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    final UserCertificateHistory other = (UserCertificateHistory) obj;
    if (this.userCertificateHistoryId == null) {
      if (other.userCertificateHistoryId != null) return false;
    } else if (!this.userCertificateHistoryId.equals(other.userCertificateHistoryId)) return false;
    if (this.createdAt == null) {
      if (other.createdAt != null) return false;
    } else if (!this.createdAt.equals(other.createdAt)) return false;
    if (this.updatedAt == null) {
      if (other.updatedAt != null) return false;
    } else if (!this.updatedAt.equals(other.updatedAt)) return false;
    if (this.updatedBy == null) {
      if (other.updatedBy != null) return false;
    } else if (!this.updatedBy.equals(other.updatedBy)) return false;
    if (this.certificateName == null) {
      if (other.certificateName != null) return false;
    } else if (!this.certificateName.equals(other.certificateName)) return false;
    if (this.employeeIdentificationNumber == null) {
      if (other.employeeIdentificationNumber != null) return false;
    } else if (!this.employeeIdentificationNumber.equals(other.employeeIdentificationNumber))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result
            + ((this.userCertificateHistoryId == null)
                ? 0
                : this.userCertificateHistoryId.hashCode());
    result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
    result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
    result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
    result =
        prime * result + ((this.certificateName == null) ? 0 : this.certificateName.hashCode());
    result =
        prime * result
            + ((this.employeeIdentificationNumber == null)
                ? 0
                : this.employeeIdentificationNumber.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UserCertificateHistory (");

    sb.append(userCertificateHistoryId);
    sb.append(", ").append(createdAt);
    sb.append(", ").append(updatedAt);
    sb.append(", ").append(updatedBy);
    sb.append(", ").append(certificateName);
    sb.append(", ").append(employeeIdentificationNumber);

    sb.append(")");
    return sb.toString();
  }
}
