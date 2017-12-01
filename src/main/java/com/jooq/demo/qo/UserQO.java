package com.jooq.demo.qo;

import com.google.common.collect.Lists;
import lombok.Builder;
import lombok.Getter;
import org.jooq.Condition;
import org.springframework.util.StringUtils;

import java.util.List;

import static com.jooq.demo.domain.Tables.USER;

/**
 * @author ellien
 * @package com.jooq.demo.qo
 * @date 2017/12/01 13:59
 */
@Getter
@Builder
public class UserQO implements Conditional {

    private Integer  id;
    private String   username;
    private String   nickName;
    private String   address;
    private Integer  isDel;
    private Integer  type;
    private String   mobile;

    @Override
    public List<Condition> conditions() {
        List<Condition> conditions = Lists.newArrayList();
        if (id != null) {
            conditions.add(USER.ID.eq(id));
        }
        if (!StringUtils.isEmpty(username)){
            conditions.add(USER.USERNAME.eq(username));
        }
        if (!StringUtils.isEmpty(mobile)){
            conditions.add(USER.MOBILE.eq(mobile));
        }
        return conditions;
    }
}
