package com.jooq.demo.converter;

import com.jooq.demo.enums.UserType;
import org.jooq.Converter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ellien
 * @package com.jooq.demo.converter
 * @date 2017/12/07 12:44
 */
public class UserTypeConverter1 implements Converter<Integer, UserType>{

    private final Map<Integer, UserType> lookup;

    public UserTypeConverter1() {
        this.lookup = new LinkedHashMap<>();
        for (UserType userType: UserType.values()){
            lookup.put(userType.getValue(),userType);
        }


    }

    @Override
    public UserType from(Integer integer) {
        return lookup.get(integer);
    }

    @Override
    public Integer to(UserType userType) {
        return userType.getValue();
    }

    @Override
    public Class<Integer> fromType() {
        return Integer.class;
    }

    @Override
    public Class<UserType> toType() {
        return UserType.class;
    }
}
