/*
 * This file is generated by jOOQ.
*/
package com.jooq.demo.domain.tables;


import com.jooq.demo.converter.TimestampConverter;
import com.jooq.demo.domain.Keys;
import com.jooq.demo.domain.Test;
import com.jooq.demo.domain.tables.records.AdminRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Admin extends TableImpl<AdminRecord> {

    private static final long serialVersionUID = -1334124603;

    /**
     * The reference instance of <code>test.admin</code>
     */
    public static final Admin ADMIN = new Admin();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminRecord> getRecordType() {
        return AdminRecord.class;
    }

    /**
     * The column <code>test.admin.id</code>.
     */
    public final TableField<AdminRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.admin.username</code>.
     */
    public final TableField<AdminRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(20).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>test.admin.password</code>.
     */
    public final TableField<AdminRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(50).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>test.admin.nick_name</code>.
     */
    public final TableField<AdminRecord, String> NICK_NAME = createField("nick_name", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>test.admin.address</code>.
     */
    public final TableField<AdminRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>test.admin.is_del</code>.
     */
    public final TableField<AdminRecord, Integer> IS_DEL = createField("is_del", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>test.admin.created_time</code>.
     */
    public final TableField<AdminRecord, DateTime> CREATED_TIME = createField("created_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "", new TimestampConverter());

    /**
     * The column <code>test.admin.updated_time</code>.
     */
    public final TableField<AdminRecord, DateTime> UPDATED_TIME = createField("updated_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "", new TimestampConverter());

    /**
     * Create a <code>test.admin</code> table reference
     */
    public Admin() {
        this("admin", null);
    }

    /**
     * Create an aliased <code>test.admin</code> table reference
     */
    public Admin(String alias) {
        this(alias, ADMIN);
    }

    private Admin(String alias, Table<AdminRecord> aliased) {
        this(alias, aliased, null);
    }

    private Admin(String alias, Table<AdminRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AdminRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ADMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AdminRecord> getPrimaryKey() {
        return Keys.KEY_ADMIN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AdminRecord>> getKeys() {
        return Arrays.<UniqueKey<AdminRecord>>asList(Keys.KEY_ADMIN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Admin as(String alias) {
        return new Admin(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Admin rename(String name) {
        return new Admin(name, null);
    }
}
