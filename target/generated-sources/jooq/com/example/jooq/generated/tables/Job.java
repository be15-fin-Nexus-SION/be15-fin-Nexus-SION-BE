/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.tables;

import java.time.LocalDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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
import com.example.jooq.generated.tables.records.JobRecord;

/** This class is generated by jOOQ. */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Job extends TableImpl<JobRecord> {

  private static final long serialVersionUID = 1L;

  /** The reference instance of <code>SION.job</code> */
  public static final Job JOB = new Job();

  /** The class holding records for this type */
  @Override
  public Class<JobRecord> getRecordType() {
    return JobRecord.class;
  }

  /** The column <code>SION.job.name</code>. */
  public final TableField<JobRecord, String> NAME =
      createField(DSL.name("name"), SQLDataType.VARCHAR(30).nullable(false), this, "");

  /** The column <code>SION.job.created_at</code>. */
  public final TableField<JobRecord, LocalDateTime> CREATED_AT =
      createField(
          DSL.name("created_at"),
          SQLDataType.LOCALDATETIME(0)
              .nullable(false)
              .defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)),
          this,
          "");

  /** The column <code>SION.job.updated_at</code>. */
  public final TableField<JobRecord, LocalDateTime> UPDATED_AT =
      createField(
          DSL.name("updated_at"),
          SQLDataType.LOCALDATETIME(0)
              .nullable(false)
              .defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)),
          this,
          "");

  private Job(Name alias, Table<JobRecord> aliased) {
    this(alias, aliased, null);
  }

  private Job(Name alias, Table<JobRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /** Create an aliased <code>SION.job</code> table reference */
  public Job(String alias) {
    this(DSL.name(alias), JOB);
  }

  /** Create an aliased <code>SION.job</code> table reference */
  public Job(Name alias) {
    this(alias, JOB);
  }

  /** Create a <code>SION.job</code> table reference */
  public Job() {
    this(DSL.name("job"), null);
  }

  public <O extends Record> Job(Table<O> child, ForeignKey<O, JobRecord> key) {
    super(child, key, JOB);
  }

  @Override
  public Schema getSchema() {
    return aliased() ? null : Sion.SION;
  }

  @Override
  public UniqueKey<JobRecord> getPrimaryKey() {
    return Keys.KEY_JOB_PRIMARY;
  }

  @Override
  public Job as(String alias) {
    return new Job(DSL.name(alias), this);
  }

  @Override
  public Job as(Name alias) {
    return new Job(alias, this);
  }

  @Override
  public Job as(Table<?> alias) {
    return new Job(alias.getQualifiedName(), this);
  }

  /** Rename this table */
  @Override
  public Job rename(String name) {
    return new Job(DSL.name(name), null);
  }

  /** Rename this table */
  @Override
  public Job rename(Name name) {
    return new Job(name, null);
  }

  /** Rename this table */
  @Override
  public Job rename(Table<?> name) {
    return new Job(name.getQualifiedName(), null);
  }

  // -------------------------------------------------------------------------
  // Row3 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row3<String, LocalDateTime, LocalDateTime> fieldsRow() {
    return (Row3) super.fieldsRow();
  }

  /** Convenience mapping calling {@link SelectField#convertFrom(Function)}. */
  public <U> SelectField<U> mapping(
      Function3<? super String, ? super LocalDateTime, ? super LocalDateTime, ? extends U> from) {
    return convertFrom(Records.mapping(from));
  }

  /** Convenience mapping calling {@link SelectField#convertFrom(Class, Function)}. */
  public <U> SelectField<U> mapping(
      Class<U> toType,
      Function3<? super String, ? super LocalDateTime, ? super LocalDateTime, ? extends U> from) {
    return convertFrom(toType, Records.mapping(from));
  }
}
