package com.jooq.demo.repository.user;

import com.jooq.demo.domain.tables.pojos.Resource;
import com.jooq.demo.repository.AbstractSingleRepository;
import org.apache.commons.lang3.tuple.Pair;
import org.jooq.Table;
import org.jooq.UpdatableRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.jooq.demo.domain.tables.Resource.RESOURCE;
import static com.jooq.demo.domain.tables.RoleResource.ROLE_RESOURCE;

/**
 * @author ellien
 * @package com.jooq.demo.repository.user
 * @date 2017/12/03 21:00
 */
@Repository
public class ResourceRepository extends AbstractSingleRepository<Resource> {

    @Override
    protected Pair<Class<Resource>, Table<? extends UpdatableRecord>> mapping() {
        return Pair.of(Resource.class, RESOURCE);
    }

    public List<Resource> findByRoleId(Integer roleId) {
        return dsl.select().from(RESOURCE)
                .innerJoin(ROLE_RESOURCE).on(RESOURCE.ID.eq(ROLE_RESOURCE.RESOURCE_ID))
                .where(ROLE_RESOURCE.ROLE_ID.eq(roleId))
                .fetchInto(Resource.class);
    }
}
