/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.tables.daos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import com.example.jooq.generated.tables.DeveloperTechStack;
import com.example.jooq.generated.tables.records.DeveloperTechStackRecord;

/** This class is generated by jOOQ. */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DeveloperTechStackDao
    extends DAOImpl<
        DeveloperTechStackRecord,
        com.example.jooq.generated.tables.pojos.DeveloperTechStack,
        Long> {

  /** Create a new DeveloperTechStackDao without any configuration */
  public DeveloperTechStackDao() {
    super(
        DeveloperTechStack.DEVELOPER_TECH_STACK,
        com.example.jooq.generated.tables.pojos.DeveloperTechStack.class);
  }

  /** Create a new DeveloperTechStackDao with an attached configuration */
  public DeveloperTechStackDao(Configuration configuration) {
    super(
        DeveloperTechStack.DEVELOPER_TECH_STACK,
        com.example.jooq.generated.tables.pojos.DeveloperTechStack.class,
        configuration);
  }

  @Override
  public Long getId(com.example.jooq.generated.tables.pojos.DeveloperTechStack object) {
    return object.getDeveloperTechStackId();
  }

  /**
   * Fetch records that have <code>developer_tech_stack_id BETWEEN
   * lowerInclusive AND upperInclusive</code>
   */
  public List<com.example.jooq.generated.tables.pojos.DeveloperTechStack>
      fetchRangeOfDeveloperTechStackId(Long lowerInclusive, Long upperInclusive) {
    return fetchRange(
        DeveloperTechStack.DEVELOPER_TECH_STACK.DEVELOPER_TECH_STACK_ID,
        lowerInclusive,
        upperInclusive);
  }

  /** Fetch records that have <code>developer_tech_stack_id IN (values)</code> */
  public List<com.example.jooq.generated.tables.pojos.DeveloperTechStack>
      fetchByDeveloperTechStackId(Long... values) {
    return fetch(DeveloperTechStack.DEVELOPER_TECH_STACK.DEVELOPER_TECH_STACK_ID, values);
  }

  /**
   * Fetch a unique record that has <code>developer_tech_stack_id =
   * value</code>
   */
  public com.example.jooq.generated.tables.pojos.DeveloperTechStack fetchOneByDeveloperTechStackId(
      Long value) {
    return fetchOne(DeveloperTechStack.DEVELOPER_TECH_STACK.DEVELOPER_TECH_STACK_ID, value);
  }

  /**
   * Fetch a unique record that has <code>developer_tech_stack_id =
   * value</code>
   */
  public Optional<com.example.jooq.generated.tables.pojos.DeveloperTechStack>
      fetchOptionalByDeveloperTechStackId(Long value) {
    return fetchOptional(DeveloperTechStack.DEVELOPER_TECH_STACK.DEVELOPER_TECH_STACK_ID, value);
  }

  /**
   * Fetch records that have <code>tech_stack_total_scores BETWEEN
   * lowerInclusive AND upperInclusive</code>
   */
  public List<com.example.jooq.generated.tables.pojos.DeveloperTechStack>
      fetchRangeOfTechStackTotalScores(Integer lowerInclusive, Integer upperInclusive) {
    return fetchRange(
        DeveloperTechStack.DEVELOPER_TECH_STACK.TECH_STACK_TOTAL_SCORES,
        lowerInclusive,
        upperInclusive);
  }

  /** Fetch records that have <code>tech_stack_total_scores IN (values)</code> */
  public List<com.example.jooq.generated.tables.pojos.DeveloperTechStack>
      fetchByTechStackTotalScores(Integer... values) {
    return fetch(DeveloperTechStack.DEVELOPER_TECH_STACK.TECH_STACK_TOTAL_SCORES, values);
  }

  /**
   * Fetch records that have <code>employee_identification_number BETWEEN
   * lowerInclusive AND upperInclusive</code>
   */
  public List<com.example.jooq.generated.tables.pojos.DeveloperTechStack>
      fetchRangeOfEmployeeIdentificationNumber(String lowerInclusive, String upperInclusive) {
    return fetchRange(
        DeveloperTechStack.DEVELOPER_TECH_STACK.EMPLOYEE_IDENTIFICATION_NUMBER,
        lowerInclusive,
        upperInclusive);
  }

  /**
   * Fetch records that have <code>employee_identification_number IN
   * (values)</code>
   */
  public List<com.example.jooq.generated.tables.pojos.DeveloperTechStack>
      fetchByEmployeeIdentificationNumber(String... values) {
    return fetch(DeveloperTechStack.DEVELOPER_TECH_STACK.EMPLOYEE_IDENTIFICATION_NUMBER, values);
  }

  /**
   * Fetch records that have <code>tech_stack_name BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  public List<com.example.jooq.generated.tables.pojos.DeveloperTechStack> fetchRangeOfTechStackName(
      String lowerInclusive, String upperInclusive) {
    return fetchRange(
        DeveloperTechStack.DEVELOPER_TECH_STACK.TECH_STACK_NAME, lowerInclusive, upperInclusive);
  }

  /** Fetch records that have <code>tech_stack_name IN (values)</code> */
  public List<com.example.jooq.generated.tables.pojos.DeveloperTechStack> fetchByTechStackName(
      String... values) {
    return fetch(DeveloperTechStack.DEVELOPER_TECH_STACK.TECH_STACK_NAME, values);
  }

  /**
   * Fetch records that have <code>created_at BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  public List<com.example.jooq.generated.tables.pojos.DeveloperTechStack> fetchRangeOfCreatedAt(
      LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
    return fetchRange(
        DeveloperTechStack.DEVELOPER_TECH_STACK.CREATED_AT, lowerInclusive, upperInclusive);
  }

  /** Fetch records that have <code>created_at IN (values)</code> */
  public List<com.example.jooq.generated.tables.pojos.DeveloperTechStack> fetchByCreatedAt(
      LocalDateTime... values) {
    return fetch(DeveloperTechStack.DEVELOPER_TECH_STACK.CREATED_AT, values);
  }

  /**
   * Fetch records that have <code>updated_at BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  public List<com.example.jooq.generated.tables.pojos.DeveloperTechStack> fetchRangeOfUpdatedAt(
      LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
    return fetchRange(
        DeveloperTechStack.DEVELOPER_TECH_STACK.UPDATED_AT, lowerInclusive, upperInclusive);
  }

  /** Fetch records that have <code>updated_at IN (values)</code> */
  public List<com.example.jooq.generated.tables.pojos.DeveloperTechStack> fetchByUpdatedAt(
      LocalDateTime... values) {
    return fetch(DeveloperTechStack.DEVELOPER_TECH_STACK.UPDATED_AT, values);
  }
}
