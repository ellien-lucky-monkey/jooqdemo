package com.jooq.demo.converter;

import com.jooq.demo.enums.UserType;

/**
 * @author ellien
 * @package com.jooq.demo.converter
 * @date 2017/12/07 11:43
 */
public class UserTypeConverter extends NumberEnumConverter<Integer, UserType>{

    public UserTypeConverter() {
        super(Integer.class, UserType.class);
    }
}
