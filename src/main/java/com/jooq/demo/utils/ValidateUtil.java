package com.jooq.demo.utils;

import java.util.regex.Pattern;

/**
 * @author ellien
 * @package com.jooq.demo.utils
 * @date 2017/12/11 09:51
 */
public class ValidateUtil {
    /**
     * 邮箱正则表达式
     */
    static final Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");

}
