package com.jooq.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ellien
 * @package com.jooq.demo.enums
 * @date 2017/12/07 11:26
 */
@AllArgsConstructor
@Getter
public enum  UserType {
    DENIED("ROLE_DENIED",-1),
    ADMIN("ROLE_ADMIN", 0),
    DOCTOR("ROLE_DOCTOR",1),
    USER("ROLE_USER",2),
    GUEST("ROLE_GUEST",3);


    private String name;
    private int value;
}
