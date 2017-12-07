package com.jooq.demo.service;

import com.jooq.demo.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ellien
 * @package com.jooq.demo.service
 * @date 2017/12/01 18:25
 */
@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleService roleService;

}
