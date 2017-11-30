package com.jooq.demo.repository.admin;

import com.jooq.demo.domain.tables.pojos.Admin;
import com.jooq.demo.domain.tables.records.AdminRecord;
import com.jooq.demo.qo.AdminQO;
import com.jooq.demo.repository.AbstractSingleRepository;
import org.apache.commons.lang3.tuple.Pair;
import org.jooq.Table;
import org.jooq.UpdatableRecord;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author ellien
 * @package com.jooq.demo.repository.admin
 * @date 2017/11/29 15:32
 */
@Repository
public class AdminRepository extends AbstractSingleRepository<Admin> {
    @Override
    protected Pair<Class<Admin>, Table<? extends UpdatableRecord>> mapping() {
        return Pair.of(Admin.class, ADMIN);
    }

    public Admin findById(Integer id) {
        AdminQO query = AdminQO.builder().id(id).build();
        return dsl.select().from(ADMIN).where(query.conditions()).fetchOneInto(Admin.class);
    }

    public Map<String, Admin> findByUsername(String username) {
        return dsl.select().from(ADMIN).where(ADMIN.USERNAME.eq(username)).fetchMap(ADMIN.USERNAME, Admin.class);
    }

    public  boolean updateById(Admin admin) {
        return dsl.update(ADMIN).set(ADMIN.USERNAME, admin.getUsername())
                .set(ADMIN.NICK_NAME, admin.getNickName())
                .where(ADMIN.ID.eq(admin.getId()))
                .execute() == 1;
    }

    public Integer insertOne(Admin admin) {
        AdminRecord adminRecord= dsl.insertInto(ADMIN, ADMIN.USERNAME, ADMIN.NICK_NAME)
                .values(admin.getUsername(), admin.getNickName())
                .returning(ADMIN.ID)
                .fetchOne();
        return adminRecord.getId();
    }
}
