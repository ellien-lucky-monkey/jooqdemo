package com.jooq.demo.repository.user;

import com.jooq.demo.domain.tables.pojos.Role;
import com.jooq.demo.repository.AbstractSingleRepository;
import org.apache.commons.lang3.tuple.Pair;
import org.jooq.Table;
import org.jooq.UpdatableRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.jooq.demo.domain.Tables.*;

/**
 * @author ellien
 * @package com.jooq.demo.repository.user
 * @date 2017/12/01 18:12
 */
@Repository
public class RoleRepository extends AbstractSingleRepository<Role> {

    @Override
    protected Pair<Class<Role>, Table<? extends UpdatableRecord>> mapping() {
        return Pair.of(Role.class, USER);
    }

    public List<Role> findByUserId(Integer userId) {
        return dsl.select().from(ROLE).innerJoin(USER_ROLE).on(ROLE.ID.eq(USER_ROLE.ROLE_ID))
                .where(USER_ROLE.USER_ID.eq(userId)).fetchInto(Role.class);
    }

    public Role findByName(String name){
        return dsl.select().from(ROLE).where(ROLE.ROLE_NAME.eq(name)).fetchOneInto(Role.class);
    }
}
