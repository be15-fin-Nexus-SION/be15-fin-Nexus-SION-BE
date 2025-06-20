/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.tables.pojos;

import java.io.Serializable;
import java.time.LocalDateTime;

/** This class is generated by jOOQ. */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DeveloperTechStack implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long developerTechStackId;
  private Integer techStackTotalScores;
  private String employeeIdentificationNumber;
  private String techStackName;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public DeveloperTechStack() {}

  public DeveloperTechStack(DeveloperTechStack value) {
    this.developerTechStackId = value.developerTechStackId;
    this.techStackTotalScores = value.techStackTotalScores;
    this.employeeIdentificationNumber = value.employeeIdentificationNumber;
    this.techStackName = value.techStackName;
    this.createdAt = value.createdAt;
    this.updatedAt = value.updatedAt;
  }

  public DeveloperTechStack(
      Long developerTechStackId,
      Integer techStackTotalScores,
      String employeeIdentificationNumber,
      String techStackName,
      LocalDateTime createdAt,
      LocalDateTime updatedAt) {
    this.developerTechStackId = developerTechStackId;
    this.techStackTotalScores = techStackTotalScores;
    this.employeeIdentificationNumber = employeeIdentificationNumber;
    this.techStackName = techStackName;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  /** Getter for <code>SION.developer_tech_stack.developer_tech_stack_id</code>. */
  public Long getDeveloperTechStackId() {
    return this.developerTechStackId;
  }

  /** Setter for <code>SION.developer_tech_stack.developer_tech_stack_id</code>. */
  public void setDeveloperTechStackId(Long developerTechStackId) {
    this.developerTechStackId = developerTechStackId;
  }

  /** Getter for <code>SION.developer_tech_stack.tech_stack_total_scores</code>. */
  public Integer getTechStackTotalScores() {
    return this.techStackTotalScores;
  }

  /** Setter for <code>SION.developer_tech_stack.tech_stack_total_scores</code>. */
  public void setTechStackTotalScores(Integer techStackTotalScores) {
    this.techStackTotalScores = techStackTotalScores;
  }

  /** Getter for <code>SION.developer_tech_stack.employee_identification_number</code>. */
  public String getEmployeeIdentificationNumber() {
    return this.employeeIdentificationNumber;
  }

  /** Setter for <code>SION.developer_tech_stack.employee_identification_number</code>. */
  public void setEmployeeIdentificationNumber(String employeeIdentificationNumber) {
    this.employeeIdentificationNumber = employeeIdentificationNumber;
  }

  /** Getter for <code>SION.developer_tech_stack.tech_stack_name</code>. */
  public String getTechStackName() {
    return this.techStackName;
  }

  /** Setter for <code>SION.developer_tech_stack.tech_stack_name</code>. */
  public void setTechStackName(String techStackName) {
    this.techStackName = techStackName;
  }

  /** Getter for <code>SION.developer_tech_stack.created_at</code>. */
  public LocalDateTime getCreatedAt() {
    return this.createdAt;
  }

  /** Setter for <code>SION.developer_tech_stack.created_at</code>. */
  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Getter for <code>SION.developer_tech_stack.updated_at</code>. */
  public LocalDateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** Setter for <code>SION.developer_tech_stack.updated_at</code>. */
  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    final DeveloperTechStack other = (DeveloperTechStack) obj;
    if (this.developerTechStackId == null) {
      if (other.developerTechStackId != null) return false;
    } else if (!this.developerTechStackId.equals(other.developerTechStackId)) return false;
    if (this.techStackTotalScores == null) {
      if (other.techStackTotalScores != null) return false;
    } else if (!this.techStackTotalScores.equals(other.techStackTotalScores)) return false;
    if (this.employeeIdentificationNumber == null) {
      if (other.employeeIdentificationNumber != null) return false;
    } else if (!this.employeeIdentificationNumber.equals(other.employeeIdentificationNumber))
      return false;
    if (this.techStackName == null) {
      if (other.techStackName != null) return false;
    } else if (!this.techStackName.equals(other.techStackName)) return false;
    if (this.createdAt == null) {
      if (other.createdAt != null) return false;
    } else if (!this.createdAt.equals(other.createdAt)) return false;
    if (this.updatedAt == null) {
      if (other.updatedAt != null) return false;
    } else if (!this.updatedAt.equals(other.updatedAt)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result
            + ((this.developerTechStackId == null) ? 0 : this.developerTechStackId.hashCode());
    result =
        prime * result
            + ((this.techStackTotalScores == null) ? 0 : this.techStackTotalScores.hashCode());
    result =
        prime * result
            + ((this.employeeIdentificationNumber == null)
                ? 0
                : this.employeeIdentificationNumber.hashCode());
    result = prime * result + ((this.techStackName == null) ? 0 : this.techStackName.hashCode());
    result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
    result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DeveloperTechStack (");

    sb.append(developerTechStackId);
    sb.append(", ").append(techStackTotalScores);
    sb.append(", ").append(employeeIdentificationNumber);
    sb.append(", ").append(techStackName);
    sb.append(", ").append(createdAt);
    sb.append(", ").append(updatedAt);

    sb.append(")");
    return sb.toString();
  }
}
