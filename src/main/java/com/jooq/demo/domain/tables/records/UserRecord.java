/*
 * This file is generated by jOOQ.
*/
package com.jooq.demo.domain.tables.records;


import com.jooq.demo.domain.tables.User;

import javax.annotation.Generated;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record11<Integer, String, String, String, String, String, Integer, DateTime, DateTime, Integer, String> {

    private static final long serialVersionUID = -1403659553;

    /**
     * Setter for <code>test.user.id</code>.
     */
    public UserRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>test.user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.user.username</code>.
     */
    public UserRecord setUsername(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>test.user.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.user.sex</code>.
     */
    public UserRecord setSex(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>test.user.sex</code>.
     */
    public String getSex() {
        return (String) get(2);
    }

    /**
     * Setter for <code>test.user.password</code>.
     */
    public UserRecord setPassword(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>test.user.password</code>.
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>test.user.nick_name</code>.
     */
    public UserRecord setNickName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>test.user.nick_name</code>.
     */
    public String getNickName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>test.user.address</code>.
     */
    public UserRecord setAddress(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>test.user.address</code>.
     */
    public String getAddress() {
        return (String) get(5);
    }

    /**
     * Setter for <code>test.user.is_del</code>.
     */
    public UserRecord setIsDel(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>test.user.is_del</code>.
     */
    public Integer getIsDel() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>test.user.created_time</code>.
     */
    public UserRecord setCreatedTime(DateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>test.user.created_time</code>.
     */
    public DateTime getCreatedTime() {
        return (DateTime) get(7);
    }

    /**
     * Setter for <code>test.user.updated_time</code>.
     */
    public UserRecord setUpdatedTime(DateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>test.user.updated_time</code>.
     */
    public DateTime getUpdatedTime() {
        return (DateTime) get(8);
    }

    /**
     * Setter for <code>test.user.type</code>.
     */
    public UserRecord setType(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>test.user.type</code>.
     */
    public Integer getType() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>test.user.mobile</code>.
     */
    public UserRecord setMobile(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>test.user.mobile</code>.
     */
    public String getMobile() {
        return (String) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, String, String, Integer, DateTime, DateTime, Integer, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, String, String, Integer, DateTime, DateTime, Integer, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return User.USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return User.USER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return User.USER.SEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return User.USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return User.USER.NICK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return User.USER.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return User.USER.IS_DEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DateTime> field8() {
        return User.USER.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DateTime> field9() {
        return User.USER.UPDATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return User.USER.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return User.USER.MOBILE;
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
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNickName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getIsDel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DateTime value8() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DateTime value9() {
        return getUpdatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(String value) {
        setSex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value4(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value5(String value) {
        setNickName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value6(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value7(Integer value) {
        setIsDel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value8(DateTime value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value9(DateTime value) {
        setUpdatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value10(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value11(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Integer value7, DateTime value8, DateTime value9, Integer value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer id, String username, String sex, String password, String nickName, String address, Integer isDel, DateTime createdTime, DateTime updatedTime, Integer type, String mobile) {
        super(User.USER);

        set(0, id);
        set(1, username);
        set(2, sex);
        set(3, password);
        set(4, nickName);
        set(5, address);
        set(6, isDel);
        set(7, createdTime);
        set(8, updatedTime);
        set(9, type);
        set(10, mobile);
    }
}
