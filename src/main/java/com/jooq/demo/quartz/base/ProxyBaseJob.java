package com.jooq.demo.quartz.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Pattern;

/**
 * @author ellien
 * @package com.jooq.demo.quartz
 * @date 2017/12/09 17:00
 */
public abstract class ProxyBaseJob {
    /**
     * 日志
     */
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 邮箱正则表达式
     */
    static final Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");

    /**
     * 任务执行完之后的备注
     */
    private String memo;

    /**
     * 实现
     */
    public abstract void execute();

    public String getMemo() {
        return memo;
    }

    /**
     * 设置执行后备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }
}
