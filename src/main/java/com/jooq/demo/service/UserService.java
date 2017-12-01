package com.jooq.demo.service;

import com.jooq.demo.domain.tables.pojos.User;
import com.jooq.demo.repository.user.UserRepository;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    public User findByUserName(@NotEmpty String username){
        return userRepository.findByUserName(username);
    }

    @Transactional
    public User createUser(String username,
                           String mobile,
                           String password,
                           String nickName) {
        //验证手机号是否已被使用
        if (!StringUtils.isEmpty(mobile)) {
            User oldUser = userRepository.findByMobile(mobile);
            if (oldUser != null) {
//                throw new ServiceException(ExceptionConstants.USER_ALREADY_EXISTS, "用户已存在");
            }
        }

        //基础信息
        User user = new User();
        if (StringUtils.isEmpty(nickName)) {
            nickName = mobile;
        }
        user.setNickName(nickName);
        user.setUsername(username);
        user.setCreatedTime(new DateTime());
        user.setMobile(mobile);
        user.setPassword(password);
        userRepository.insert(user);
        return user;
    }
}
