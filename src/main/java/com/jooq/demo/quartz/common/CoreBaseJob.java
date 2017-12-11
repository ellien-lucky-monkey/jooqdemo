package com.jooq.demo.quartz.common;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.io.Serializable;

/**
 * @author ellien
 * @package com.jooq.demo.quartz.common
 * @date 2017/12/09 17:00
 */
//执行之后更新JobDataMap
@PersistJobDataAfterExecution
// 禁止并发执行
@DisallowConcurrentExecution
public abstract class CoreBaseJob extends QuartzJobBean implements Serializable {

    protected ApplicationContext applicationContext;

    /**
     * 从SchedulerFactoryBean注入的applicationContext.
     */
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void executeInternal(JobExecutionContext context)
            throws JobExecutionException {
        doProcess(context);
    }

    /**
     * 子类实现调度
     *
     * @param context 定时任务执行环境
     * @throws JobExecutionException 执行发生异常
     */
    protected abstract void doProcess(JobExecutionContext context) throws JobExecutionException;

}
