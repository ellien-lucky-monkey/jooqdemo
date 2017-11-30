package com.jooq.demo.service;

import com.jooq.demo.domain.tables.pojos.Admin;
import com.jooq.demo.repository.admin.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @author ellien
 * @package com.jooq.demo.service
 * @date 2017/11/30 16:47
 */
@Service
@Validated
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Cacheable(cacheNames = "admins", key = "#id.toString()")
    public Admin findById(Integer id){
        return adminRepository.findById(id);
    }
}
