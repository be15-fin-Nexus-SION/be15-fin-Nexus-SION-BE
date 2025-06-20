/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.tables.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.jooq.generated.enums.GradeGradeCode;

/** This class is generated by jOOQ. */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Grade implements Serializable {

  private static final long serialVersionUID = 1L;

  private GradeGradeCode gradeCode;
  private Integer minScore;
  private Integer maxScore;
  private BigDecimal productivity;
  private Integer monthlyUnitPrice;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public Grade() {}

  public Grade(Grade value) {
    this.gradeCode = value.gradeCode;
    this.minScore = value.minScore;
    this.maxScore = value.maxScore;
    this.productivity = value.productivity;
    this.monthlyUnitPrice = value.monthlyUnitPrice;
    this.createdAt = value.createdAt;
    this.updatedAt = value.updatedAt;
  }

  public Grade(
      GradeGradeCode gradeCode,
      Integer minScore,
      Integer maxScore,
      BigDecimal productivity,
      Integer monthlyUnitPrice,
      LocalDateTime createdAt,
      LocalDateTime updatedAt) {
    this.gradeCode = gradeCode;
    this.minScore = minScore;
    this.maxScore = maxScore;
    this.productivity = productivity;
    this.monthlyUnitPrice = monthlyUnitPrice;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  /** Getter for <code>SION.grade.grade_code</code>. */
  public GradeGradeCode getGradeCode() {
    return this.gradeCode;
  }

  /** Setter for <code>SION.grade.grade_code</code>. */
  public void setGradeCode(GradeGradeCode gradeCode) {
    this.gradeCode = gradeCode;
  }

  /** Getter for <code>SION.grade.min_score</code>. */
  public Integer getMinScore() {
    return this.minScore;
  }

  /** Setter for <code>SION.grade.min_score</code>. */
  public void setMinScore(Integer minScore) {
    this.minScore = minScore;
  }

  /** Getter for <code>SION.grade.max_score</code>. */
  public Integer getMaxScore() {
    return this.maxScore;
  }

  /** Setter for <code>SION.grade.max_score</code>. */
  public void setMaxScore(Integer maxScore) {
    this.maxScore = maxScore;
  }

  /** Getter for <code>SION.grade.productivity</code>. */
  public BigDecimal getProductivity() {
    return this.productivity;
  }

  /** Setter for <code>SION.grade.productivity</code>. */
  public void setProductivity(BigDecimal productivity) {
    this.productivity = productivity;
  }

  /** Getter for <code>SION.grade.monthly_unit_price</code>. */
  public Integer getMonthlyUnitPrice() {
    return this.monthlyUnitPrice;
  }

  /** Setter for <code>SION.grade.monthly_unit_price</code>. */
  public void setMonthlyUnitPrice(Integer monthlyUnitPrice) {
    this.monthlyUnitPrice = monthlyUnitPrice;
  }

  /** Getter for <code>SION.grade.created_at</code>. */
  public LocalDateTime getCreatedAt() {
    return this.createdAt;
  }

  /** Setter for <code>SION.grade.created_at</code>. */
  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /** Getter for <code>SION.grade.updated_at</code>. */
  public LocalDateTime getUpdatedAt() {
    return this.updatedAt;
  }

  /** Setter for <code>SION.grade.updated_at</code>. */
  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    final Grade other = (Grade) obj;
    if (this.gradeCode == null) {
      if (other.gradeCode != null) return false;
    } else if (!this.gradeCode.equals(other.gradeCode)) return false;
    if (this.minScore == null) {
      if (other.minScore != null) return false;
    } else if (!this.minScore.equals(other.minScore)) return false;
    if (this.maxScore == null) {
      if (other.maxScore != null) return false;
    } else if (!this.maxScore.equals(other.maxScore)) return false;
    if (this.productivity == null) {
      if (other.productivity != null) return false;
    } else if (!this.productivity.equals(other.productivity)) return false;
    if (this.monthlyUnitPrice == null) {
      if (other.monthlyUnitPrice != null) return false;
    } else if (!this.monthlyUnitPrice.equals(other.monthlyUnitPrice)) return false;
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
    result = prime * result + ((this.gradeCode == null) ? 0 : this.gradeCode.hashCode());
    result = prime * result + ((this.minScore == null) ? 0 : this.minScore.hashCode());
    result = prime * result + ((this.maxScore == null) ? 0 : this.maxScore.hashCode());
    result = prime * result + ((this.productivity == null) ? 0 : this.productivity.hashCode());
    result =
        prime * result + ((this.monthlyUnitPrice == null) ? 0 : this.monthlyUnitPrice.hashCode());
    result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
    result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Grade (");

    sb.append(gradeCode);
    sb.append(", ").append(minScore);
    sb.append(", ").append(maxScore);
    sb.append(", ").append(productivity);
    sb.append(", ").append(monthlyUnitPrice);
    sb.append(", ").append(createdAt);
    sb.append(", ").append(updatedAt);

    sb.append(")");
    return sb.toString();
  }
}
