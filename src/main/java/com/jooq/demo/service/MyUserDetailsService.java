package com.jooq.demo.service;

import com.jooq.demo.domain.tables.pojos.Role;
import com.jooq.demo.domain.tables.pojos.User;
import com.jooq.demo.security.SecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author ellien
 * @package com.jooq.demo.service
 * @date 2017/12/01 11:50
 */
@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (StringUtils.isEmpty(username)) {
            throw new UsernameNotFoundException("username is empty");
        }
        User user = userService.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("user not exist");
        }
        List<Role> roles = roleService.findByUserId(user.getId());
        return new SecurityUser(user, roles);
    }
}
