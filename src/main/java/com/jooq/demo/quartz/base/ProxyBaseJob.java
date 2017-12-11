package com.jooq.demo.quartz.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 定时任务基类，所有任务类需继承此类
 *
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
