package com.jooq.demo.service;

import com.jooq.demo.domain.tables.pojos.Admin;
import com.jooq.demo.qo.AdminQO;
import com.jooq.demo.repository.admin.AdminRepository;
import com.jooq.demo.vos.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
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

    @Cacheable(value = "admin", key = "#id.toString()")
    public Admin findById(Integer id){
        return adminRepository.findById(id);
    }

    @Cacheable(value = "adminVO", key = "#id.toString()")
    public AdminVO buildVO(Integer id){

        Admin admin = adminRepository.findById(id);
        if (admin != null){
            return AdminVO.builder().id(admin.getId())
                    .nickName(admin.getNickName())
                    .username(admin.getUsername())
                    .build();
        }
        return null;
    }

    /**
     * @CachePut 注解会缓存该方法的返回值 很恶心🤢 但是确实起到了刷新缓存的作用
     *
     * @param admin
     * @return
     */
    @CachePut(value = "admin", key="#admin.id.toString()")
    public Admin updateById(Admin admin){
         adminRepository.updateById(admin);
        return adminRepository.findById(admin.getId());
    }

    public void list(Integer id) {
        AdminQO adminQO = AdminQO.builder().id(id).build();
    }
}
