/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.tables.records;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import com.example.jooq.generated.tables.ProjectEvaluation;

/** This class is generated by jOOQ. */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjectEvaluationRecord extends UpdatableRecordImpl<ProjectEvaluationRecord>
    implements Record10<
        Long,
        String,
        Long,
        Long,
        Integer,
        Integer,
        Integer,
        Integer,
        LocalDateTime,
        LocalDateTime> {

  private static final long serialVersionUID = 1L;

  /** Setter for <code>SION.project_evaluation.project_evaluation_id</code>. */
  public void setProjectEvaluationId(Long value) {
    set(0, value);
  }

  /** Getter for <code>SION.project_evaluation.project_evaluation_id</code>. */
  public Long getProjectEvaluationId() {
    return (Long) get(0);
  }

  /** Setter for <code>SION.project_evaluation.project_code</code>. */
  public void setProjectCode(String value) {
    set(1, value);
  }

  /** Getter for <code>SION.project_evaluation.project_code</code>. */
  public String getProjectCode() {
    return (String) get(1);
  }

  /** Setter for <code>SION.project_evaluation.developer_id</code>. */
  public void setDeveloperId(Long value) {
    set(2, value);
  }

  /** Getter for <code>SION.project_evaluation.developer_id</code>. */
  public Long getDeveloperId() {
    return (Long) get(2);
  }

  /** Setter for <code>SION.project_evaluation.estimator_id</code>. */
  public void setEstimatorId(Long value) {
    set(3, value);
  }

  /** Getter for <code>SION.project_evaluation.estimator_id</code>. */
  public Long getEstimatorId() {
    return (Long) get(3);
  }

  /** Setter for <code>SION.project_evaluation.tech_fit</code>. */
  public void setTechFit(Integer value) {
    set(4, value);
  }

  /** Getter for <code>SION.project_evaluation.tech_fit</code>. */
  public Integer getTechFit() {
    return (Integer) get(4);
  }

  /** Setter for <code>SION.project_evaluation.communication</code>. */
  public void setCommunication(Integer value) {
    set(5, value);
  }

  /** Getter for <code>SION.project_evaluation.communication</code>. */
  public Integer getCommunication() {
    return (Integer) get(5);
  }

  /** Setter for <code>SION.project_evaluation.problem_solving</code>. */
  public void setProblemSolving(Integer value) {
    set(6, value);
  }

  /** Getter for <code>SION.project_evaluation.problem_solving</code>. */
  public Integer getProblemSolving() {
    return (Integer) get(6);
  }

  /** Setter for <code>SION.project_evaluation.cooperation_attitude</code>. */
  public void setCooperationAttitude(Integer value) {
    set(7, value);
  }

  /** Getter for <code>SION.project_evaluation.cooperation_attitude</code>. */
  public Integer getCooperationAttitude() {
    return (Integer) get(7);
  }

  /** Setter for <code>SION.project_evaluation.created_at</code>. */
  public void setCreatedAt(LocalDateTime value) {
    set(8, value);
  }

  /** Getter for <code>SION.project_evaluation.created_at</code>. */
  public LocalDateTime getCreatedAt() {
    return (LocalDateTime) get(8);
  }

  /** Setter for <code>SION.project_evaluation.updated_at</code>. */
  public void setUpdatedAt(LocalDateTime value) {
    set(9, value);
  }

  /** Getter for <code>SION.project_evaluation.updated_at</code>. */
  public LocalDateTime getUpdatedAt() {
    return (LocalDateTime) get(9);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  @Override
  public Record1<Long> key() {
    return (Record1) super.key();
  }

  // -------------------------------------------------------------------------
  // Record10 type implementation
  // -------------------------------------------------------------------------

  @Override
  public Row10<
          Long,
          String,
          Long,
          Long,
          Integer,
          Integer,
          Integer,
          Integer,
          LocalDateTime,
          LocalDateTime>
      fieldsRow() {
    return (Row10) super.fieldsRow();
  }

  @Override
  public Row10<
          Long,
          String,
          Long,
          Long,
          Integer,
          Integer,
          Integer,
          Integer,
          LocalDateTime,
          LocalDateTime>
      valuesRow() {
    return (Row10) super.valuesRow();
  }

  @Override
  public Field<Long> field1() {
    return ProjectEvaluation.PROJECT_EVALUATION.PROJECT_EVALUATION_ID;
  }

  @Override
  public Field<String> field2() {
    return ProjectEvaluation.PROJECT_EVALUATION.PROJECT_CODE;
  }

  @Override
  public Field<Long> field3() {
    return ProjectEvaluation.PROJECT_EVALUATION.DEVELOPER_ID;
  }

  @Override
  public Field<Long> field4() {
    return ProjectEvaluation.PROJECT_EVALUATION.ESTIMATOR_ID;
  }

  @Override
  public Field<Integer> field5() {
    return ProjectEvaluation.PROJECT_EVALUATION.TECH_FIT;
  }

  @Override
  public Field<Integer> field6() {
    return ProjectEvaluation.PROJECT_EVALUATION.COMMUNICATION;
  }

  @Override
  public Field<Integer> field7() {
    return ProjectEvaluation.PROJECT_EVALUATION.PROBLEM_SOLVING;
  }

  @Override
  public Field<Integer> field8() {
    return ProjectEvaluation.PROJECT_EVALUATION.COOPERATION_ATTITUDE;
  }

  @Override
  public Field<LocalDateTime> field9() {
    return ProjectEvaluation.PROJECT_EVALUATION.CREATED_AT;
  }

  @Override
  public Field<LocalDateTime> field10() {
    return ProjectEvaluation.PROJECT_EVALUATION.UPDATED_AT;
  }

  @Override
  public Long component1() {
    return getProjectEvaluationId();
  }

  @Override
  public String component2() {
    return getProjectCode();
  }

  @Override
  public Long component3() {
    return getDeveloperId();
  }

  @Override
  public Long component4() {
    return getEstimatorId();
  }

  @Override
  public Integer component5() {
    return getTechFit();
  }

  @Override
  public Integer component6() {
    return getCommunication();
  }

  @Override
  public Integer component7() {
    return getProblemSolving();
  }

  @Override
  public Integer component8() {
    return getCooperationAttitude();
  }

  @Override
  public LocalDateTime component9() {
    return getCreatedAt();
  }

  @Override
  public LocalDateTime component10() {
    return getUpdatedAt();
  }

  @Override
  public Long value1() {
    return getProjectEvaluationId();
  }

  @Override
  public String value2() {
    return getProjectCode();
  }

  @Override
  public Long value3() {
    return getDeveloperId();
  }

  @Override
  public Long value4() {
    return getEstimatorId();
  }

  @Override
  public Integer value5() {
    return getTechFit();
  }

  @Override
  public Integer value6() {
    return getCommunication();
  }

  @Override
  public Integer value7() {
    return getProblemSolving();
  }

  @Override
  public Integer value8() {
    return getCooperationAttitude();
  }

  @Override
  public LocalDateTime value9() {
    return getCreatedAt();
  }

  @Override
  public LocalDateTime value10() {
    return getUpdatedAt();
  }

  @Override
  public ProjectEvaluationRecord value1(Long value) {
    setProjectEvaluationId(value);
    return this;
  }

  @Override
  public ProjectEvaluationRecord value2(String value) {
    setProjectCode(value);
    return this;
  }

  @Override
  public ProjectEvaluationRecord value3(Long value) {
    setDeveloperId(value);
    return this;
  }

  @Override
  public ProjectEvaluationRecord value4(Long value) {
    setEstimatorId(value);
    return this;
  }

  @Override
  public ProjectEvaluationRecord value5(Integer value) {
    setTechFit(value);
    return this;
  }

  @Override
  public ProjectEvaluationRecord value6(Integer value) {
    setCommunication(value);
    return this;
  }

  @Override
  public ProjectEvaluationRecord value7(Integer value) {
    setProblemSolving(value);
    return this;
  }

  @Override
  public ProjectEvaluationRecord value8(Integer value) {
    setCooperationAttitude(value);
    return this;
  }

  @Override
  public ProjectEvaluationRecord value9(LocalDateTime value) {
    setCreatedAt(value);
    return this;
  }

  @Override
  public ProjectEvaluationRecord value10(LocalDateTime value) {
    setUpdatedAt(value);
    return this;
  }

  @Override
  public ProjectEvaluationRecord values(
      Long value1,
      String value2,
      Long value3,
      Long value4,
      Integer value5,
      Integer value6,
      Integer value7,
      Integer value8,
      LocalDateTime value9,
      LocalDateTime value10) {
    value1(value1);
    value2(value2);
    value3(value3);
    value4(value4);
    value5(value5);
    value6(value6);
    value7(value7);
    value8(value8);
    value9(value9);
    value10(value10);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /** Create a detached ProjectEvaluationRecord */
  public ProjectEvaluationRecord() {
    super(ProjectEvaluation.PROJECT_EVALUATION);
  }

  /** Create a detached, initialised ProjectEvaluationRecord */
  public ProjectEvaluationRecord(
      Long projectEvaluationId,
      String projectCode,
      Long developerId,
      Long estimatorId,
      Integer techFit,
      Integer communication,
      Integer problemSolving,
      Integer cooperationAttitude,
      LocalDateTime createdAt,
      LocalDateTime updatedAt) {
    super(ProjectEvaluation.PROJECT_EVALUATION);

    setProjectEvaluationId(projectEvaluationId);
    setProjectCode(projectCode);
    setDeveloperId(developerId);
    setEstimatorId(estimatorId);
    setTechFit(techFit);
    setCommunication(communication);
    setProblemSolving(problemSolving);
    setCooperationAttitude(cooperationAttitude);
    setCreatedAt(createdAt);
    setUpdatedAt(updatedAt);
    resetChangedOnNotNull();
  }

  /** Create a detached, initialised ProjectEvaluationRecord */
  public ProjectEvaluationRecord(com.example.jooq.generated.tables.pojos.ProjectEvaluation value) {
    super(ProjectEvaluation.PROJECT_EVALUATION);

    if (value != null) {
      setProjectEvaluationId(value.getProjectEvaluationId());
      setProjectCode(value.getProjectCode());
      setDeveloperId(value.getDeveloperId());
      setEstimatorId(value.getEstimatorId());
      setTechFit(value.getTechFit());
      setCommunication(value.getCommunication());
      setProblemSolving(value.getProblemSolving());
      setCooperationAttitude(value.getCooperationAttitude());
      setCreatedAt(value.getCreatedAt());
      setUpdatedAt(value.getUpdatedAt());
      resetChangedOnNotNull();
    }
  }
}
