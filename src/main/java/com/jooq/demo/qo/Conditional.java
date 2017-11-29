package com.jooq.demo.qo;

import org.jooq.Condition;

import java.util.List;

import static org.jooq.impl.DSL.trueCondition;

/**
 * @author ellien
 * @package com.jooq.demo.qo
 * @date 2017/11/29 15:37
 */
public interface Conditional {

    List<Condition> conditions();

    default Condition toCondition() {
        return conditions().stream().reduce(Condition::and).orElse(trueCondition());
    }
}
