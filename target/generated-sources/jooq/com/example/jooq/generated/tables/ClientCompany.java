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
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
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
import com.example.jooq.generated.tables.records.ClientCompanyRecord;

/** This class is generated by jOOQ. */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ClientCompany extends TableImpl<ClientCompanyRecord> {

  private static final long serialVersionUID = 1L;

  /** The reference instance of <code>SION.client_company</code> */
  public static final ClientCompany CLIENT_COMPANY = new ClientCompany();

  /** The class holding records for this type */
  @Override
  public Class<ClientCompanyRecord> getRecordType() {
    return ClientCompanyRecord.class;
  }

  /** The column <code>SION.client_company.client_code</code>. */
  public final TableField<ClientCompanyRecord, String> CLIENT_CODE =
      createField(DSL.name("client_code"), SQLDataType.VARCHAR(30).nullable(false), this, "");

  /** The column <code>SION.client_company.company_name</code>. */
  public final TableField<ClientCompanyRecord, String> COMPANY_NAME =
      createField(
          DSL.name("company_name"),
          SQLDataType.VARCHAR(255).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)),
          this,
          "");

  /** The column <code>SION.client_company.created_at</code>. */
  public final TableField<ClientCompanyRecord, LocalDateTime> CREATED_AT =
      createField(
          DSL.name("created_at"),
          SQLDataType.LOCALDATETIME(0)
              .nullable(false)
              .defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)),
          this,
          "");

  /** The column <code>SION.client_company.updated_at</code>. */
  public final TableField<ClientCompanyRecord, LocalDateTime> UPDATED_AT =
      createField(
          DSL.name("updated_at"),
          SQLDataType.LOCALDATETIME(0)
              .nullable(false)
              .defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)),
          this,
          "");

  /** The column <code>SION.client_company.contact_person</code>. */
  public final TableField<ClientCompanyRecord, String> CONTACT_PERSON =
      createField(
          DSL.name("contact_person"),
          SQLDataType.VARCHAR(10).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)),
          this,
          "");

  /** The column <code>SION.client_company.email</code>. */
  public final TableField<ClientCompanyRecord, String> EMAIL =
      createField(
          DSL.name("email"),
          SQLDataType.VARCHAR(30).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)),
          this,
          "");

  /** The column <code>SION.client_company.contact_number</code>. */
  public final TableField<ClientCompanyRecord, String> CONTACT_NUMBER =
      createField(
          DSL.name("contact_number"),
          SQLDataType.VARCHAR(21).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)),
          this,
          "");

  /** The column <code>SION.client_company.domain_name</code>. */
  public final TableField<ClientCompanyRecord, String> DOMAIN_NAME =
      createField(DSL.name("domain_name"), SQLDataType.VARCHAR(30).nullable(false), this, "");

  private ClientCompany(Name alias, Table<ClientCompanyRecord> aliased) {
    this(alias, aliased, null);
  }

  private ClientCompany(Name alias, Table<ClientCompanyRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /** Create an aliased <code>SION.client_company</code> table reference */
  public ClientCompany(String alias) {
    this(DSL.name(alias), CLIENT_COMPANY);
  }

  /** Create an aliased <code>SION.client_company</code> table reference */
  public ClientCompany(Name alias) {
    this(alias, CLIENT_COMPANY);
  }

  /** Create a <code>SION.client_company</code> table reference */
  public ClientCompany() {
    this(DSL.name("client_company"), null);
  }

  public <O extends Record> ClientCompany(Table<O> child, ForeignKey<O, ClientCompanyRecord> key) {
    super(child, key, CLIENT_COMPANY);
  }

  @Override
  public Schema getSchema() {
    return aliased() ? null : Sion.SION;
  }

  @Override
  public UniqueKey<ClientCompanyRecord> getPrimaryKey() {
    return Keys.KEY_CLIENT_COMPANY_PRIMARY;
  }

  @Override
  public List<ForeignKey<ClientCompanyRecord, ?>> getReferences() {
    return Arrays.asList(Keys.FK_DOMAIN_TO_CLIENT_COMPANY_1);
  }

  private transient Domain _domain;

  /** Get the implicit join path to the <code>SION.domain</code> table. */
  public Domain domain() {
    if (_domain == null) _domain = new Domain(this, Keys.FK_DOMAIN_TO_CLIENT_COMPANY_1);

    return _domain;
  }

  @Override
  public ClientCompany as(String alias) {
    return new ClientCompany(DSL.name(alias), this);
  }

  @Override
  public ClientCompany as(Name alias) {
    return new ClientCompany(alias, this);
  }

  @Override
  public ClientCompany as(Table<?> alias) {
    return new ClientCompany(alias.getQualifiedName(), this);
  }

  /** Rename this table */
  @Override
  public ClientCompany rename(String name) {
    return new ClientCompany(DSL.name(name), null);
  }

  /** Rename this table */
  @Override
  public ClientCompany rename(Name name) {
    return new ClientCompany(name, null);
  }

  /** Rename this table */
  @Override
  public ClientCompany rename(Table<?> name) {
    return new ClientCompany(name.getQualifiedName(), null);
  }

  // -------------------------------------------------------------------------
  // Row8 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row8<String, String, LocalDateTime, LocalDateTime, String, String, String, String>
      fieldsRow() {
    return (Row8) super.fieldsRow();
  }

  /** Convenience mapping calling {@link SelectField#convertFrom(Function)}. */
  public <U> SelectField<U> mapping(
      Function8<
              ? super String,
              ? super String,
              ? super LocalDateTime,
              ? super LocalDateTime,
              ? super String,
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
      Function8<
              ? super String,
              ? super String,
              ? super LocalDateTime,
              ? super LocalDateTime,
              ? super String,
              ? super String,
              ? super String,
              ? super String,
              ? extends U>
          from) {
    return convertFrom(toType, Records.mapping(from));
  }
}
