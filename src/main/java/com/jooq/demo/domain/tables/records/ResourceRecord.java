/*
 * This file is generated by jOOQ.
*/
package com.jooq.demo.domain.tables.records;


import com.jooq.demo.domain.tables.Resource;

import javax.annotation.Generated;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ResourceRecord extends UpdatableRecordImpl<ResourceRecord> implements Record9<Integer, Integer, String, String, String, Integer, DateTime, DateTime, String> {

    private static final long serialVersionUID = 193901105;

    /**
     * Setter for <code>test.resource.id</code>.
     */
    public ResourceRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>test.resource.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.resource.parent_id</code>.
     */
    public ResourceRecord setParentId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>test.resource.parent_id</code>.
     */
    public Integer getParentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>test.resource.parent_ids</code>.
     */
    public ResourceRecord setParentIds(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>test.resource.parent_ids</code>.
     */
    public String getParentIds() {
        return (String) get(2);
    }

    /**
     * Setter for <code>test.resource.name</code>.
     */
    public ResourceRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>test.resource.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>test.resource.url</code>.
     */
    public ResourceRecord setUrl(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>test.resource.url</code>.
     */
    public String getUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>test.resource.status</code>.
     */
    public ResourceRecord setStatus(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>test.resource.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>test.resource.create_time</code>.
     */
    public ResourceRecord setCreateTime(DateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>test.resource.create_time</code>.
     */
    public DateTime getCreateTime() {
        return (DateTime) get(6);
    }

    /**
     * Setter for <code>test.resource.update_time</code>.
     */
    public ResourceRecord setUpdateTime(DateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>test.resource.update_time</code>.
     */
    public DateTime getUpdateTime() {
        return (DateTime) get(7);
    }

    /**
     * Setter for <code>test.resource.permission</code>.
     */
    public ResourceRecord setPermission(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>test.resource.permission</code>.
     */
    public String getPermission() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, String, String, String, Integer, DateTime, DateTime, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, String, String, String, Integer, DateTime, DateTime, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Resource.RESOURCE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Resource.RESOURCE.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Resource.RESOURCE.PARENT_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Resource.RESOURCE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Resource.RESOURCE.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Resource.RESOURCE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DateTime> field7() {
        return Resource.RESOURCE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DateTime> field8() {
        return Resource.RESOURCE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Resource.RESOURCE.PERMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getParentIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DateTime value7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DateTime value8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPermission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceRecord value2(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceRecord value3(String value) {
        setParentIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceRecord value5(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceRecord value6(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceRecord value7(DateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceRecord value8(DateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceRecord value9(String value) {
        setPermission(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Integer value6, DateTime value7, DateTime value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResourceRecord
     */
    public ResourceRecord() {
        super(Resource.RESOURCE);
    }

    /**
     * Create a detached, initialised ResourceRecord
     */
    public ResourceRecord(Integer id, Integer parentId, String parentIds, String name, String url, Integer status, DateTime createTime, DateTime updateTime, String permission) {
        super(Resource.RESOURCE);

        set(0, id);
        set(1, parentId);
        set(2, parentIds);
        set(3, name);
        set(4, url);
        set(5, status);
        set(6, createTime);
        set(7, updateTime);
        set(8, permission);
    }
}
