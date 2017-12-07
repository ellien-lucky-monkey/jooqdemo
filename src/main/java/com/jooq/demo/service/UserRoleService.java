package com.jooq.demo.service;

import com.jooq.demo.domain.tables.pojos.UserRole;
import com.jooq.demo.repository.user.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ellien
 * @package com.jooq.demo.service
 * @date 2017/12/01 18:23
 */
@Service
public class UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Transactional
    public Integer insert(UserRole userRole) {
        return userRoleRepository.insertAndReturnId(userRole);
    }

}
