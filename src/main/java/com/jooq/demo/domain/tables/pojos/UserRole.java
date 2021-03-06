/*
 * This file is generated by jOOQ.
*/
package com.jooq.demo.domain.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.joda.time.DateTime;


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
public class UserRole implements Serializable {

    private static final long serialVersionUID = 949088613;

    private Integer  id;
    private Integer  roleId;
    private Integer  userId;
    private DateTime createTime;
    private DateTime updateTime;

    public UserRole() {}

    public UserRole(UserRole value) {
        this.id = value.id;
        this.roleId = value.roleId;
        this.userId = value.userId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public UserRole(
        Integer  id,
        Integer  roleId,
        Integer  userId,
        DateTime createTime,
        DateTime updateTime
    ) {
        this.id = id;
        this.roleId = roleId;
        this.userId = userId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public UserRole setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public UserRole setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public UserRole setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public DateTime getCreateTime() {
        return this.createTime;
    }

    public UserRole setCreateTime(DateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    public DateTime getUpdateTime() {
        return this.updateTime;
    }

    public UserRole setUpdateTime(DateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserRole (");

        sb.append(id);
        sb.append(", ").append(roleId);
        sb.append(", ").append(userId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
