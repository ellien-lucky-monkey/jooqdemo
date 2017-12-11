package com.jooq.demo.quartz.base;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 定时任务基类，所有任务类需继承此类
 *
 * @author ellien
 * @package com.jooq.demo.quartz
 * @date 2017/12/09 17:00
 */
@Slf4j
@Data
public abstract class ProxyBaseJob {
    /**
     * 任务执行完之后的备注
     */
    private String memo;

    /**
     * 实现
     */
    public abstract void execute();
}
