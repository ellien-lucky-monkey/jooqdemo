package com.jooq.demo.service;


import com.jooq.demo.domain.tables.pojos.Role;
import com.jooq.demo.repository.user.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ellien
 * @package com.jooq.demo.service
 * @date 2017/12/01 18:23
 */
@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> findByUserId(Integer userId){
        return roleRepository.findByUserId(userId);
    }
}
