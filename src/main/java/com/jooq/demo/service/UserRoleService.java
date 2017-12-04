package com.jooq.demo.service;

import com.jooq.demo.repository.user.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ellien
 * @package com.jooq.demo.service
 * @date 2017/12/01 18:23
 */
@Service
public class UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

}
