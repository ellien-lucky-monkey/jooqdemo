/*
 * This file is generated by jOOQ.
*/
package com.jooq.demo.domain.tables;


import com.jooq.demo.converter.TimestampConverter;
import com.jooq.demo.domain.Keys;
import com.jooq.demo.domain.Test;
import com.jooq.demo.domain.tables.records.UserRoleRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class UserRole extends TableImpl<UserRoleRecord> {

    private static final long serialVersionUID = 1928245943;

    /**
     * The reference instance of <code>test.user_role</code>
     */
    public static final UserRole USER_ROLE = new UserRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRoleRecord> getRecordType() {
        return UserRoleRecord.class;
    }

    /**
     * The column <code>test.user_role.id</code>.
     */
    public final TableField<UserRoleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.user_role.role_id</code>.
     */
    public final TableField<UserRoleRecord, Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.user_role.user_id</code>.
     */
    public final TableField<UserRoleRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.user_role.create_time</code>.
     */
    public final TableField<UserRoleRecord, DateTime> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "", new TimestampConverter());

    /**
     * The column <code>test.user_role.update_time</code>.
     */
    public final TableField<UserRoleRecord, DateTime> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "", new TimestampConverter());

    /**
     * Create a <code>test.user_role</code> table reference
     */
    public UserRole() {
        this("user_role", null);
    }

    /**
     * Create an aliased <code>test.user_role</code> table reference
     */
    public UserRole(String alias) {
        this(alias, USER_ROLE);
    }

    private UserRole(String alias, Table<UserRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRole(String alias, Table<UserRoleRecord> aliased, Field<?>[] parameters) {
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
    public Identity<UserRoleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRoleRecord> getPrimaryKey() {
        return Keys.KEY_USER_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRoleRecord>>asList(Keys.KEY_USER_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UserRoleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserRoleRecord, ?>>asList(Keys.USER_ROLE_IBFK_2, Keys.USER_ROLE_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRole as(String alias) {
        return new UserRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRole rename(String name) {
        return new UserRole(name, null);
    }
}