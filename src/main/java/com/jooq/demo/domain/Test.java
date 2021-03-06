/*
 * This file is generated by jOOQ.
*/
package com.jooq.demo.domain;


import com.jooq.demo.domain.tables.Admin;
import com.jooq.demo.domain.tables.Resource;
import com.jooq.demo.domain.tables.Role;
import com.jooq.demo.domain.tables.RoleResource;
import com.jooq.demo.domain.tables.User;
import com.jooq.demo.domain.tables.UserRole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Test extends SchemaImpl {

    private static final long serialVersionUID = -887457324;

    /**
     * The reference instance of <code>test</code>
     */
    public static final Test TEST = new Test();

    /**
     * The table <code>test.admin</code>.
     */
    public final Admin ADMIN = com.jooq.demo.domain.tables.Admin.ADMIN;

    /**
     * The table <code>test.resource</code>.
     */
    public final Resource RESOURCE = com.jooq.demo.domain.tables.Resource.RESOURCE;

    /**
     * The table <code>test.role</code>.
     */
    public final Role ROLE = com.jooq.demo.domain.tables.Role.ROLE;

    /**
     * The table <code>test.role_resource</code>.
     */
    public final RoleResource ROLE_RESOURCE = com.jooq.demo.domain.tables.RoleResource.ROLE_RESOURCE;

    /**
     * The table <code>test.user</code>.
     */
    public final User USER = com.jooq.demo.domain.tables.User.USER;

    /**
     * The table <code>test.user_role</code>.
     */
    public final UserRole USER_ROLE = com.jooq.demo.domain.tables.UserRole.USER_ROLE;

    /**
     * No further instances allowed
     */
    private Test() {
        super("test", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Admin.ADMIN,
            Resource.RESOURCE,
            Role.ROLE,
            RoleResource.ROLE_RESOURCE,
            User.USER,
            UserRole.USER_ROLE);
    }
}
