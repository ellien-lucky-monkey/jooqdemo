package com.jooq.demo.repository.user;

import com.jooq.demo.domain.tables.pojos.User;
import com.jooq.demo.repository.AbstractSingleRepository;
import org.apache.commons.lang3.tuple.Pair;
import org.jooq.Table;
import org.jooq.UpdatableRecord;
import org.springframework.stereotype.Repository;

import static com.jooq.demo.domain.Tables.USER;

/**
 * @author ellien
 * @package com.jooq.demo.repository.user
 * @date 2017/12/01 11:51
 */
@Repository
public class UserRepository extends AbstractSingleRepository<User>{

    @Override
    protected Pair<Class<User>, Table<? extends UpdatableRecord>> mapping() {
        return Pair.of(User.class, USER);
    }

    public User findByUserName(String username){
        return dsl.select().from(USER)
                .where(USER.USERNAME.eq(username))
                .fetchOneInto(User.class);
    }

    public User findByMobile(String mobile){
        return dsl.select().from(USER)
                .where(USER.MOBILE.eq(mobile))
                .fetchOneInto(User.class);
    }

    public User findByUsernameOrMobile(String mobile, String username) {
        return dsl.select().from(USER)
                .where(USER.MOBILE.eq(mobile).or(USER.USERNAME.eq(username)))
                .fetchOneInto(User.class);
    }


}
