/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.tables.daos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import com.example.jooq.generated.tables.SquadComment;
import com.example.jooq.generated.tables.records.SquadCommentRecord;

/** This class is generated by jOOQ. */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class SquadCommentDao
    extends DAOImpl<
        SquadCommentRecord, com.example.jooq.generated.tables.pojos.SquadComment, Long> {

  /** Create a new SquadCommentDao without any configuration */
  public SquadCommentDao() {
    super(SquadComment.SQUAD_COMMENT, com.example.jooq.generated.tables.pojos.SquadComment.class);
  }

  /** Create a new SquadCommentDao with an attached configuration */
  public SquadCommentDao(Configuration configuration) {
    super(
        SquadComment.SQUAD_COMMENT,
        com.example.jooq.generated.tables.pojos.SquadComment.class,
        configuration);
  }

  @Override
  public Long getId(com.example.jooq.generated.tables.pojos.SquadComment object) {
    return object.getCommentId();
  }

  /**
   * Fetch records that have <code>comment_id BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  public List<com.example.jooq.generated.tables.pojos.SquadComment> fetchRangeOfCommentId(
      Long lowerInclusive, Long upperInclusive) {
    return fetchRange(SquadComment.SQUAD_COMMENT.COMMENT_ID, lowerInclusive, upperInclusive);
  }

  /** Fetch records that have <code>comment_id IN (values)</code> */
  public List<com.example.jooq.generated.tables.pojos.SquadComment> fetchByCommentId(
      Long... values) {
    return fetch(SquadComment.SQUAD_COMMENT.COMMENT_ID, values);
  }

  /** Fetch a unique record that has <code>comment_id = value</code> */
  public com.example.jooq.generated.tables.pojos.SquadComment fetchOneByCommentId(Long value) {
    return fetchOne(SquadComment.SQUAD_COMMENT.COMMENT_ID, value);
  }

  /** Fetch a unique record that has <code>comment_id = value</code> */
  public Optional<com.example.jooq.generated.tables.pojos.SquadComment> fetchOptionalByCommentId(
      Long value) {
    return fetchOptional(SquadComment.SQUAD_COMMENT.COMMENT_ID, value);
  }

  /**
   * Fetch records that have <code>squad_code BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  public List<com.example.jooq.generated.tables.pojos.SquadComment> fetchRangeOfSquadCode(
      String lowerInclusive, String upperInclusive) {
    return fetchRange(SquadComment.SQUAD_COMMENT.SQUAD_CODE, lowerInclusive, upperInclusive);
  }

  /** Fetch records that have <code>squad_code IN (values)</code> */
  public List<com.example.jooq.generated.tables.pojos.SquadComment> fetchBySquadCode(
      String... values) {
    return fetch(SquadComment.SQUAD_COMMENT.SQUAD_CODE, values);
  }

  /**
   * Fetch records that have <code>employee_identification_number BETWEEN
   * lowerInclusive AND upperInclusive</code>
   */
  public List<com.example.jooq.generated.tables.pojos.SquadComment>
      fetchRangeOfEmployeeIdentificationNumber(String lowerInclusive, String upperInclusive) {
    return fetchRange(
        SquadComment.SQUAD_COMMENT.EMPLOYEE_IDENTIFICATION_NUMBER, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>employee_identification_number IN
   * (values)</code>
   */
  public List<com.example.jooq.generated.tables.pojos.SquadComment>
      fetchByEmployeeIdentificationNumber(String... values) {
    return fetch(SquadComment.SQUAD_COMMENT.EMPLOYEE_IDENTIFICATION_NUMBER, values);
  }

  /**
   * Fetch records that have <code>content BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  public List<com.example.jooq.generated.tables.pojos.SquadComment> fetchRangeOfContent(
      String lowerInclusive, String upperInclusive) {
    return fetchRange(SquadComment.SQUAD_COMMENT.CONTENT, lowerInclusive, upperInclusive);
  }

  /** Fetch records that have <code>content IN (values)</code> */
  public List<com.example.jooq.generated.tables.pojos.SquadComment> fetchByContent(
      String... values) {
    return fetch(SquadComment.SQUAD_COMMENT.CONTENT, values);
  }

  /**
   * Fetch records that have <code>created_at BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  public List<com.example.jooq.generated.tables.pojos.SquadComment> fetchRangeOfCreatedAt(
      LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
    return fetchRange(SquadComment.SQUAD_COMMENT.CREATED_AT, lowerInclusive, upperInclusive);
  }

  /** Fetch records that have <code>created_at IN (values)</code> */
  public List<com.example.jooq.generated.tables.pojos.SquadComment> fetchByCreatedAt(
      LocalDateTime... values) {
    return fetch(SquadComment.SQUAD_COMMENT.CREATED_AT, values);
  }

  /**
   * Fetch records that have <code>updated_at BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  public List<com.example.jooq.generated.tables.pojos.SquadComment> fetchRangeOfUpdatedAt(
      LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
    return fetchRange(SquadComment.SQUAD_COMMENT.UPDATED_AT, lowerInclusive, upperInclusive);
  }

  /** Fetch records that have <code>updated_at IN (values)</code> */
  public List<com.example.jooq.generated.tables.pojos.SquadComment> fetchByUpdatedAt(
      LocalDateTime... values) {
    return fetch(SquadComment.SQUAD_COMMENT.UPDATED_AT, values);
  }
}
