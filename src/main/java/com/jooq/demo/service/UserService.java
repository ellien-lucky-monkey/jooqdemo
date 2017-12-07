package com.jooq.demo.service;

import com.jooq.demo.domain.tables.pojos.Role;
import com.jooq.demo.domain.tables.pojos.User;
import com.jooq.demo.domain.tables.pojos.UserRole;
import com.jooq.demo.enums.UserType;
import com.jooq.demo.repository.user.UserRepository;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * @author ellien
 * @package com.jooq.demo.service
 * @date 2017/12/01 11:54
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private RoleService roleService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User findByUserName(@NotEmpty String username){
        return userRepository.findByUserName(username);
    }

    @Transactional
    public User createUser(String username,
                           String mobile,
                           String password,
                           String nickName,
                           Integer type) {
     if (StringUtils.isEmpty(username) || StringUtils.isEmpty(mobile)) {
         throw new RuntimeException( "用户已存在");
     }
     if (type == null) {
         type = UserType.USER.getValue();
     }
    //验证手机号和用户名是否已被使用
        if (!StringUtils.isEmpty(username)) {
            User oldUser = userRepository.findByUsernameOrMobile(mobile, username);
            if (oldUser != null) {
//                throw new ServiceException(ExceptionConstants.USER_ALREADY_EXISTS, "用户已存在");
            }
        }
        //基础信息
        User user = new User();
        if (StringUtils.isEmpty(nickName)) {
            nickName = mobile;
        }

        // user.setType(type);
        user.setNickName(nickName);
        user.setUsername(username);
        user.setCreatedTime(new DateTime());
        user.setMobile(mobile);
        user.setPassword(bCryptPasswordEncoder.encode(password));

        if (UserType.ADMIN.getValue() == type) {
            user.setType(UserType.ADMIN);
        } else if (UserType.USER.getValue() == type){
            user.setType(UserType.USER);
        } else if (UserType.DOCTOR.getValue() == type){
            user.setType(UserType.DOCTOR);
        } else if (UserType.GUEST.getValue() == type){
            user.setType(UserType.GUEST);
        } else if (UserType.DENIED.getValue() == type){
            user.setType(UserType.DENIED);
        }
        Role role = roleService.findByName(user.getType().getName());
        Assert.notNull(role, "角色不存在");
        Integer userId =  userRepository.insertAndReturnId(user);
        UserRole userRole = new UserRole();
        userRole.setUserId(userId);
        userRole.setRoleId(role.getId());
        userRoleService.insert(userRole);
        return user;
    }
}
