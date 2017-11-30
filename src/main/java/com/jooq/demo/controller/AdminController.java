package com.jooq.demo.controller;

import com.jooq.demo.domain.tables.pojos.Admin;
import com.jooq.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ellien
 * @package com.jooq.demo.controller
 * @date 2017/11/30 17:15
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/info")
    public Admin info(@RequestParam("id") Integer id) {
        return adminService.findById(id);
    }
}
