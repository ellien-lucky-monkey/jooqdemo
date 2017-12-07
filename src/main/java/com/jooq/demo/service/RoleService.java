package com.jooq.demo.service;


import com.jooq.demo.domain.tables.pojos.Role;
import com.jooq.demo.domain.tables.pojos.RoleResource;
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

    @Autowired
    private ResourceService resourceService;
    @Autowired
    private RoleResourceService roleResourceService;

    public List<Role> findByUserId(Integer userId){
        return roleRepository.findByUserId(userId);
    }

    public Role findByName(String roleName) {
        return roleRepository.findByName(roleName);
    }

    public Integer insert(Role role) {
        return roleRepository.insertAndReturnId(role);
    }
}
