package com.jooq.demo.quartz.common;


import com.jooq.demo.quartz.base.ProxyBaseJob;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author ellien
 * @package com.jooq.demo.quartz
 * @date 2017/12/09 17:00
 */
@Slf4j
public class InvokingProxyJob extends CoreBaseJob {

    @Override
    protected void doProcess(JobExecutionContext context) throws JobExecutionException {
        // 执行
        JobDetail jobDetail = context.getJobDetail();
        String jobName = jobDetail.getKey().getName();
        ProxyBaseJob job;
        //todo 执行日志
        try {
            job = applicationContext.getBean(jobName, ProxyBaseJob.class);
            job.execute();
            //todo 记录任务完成
        } catch (Throwable e) {
            // 打印异常并发送异常
            String exceptionMessage = ExceptionUtils.getStackTrace(e);
            log.error("[doProcess][job({}) 异常：{}]", jobName, exceptionMessage);
        }
    }

}
