/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.tables;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import com.example.jooq.generated.Keys;
import com.example.jooq.generated.Sion;
import com.example.jooq.generated.tables.records.UserTrainingHistoryRecord;

/** This class is generated by jOOQ. */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UserTrainingHistory extends TableImpl<UserTrainingHistoryRecord> {

  private static final long serialVersionUID = 1L;

  /** The reference instance of <code>SION.user_training_history</code> */
  public static final UserTrainingHistory USER_TRAINING_HISTORY = new UserTrainingHistory();

  /** The class holding records for this type */
  @Override
  public Class<UserTrainingHistoryRecord> getRecordType() {
    return UserTrainingHistoryRecord.class;
  }

  /** The column <code>SION.user_training_history.user_trainig_history_id</code>. */
  public final TableField<UserTrainingHistoryRecord, Long> USER_TRAINIG_HISTORY_ID =
      createField(
          DSL.name("user_trainig_history_id"), SQLDataType.BIGINT.nullable(false), this, "");

  /** The column <code>SION.user_training_history.created_at</code>. */
  public final TableField<UserTrainingHistoryRecord, LocalDateTime> CREATED_AT =
      createField(
          DSL.name("created_at"),
          SQLDataType.LOCALDATETIME(0)
              .nullable(false)
              .defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)),
          this,
          "");

  /** The column <code>SION.user_training_history.updated_at</code>. */
  public final TableField<UserTrainingHistoryRecord, LocalDateTime> UPDATED_AT =
      createField(
          DSL.name("updated_at"),
          SQLDataType.LOCALDATETIME(0)
              .nullable(false)
              .defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)),
          this,
          "");

  /** The column <code>SION.user_training_history.updated_by</code>. */
  public final TableField<UserTrainingHistoryRecord, String> UPDATED_BY =
      createField(DSL.name("updated_by"), SQLDataType.VARCHAR(30).nullable(false), this, "");

  /** The column <code>SION.user_training_history.training_name</code>. */
  public final TableField<UserTrainingHistoryRecord, String> TRAINING_NAME =
      createField(DSL.name("training_name"), SQLDataType.VARCHAR(100).nullable(false), this, "");

  /** The column <code>SION.user_training_history.employee_identification_number</code>. */
  public final TableField<UserTrainingHistoryRecord, String> EMPLOYEE_IDENTIFICATION_NUMBER =
      createField(
          DSL.name("employee_identification_number"),
          SQLDataType.VARCHAR(30).nullable(false),
          this,
          "");

  private UserTrainingHistory(Name alias, Table<UserTrainingHistoryRecord> aliased) {
    this(alias, aliased, null);
  }

  private UserTrainingHistory(
      Name alias, Table<UserTrainingHistoryRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /** Create an aliased <code>SION.user_training_history</code> table reference */
  public UserTrainingHistory(String alias) {
    this(DSL.name(alias), USER_TRAINING_HISTORY);
  }

  /** Create an aliased <code>SION.user_training_history</code> table reference */
  public UserTrainingHistory(Name alias) {
    this(alias, USER_TRAINING_HISTORY);
  }

  /** Create a <code>SION.user_training_history</code> table reference */
  public UserTrainingHistory() {
    this(DSL.name("user_training_history"), null);
  }

  public <O extends Record> UserTrainingHistory(
      Table<O> child, ForeignKey<O, UserTrainingHistoryRecord> key) {
    super(child, key, USER_TRAINING_HISTORY);
  }

  @Override
  public Schema getSchema() {
    return aliased() ? null : Sion.SION;
  }

  @Override
  public UniqueKey<UserTrainingHistoryRecord> getPrimaryKey() {
    return Keys.KEY_USER_TRAINING_HISTORY_PRIMARY;
  }

  @Override
  public List<ForeignKey<UserTrainingHistoryRecord, ?>> getReferences() {
    return Arrays.asList(
        Keys.FK_DEVELOPER_TO_USER_TRAINING_HISTORY_1,
        Keys.FK_TRAINING_PROGRAM_TO_USER_TRAINING_HISTORY_1,
        Keys.FK_DEVELOPER_TO_USER_TRAINING_HISTORY_2);
  }

  private transient Member _fkDeveloperToUserTrainingHistory_1;
  private transient TrainingProgram _trainingProgram;
  private transient Member _fkDeveloperToUserTrainingHistory_2;

  /**
   * Get the implicit join path to the <code>SION.member</code> table, via the <code>
   * FK_developer_TO_user_training_history_1</code> key.
   */
  public Member fkDeveloperToUserTrainingHistory_1() {
    if (_fkDeveloperToUserTrainingHistory_1 == null)
      _fkDeveloperToUserTrainingHistory_1 =
          new Member(this, Keys.FK_DEVELOPER_TO_USER_TRAINING_HISTORY_1);

    return _fkDeveloperToUserTrainingHistory_1;
  }

  /** Get the implicit join path to the <code>SION.training_program</code> table. */
  public TrainingProgram trainingProgram() {
    if (_trainingProgram == null)
      _trainingProgram =
          new TrainingProgram(this, Keys.FK_TRAINING_PROGRAM_TO_USER_TRAINING_HISTORY_1);

    return _trainingProgram;
  }

  /**
   * Get the implicit join path to the <code>SION.member</code> table, via the <code>
   * FK_developer_TO_user_training_history_2</code> key.
   */
  public Member fkDeveloperToUserTrainingHistory_2() {
    if (_fkDeveloperToUserTrainingHistory_2 == null)
      _fkDeveloperToUserTrainingHistory_2 =
          new Member(this, Keys.FK_DEVELOPER_TO_USER_TRAINING_HISTORY_2);

    return _fkDeveloperToUserTrainingHistory_2;
  }

  @Override
  public UserTrainingHistory as(String alias) {
    return new UserTrainingHistory(DSL.name(alias), this);
  }

  @Override
  public UserTrainingHistory as(Name alias) {
    return new UserTrainingHistory(alias, this);
  }

  @Override
  public UserTrainingHistory as(Table<?> alias) {
    return new UserTrainingHistory(alias.getQualifiedName(), this);
  }

  /** Rename this table */
  @Override
  public UserTrainingHistory rename(String name) {
    return new UserTrainingHistory(DSL.name(name), null);
  }

  /** Rename this table */
  @Override
  public UserTrainingHistory rename(Name name) {
    return new UserTrainingHistory(name, null);
  }

  /** Rename this table */
  @Override
  public UserTrainingHistory rename(Table<?> name) {
    return new UserTrainingHistory(name.getQualifiedName(), null);
  }

  // -------------------------------------------------------------------------
  // Row6 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row6<Long, LocalDateTime, LocalDateTime, String, String, String> fieldsRow() {
    return (Row6) super.fieldsRow();
  }

  /** Convenience mapping calling {@link SelectField#convertFrom(Function)}. */
  public <U> SelectField<U> mapping(
      Function6<
              ? super Long,
              ? super LocalDateTime,
              ? super LocalDateTime,
              ? super String,
              ? super String,
              ? super String,
              ? extends U>
          from) {
    return convertFrom(Records.mapping(from));
  }

  /** Convenience mapping calling {@link SelectField#convertFrom(Class, Function)}. */
  public <U> SelectField<U> mapping(
      Class<U> toType,
      Function6<
              ? super Long,
              ? super LocalDateTime,
              ? super LocalDateTime,
              ? super String,
              ? super String,
              ? super String,
              ? extends U>
          from) {
    return convertFrom(toType, Records.mapping(from));
  }
}
