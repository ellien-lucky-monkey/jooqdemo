package com.jooq.demo.qo;

import com.google.common.collect.Lists;
import lombok.Builder;
import lombok.Getter;
import org.jooq.Condition;

import java.util.List;

import static com.jooq.demo.config.TableConstants.ADMIN;

/**
 * @author ellien
 * @package com.jooq.demo.qo
 * @date 2017/11/29 15:35
 */
@Getter
@Builder
public class AdminQO implements Conditional {

    private Integer id;
    private String username;
    private String password;
    private String nickName;
    @Override
    public List<Condition> conditions() {
        List<Condition> conditions = Lists.newArrayList();
        if(id != null){
            conditions.add(ADMIN.ID.eq(id));
        }
        if(username != null){
            conditions.add(ADMIN.USERNAME.eq(username));
        }
        if(password != null){
            conditions.add(ADMIN.PASSWORD.eq(password));
        }
        if(nickName != null){
            conditions.add(ADMIN.NICK_NAME.eq(nickName));
        }
        return conditions;
    }
}
