package com.jooq.demo.repository.user;

import com.jooq.demo.domain.tables.pojos.UserRole;
import com.jooq.demo.repository.AbstractSingleRepository;
import org.apache.commons.lang3.tuple.Pair;
import org.jooq.Table;
import org.jooq.UpdatableRecord;
import org.springframework.stereotype.Repository;
import static com.jooq.demo.domain.Tables.USER_ROLE;

/**
 * @author ellien
 * @package com.jooq.demo.repository.user
 * @date 2017/12/01 18:16
 */
@Repository
public class UserRoleRepository extends AbstractSingleRepository<UserRole> {

    @Override
    protected Pair<Class<UserRole>, Table<? extends UpdatableRecord>> mapping() {
        return Pair.of(UserRole.class, USER_ROLE);
    }

}
