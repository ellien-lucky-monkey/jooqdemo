/*
 * This file is generated by jOOQ.
*/
package com.jooq.demo.domain.tables.records;


import com.jooq.demo.domain.tables.Admin;

import javax.annotation.Generated;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class AdminRecord extends UpdatableRecordImpl<AdminRecord> implements Record8<Integer, String, String, String, String, Integer, DateTime, DateTime> {

    private static final long serialVersionUID = 1349378881;

    /**
     * Setter for <code>test.admin.id</code>.
     */
    public AdminRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>test.admin.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.admin.username</code>.
     */
    public AdminRecord setUsername(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>test.admin.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.admin.password</code>.
     */
    public AdminRecord setPassword(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>test.admin.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>test.admin.nick_name</code>.
     */
    public AdminRecord setNickName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>test.admin.nick_name</code>.
     */
    public String getNickName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>test.admin.address</code>.
     */
    public AdminRecord setAddress(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>test.admin.address</code>.
     */
    public String getAddress() {
        return (String) get(4);
    }

    /**
     * Setter for <code>test.admin.is_del</code>.
     */
    public AdminRecord setIsDel(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>test.admin.is_del</code>.
     */
    public Integer getIsDel() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>test.admin.created_time</code>.
     */
    public AdminRecord setCreatedTime(DateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>test.admin.created_time</code>.
     */
    public DateTime getCreatedTime() {
        return (DateTime) get(6);
    }

    /**
     * Setter for <code>test.admin.updated_time</code>.
     */
    public AdminRecord setUpdatedTime(DateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>test.admin.updated_time</code>.
     */
    public DateTime getUpdatedTime() {
        return (DateTime) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, Integer, DateTime, DateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, Integer, DateTime, DateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Admin.ADMIN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Admin.ADMIN.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Admin.ADMIN.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Admin.ADMIN.NICK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Admin.ADMIN.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Admin.ADMIN.IS_DEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DateTime> field7() {
        return Admin.ADMIN.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DateTime> field8() {
        return Admin.ADMIN.UPDATED_TIME;
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
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNickName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getIsDel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DateTime value7() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DateTime value8() {
        return getUpdatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord value4(String value) {
        setNickName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord value5(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord value6(Integer value) {
        setIsDel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord value7(DateTime value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord value8(DateTime value) {
        setUpdatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, DateTime value7, DateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdminRecord
     */
    public AdminRecord() {
        super(Admin.ADMIN);
    }

    /**
     * Create a detached, initialised AdminRecord
     */
    public AdminRecord(Integer id, String username, String password, String nickName, String address, Integer isDel, DateTime createdTime, DateTime updatedTime) {
        super(Admin.ADMIN);

        set(0, id);
        set(1, username);
        set(2, password);
        set(3, nickName);
        set(4, address);
        set(5, isDel);
        set(6, createdTime);
        set(7, updatedTime);
    }
}
