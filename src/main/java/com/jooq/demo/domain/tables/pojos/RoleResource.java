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
public class RoleResource implements Serializable {

    private static final long serialVersionUID = 405260005;

    private Integer  id;
    private Integer  roleId;
    private Integer  resourceId;
    private DateTime createTime;
    private DateTime updateTime;

    public RoleResource() {}

    public RoleResource(RoleResource value) {
        this.id = value.id;
        this.roleId = value.roleId;
        this.resourceId = value.resourceId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public RoleResource(
        Integer  id,
        Integer  roleId,
        Integer  resourceId,
        DateTime createTime,
        DateTime updateTime
    ) {
        this.id = id;
        this.roleId = roleId;
        this.resourceId = resourceId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public RoleResource setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public RoleResource setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public Integer getResourceId() {
        return this.resourceId;
    }

    public RoleResource setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public DateTime getCreateTime() {
        return this.createTime;
    }

    public RoleResource setCreateTime(DateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    public DateTime getUpdateTime() {
        return this.updateTime;
    }

    public RoleResource setUpdateTime(DateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RoleResource (");

        sb.append(id);
        sb.append(", ").append(roleId);
        sb.append(", ").append(resourceId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
