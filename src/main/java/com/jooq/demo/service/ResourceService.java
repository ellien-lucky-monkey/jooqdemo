package com.jooq.demo.service;

import com.jooq.demo.domain.tables.pojos.Resource;
import com.jooq.demo.repository.user.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ellien
 * @package com.jooq.demo.service
 * @date 2017/12/03 21:02
 */
@Service
public class ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;


    public List<Resource> findByRoleId(Integer roleId){
        return resourceRepository.findByRoleId(roleId);
    }
}
