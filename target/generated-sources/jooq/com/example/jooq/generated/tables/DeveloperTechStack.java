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
import com.example.jooq.generated.tables.records.DeveloperTechStackRecord;

/** This class is generated by jOOQ. */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DeveloperTechStack extends TableImpl<DeveloperTechStackRecord> {

  private static final long serialVersionUID = 1L;

  /** The reference instance of <code>SION.developer_tech_stack</code> */
  public static final DeveloperTechStack DEVELOPER_TECH_STACK = new DeveloperTechStack();

  /** The class holding records for this type */
  @Override
  public Class<DeveloperTechStackRecord> getRecordType() {
    return DeveloperTechStackRecord.class;
  }

  /** The column <code>SION.developer_tech_stack.developer_tech_stack_id</code>. */
  public final TableField<DeveloperTechStackRecord, Long> DEVELOPER_TECH_STACK_ID =
      createField(
          DSL.name("developer_tech_stack_id"), SQLDataType.BIGINT.nullable(false), this, "");

  /** The column <code>SION.developer_tech_stack.tech_stack_total_scores</code>. */
  public final TableField<DeveloperTechStackRecord, Integer> TECH_STACK_TOTAL_SCORES =
      createField(
          DSL.name("tech_stack_total_scores"), SQLDataType.INTEGER.nullable(false), this, "");

  /** The column <code>SION.developer_tech_stack.employee_identification_number</code>. */
  public final TableField<DeveloperTechStackRecord, String> EMPLOYEE_IDENTIFICATION_NUMBER =
      createField(
          DSL.name("employee_identification_number"),
          SQLDataType.VARCHAR(30).nullable(false),
          this,
          "");

  /** The column <code>SION.developer_tech_stack.tech_stack_name</code>. */
  public final TableField<DeveloperTechStackRecord, String> TECH_STACK_NAME =
      createField(DSL.name("tech_stack_name"), SQLDataType.VARCHAR(30).nullable(false), this, "");

  /** The column <code>SION.developer_tech_stack.created_at</code>. */
  public final TableField<DeveloperTechStackRecord, LocalDateTime> CREATED_AT =
      createField(
          DSL.name("created_at"),
          SQLDataType.LOCALDATETIME(0)
              .nullable(false)
              .defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)),
          this,
          "");

  /** The column <code>SION.developer_tech_stack.updated_at</code>. */
  public final TableField<DeveloperTechStackRecord, LocalDateTime> UPDATED_AT =
      createField(
          DSL.name("updated_at"),
          SQLDataType.LOCALDATETIME(0)
              .nullable(false)
              .defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)),
          this,
          "");

  private DeveloperTechStack(Name alias, Table<DeveloperTechStackRecord> aliased) {
    this(alias, aliased, null);
  }

  private DeveloperTechStack(
      Name alias, Table<DeveloperTechStackRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /** Create an aliased <code>SION.developer_tech_stack</code> table reference */
  public DeveloperTechStack(String alias) {
    this(DSL.name(alias), DEVELOPER_TECH_STACK);
  }

  /** Create an aliased <code>SION.developer_tech_stack</code> table reference */
  public DeveloperTechStack(Name alias) {
    this(alias, DEVELOPER_TECH_STACK);
  }

  /** Create a <code>SION.developer_tech_stack</code> table reference */
  public DeveloperTechStack() {
    this(DSL.name("developer_tech_stack"), null);
  }

  public <O extends Record> DeveloperTechStack(
      Table<O> child, ForeignKey<O, DeveloperTechStackRecord> key) {
    super(child, key, DEVELOPER_TECH_STACK);
  }

  @Override
  public Schema getSchema() {
    return aliased() ? null : Sion.SION;
  }

  @Override
  public UniqueKey<DeveloperTechStackRecord> getPrimaryKey() {
    return Keys.KEY_DEVELOPER_TECH_STACK_PRIMARY;
  }

  @Override
  public List<ForeignKey<DeveloperTechStackRecord, ?>> getReferences() {
    return Arrays.asList(
        Keys.FK_DEVELOPER_TO_DEVELOPER_TECH_STACK_1, Keys.FK_TECH_STACK_TO_DEVELOPER_TECH_STACK_1);
  }

  private transient Member _member;
  private transient TechStack _techStack;

  /** Get the implicit join path to the <code>SION.member</code> table. */
  public Member member() {
    if (_member == null) _member = new Member(this, Keys.FK_DEVELOPER_TO_DEVELOPER_TECH_STACK_1);

    return _member;
  }

  /** Get the implicit join path to the <code>SION.tech_stack</code> table. */
  public TechStack techStack() {
    if (_techStack == null)
      _techStack = new TechStack(this, Keys.FK_TECH_STACK_TO_DEVELOPER_TECH_STACK_1);

    return _techStack;
  }

  @Override
  public DeveloperTechStack as(String alias) {
    return new DeveloperTechStack(DSL.name(alias), this);
  }

  @Override
  public DeveloperTechStack as(Name alias) {
    return new DeveloperTechStack(alias, this);
  }

  @Override
  public DeveloperTechStack as(Table<?> alias) {
    return new DeveloperTechStack(alias.getQualifiedName(), this);
  }

  /** Rename this table */
  @Override
  public DeveloperTechStack rename(String name) {
    return new DeveloperTechStack(DSL.name(name), null);
  }

  /** Rename this table */
  @Override
  public DeveloperTechStack rename(Name name) {
    return new DeveloperTechStack(name, null);
  }

  /** Rename this table */
  @Override
  public DeveloperTechStack rename(Table<?> name) {
    return new DeveloperTechStack(name.getQualifiedName(), null);
  }

  // -------------------------------------------------------------------------
  // Row6 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row6<Long, Integer, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
    return (Row6) super.fieldsRow();
  }

  /** Convenience mapping calling {@link SelectField#convertFrom(Function)}. */
  public <U> SelectField<U> mapping(
      Function6<
              ? super Long,
              ? super Integer,
              ? super String,
              ? super String,
              ? super LocalDateTime,
              ? super LocalDateTime,
              ? extends U>
          from) {
    return convertFrom(Records.mapping(from));
  }

  /** Convenience mapping calling {@link SelectField#convertFrom(Class, Function)}. */
  public <U> SelectField<U> mapping(
      Class<U> toType,
      Function6<
              ? super Long,
              ? super Integer,
              ? super String,
              ? super String,
              ? super LocalDateTime,
              ? super LocalDateTime,
              ? extends U>
          from) {
    return convertFrom(toType, Records.mapping(from));
  }
}
