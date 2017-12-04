/*
 * This file is generated by jOOQ.
*/
package com.jooq.demo.domain.tables;


import com.jooq.demo.converter.TimestampConverter;
import com.jooq.demo.domain.Keys;
import com.jooq.demo.domain.Test;
import com.jooq.demo.domain.tables.records.ResourceRecord;

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
public class Resource extends TableImpl<ResourceRecord> {

    private static final long serialVersionUID = 820417564;

    /**
     * The reference instance of <code>test.resource</code>
     */
    public static final Resource RESOURCE = new Resource();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResourceRecord> getRecordType() {
        return ResourceRecord.class;
    }

    /**
     * The column <code>test.resource.id</code>.
     */
    public final TableField<ResourceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.resource.parent_id</code>.
     */
    public final TableField<ResourceRecord, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.resource.parent_ids</code>.
     */
    public final TableField<ResourceRecord, String> PARENT_IDS = createField("parent_ids", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>test.resource.name</code>.
     */
    public final TableField<ResourceRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>test.resource.url</code>.
     */
    public final TableField<ResourceRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>test.resource.status</code>.
     */
    public final TableField<ResourceRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>test.resource.create_time</code>.
     */
    public final TableField<ResourceRecord, DateTime> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "", new TimestampConverter());

    /**
     * The column <code>test.resource.update_time</code>.
     */
    public final TableField<ResourceRecord, DateTime> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "", new TimestampConverter());

    /**
     * Create a <code>test.resource</code> table reference
     */
    public Resource() {
        this("resource", null);
    }

    /**
     * Create an aliased <code>test.resource</code> table reference
     */
    public Resource(String alias) {
        this(alias, RESOURCE);
    }

    private Resource(String alias, Table<ResourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Resource(String alias, Table<ResourceRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ResourceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ResourceRecord> getPrimaryKey() {
        return Keys.KEY_RESOURCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ResourceRecord>> getKeys() {
        return Arrays.<UniqueKey<ResourceRecord>>asList(Keys.KEY_RESOURCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Resource as(String alias) {
        return new Resource(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Resource rename(String name) {
        return new Resource(name, null);
    }
}
