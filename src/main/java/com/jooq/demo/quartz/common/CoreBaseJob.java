package com.jooq.demo.quartz.common;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.io.Serializable;

/**
 * 定时任务调度基类
 * User: jeff
 * Date: 13-8-26
 * Time: 下午6:12
 */
@PersistJobDataAfterExecution
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
