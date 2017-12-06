package com.jooq.demo.vos;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author ellien
 * @package com.jooq.demo.vos
 * @date 2017/12/06 17:15
 */
@Getter
@Builder
public class AdminVO implements Serializable{
    private Integer id;
    private String username;
    private String password;
    private String nickName;
}
