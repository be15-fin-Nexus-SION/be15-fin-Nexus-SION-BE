/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.tables.records;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import com.example.jooq.generated.tables.Position;

/** This class is generated by jOOQ. */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class PositionRecord extends UpdatableRecordImpl<PositionRecord>
    implements Record3<String, LocalDateTime, LocalDateTime> {

  private static final long serialVersionUID = 1L;

  /** Setter for <code>SION.position.position_name</code>. */
  public void setPositionName(String value) {
    set(0, value);
  }

  /** Getter for <code>SION.position.position_name</code>. */
  public String getPositionName() {
    return (String) get(0);
  }

  /** Setter for <code>SION.position.create_at</code>. */
  public void setCreateAt(LocalDateTime value) {
    set(1, value);
  }

  /** Getter for <code>SION.position.create_at</code>. */
  public LocalDateTime getCreateAt() {
    return (LocalDateTime) get(1);
  }

  /** Setter for <code>SION.position.updated_at</code>. */
  public void setUpdatedAt(LocalDateTime value) {
    set(2, value);
  }

  /** Getter for <code>SION.position.updated_at</code>. */
  public LocalDateTime getUpdatedAt() {
    return (LocalDateTime) get(2);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  @Override
  public Record1<String> key() {
    return (Record1) super.key();
  }

  // -------------------------------------------------------------------------
  // Record3 type implementation
  // -------------------------------------------------------------------------

  @Override
  public Row3<String, LocalDateTime, LocalDateTime> fieldsRow() {
    return (Row3) super.fieldsRow();
  }

  @Override
  public Row3<String, LocalDateTime, LocalDateTime> valuesRow() {
    return (Row3) super.valuesRow();
  }

  @Override
  public Field<String> field1() {
    return Position.POSITION.POSITION_NAME;
  }

  @Override
  public Field<LocalDateTime> field2() {
    return Position.POSITION.CREATE_AT;
  }

  @Override
  public Field<LocalDateTime> field3() {
    return Position.POSITION.UPDATED_AT;
  }

  @Override
  public String component1() {
    return getPositionName();
  }

  @Override
  public LocalDateTime component2() {
    return getCreateAt();
  }

  @Override
  public LocalDateTime component3() {
    return getUpdatedAt();
  }

  @Override
  public String value1() {
    return getPositionName();
  }

  @Override
  public LocalDateTime value2() {
    return getCreateAt();
  }

  @Override
  public LocalDateTime value3() {
    return getUpdatedAt();
  }

  @Override
  public PositionRecord value1(String value) {
    setPositionName(value);
    return this;
  }

  @Override
  public PositionRecord value2(LocalDateTime value) {
    setCreateAt(value);
    return this;
  }

  @Override
  public PositionRecord value3(LocalDateTime value) {
    setUpdatedAt(value);
    return this;
  }

  @Override
  public PositionRecord values(String value1, LocalDateTime value2, LocalDateTime value3) {
    value1(value1);
    value2(value2);
    value3(value3);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /** Create a detached PositionRecord */
  public PositionRecord() {
    super(Position.POSITION);
  }

  /** Create a detached, initialised PositionRecord */
  public PositionRecord(String positionName, LocalDateTime createAt, LocalDateTime updatedAt) {
    super(Position.POSITION);

    setPositionName(positionName);
    setCreateAt(createAt);
    setUpdatedAt(updatedAt);
    resetChangedOnNotNull();
  }

  /** Create a detached, initialised PositionRecord */
  public PositionRecord(com.example.jooq.generated.tables.pojos.Position value) {
    super(Position.POSITION);

    if (value != null) {
      setPositionName(value.getPositionName());
      setCreateAt(value.getCreateAt());
      setUpdatedAt(value.getUpdatedAt());
      resetChangedOnNotNull();
    }
  }
}
