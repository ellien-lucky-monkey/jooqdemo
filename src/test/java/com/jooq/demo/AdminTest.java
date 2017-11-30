package com.jooq.demo;

import com.alibaba.fastjson.JSON;
import com.jooq.demo.domain.tables.pojos.Admin;
import com.jooq.demo.repository.admin.AdminRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;


/**
 * @author ellien
 * @package com.jooq.demo
 * @date 2017/11/29 15:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest
public class AdminTest {

    private static final Logger logger = LoggerFactory.getLogger(AdminTest.class);
    @Autowired
    private AdminRepository adminRepository;

    @Test
    public void find() {
        List<Admin> admins = adminRepository.findById(1);
        System.out.println(JSON.toJSON(admins));
    }

    @Test
    public void findByUsername() {
        Map<String, Admin> admins = adminRepository.findByUsername("ellien");
        System.out.println("");
    }

    @Test
    public void insertOne() {
        Admin admin = new Admin();
        admin.setUsername("ellien");
        admin.setNickName("jk");
        Integer id = adminRepository.insertOne(admin);
        logger.info(id.toString());
    }
}
