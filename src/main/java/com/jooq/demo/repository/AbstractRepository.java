package com.jooq.demo.repository;

import com.jooq.demo.config.DbConstants;
import com.jooq.demo.config.TableConstants;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author ellien
 * @package com.jooq.demo.repository
 * @date 2017/11/29 15:22
 */
public abstract class AbstractRepository implements TableConstants, DbConstants {
    @Autowired
    @Qualifier(DSL_TEST)
    protected DSLContext dsl;
}
