package com.jooq.demo.constants;

/**
 * @author ellien
 * @package com.jooq.demo.constants
 * @date 2017/12/03 12:48
 */
public enum Permission {

    USER_VIEW(1,"VIEW","/user");



    private long    bit;
    private String  permission;
    private String  domain;

    Permission(long bit, String permission, String domain) {
        this.bit = bit;
        this.permission = permission;
        this.domain = domain;
    }

    public long getBit() {
        return bit;
    }

    public String getPermission() {
        return permission;
    }

    public String getDomain() {
        return domain;
    }
}
