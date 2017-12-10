package com.jooq.demo.quartz.common;


import com.jooq.demo.quartz.base.ProxyBaseJob;
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
public class InvokingProxyJob extends CoreBaseJob {

    //修复间隔 ms
    private final Logger logger = LoggerFactory.getLogger(getClass());

//    @Autowired
//    private SchedulerManageDao schedulerManageDao;

    @Override
    protected void doProcess(JobExecutionContext context) throws JobExecutionException {
//        if (schedulerManageDao == null) {
//            schedulerManageDao = applicationContext.getBean(SchedulerManageDao.class);
//        }
        // 执行
        JobDetail jobDetail = context.getJobDetail();
        String jobName = jobDetail.getKey().getName();
        ProxyBaseJob job;
        Date beginTime = new Date();
//        Long dispatchId = schedulerManageDao.addDispatchLog(ApplicationConfig.SCHEDULER_CLUSTER_NAME,  ApplicationConfig.SCHEDULER_INSTANCE_NAME, beginTime.getTime(), 0L, jobName, ScheduleExecuteLog.STATUS_BEGIN, 0L, "");
        try {
            job = applicationContext.getBean(jobName, ProxyBaseJob.class);
            job.execute();
            Date endTime = new Date();
            // 记录任务完成
//            schedulerManageDao.updateDispatchLogById(dispatchId, ScheduleExecuteLog.STATUS_SUCCESS, endTime.getTime(), endTime.getTime() - beginTime.getTime(), null);
        } catch (Throwable e) {
            Date endTime = new Date();
            // 打印异常并发送异常
            String exceptionMessage = ExceptionUtils.getStackTrace(e);
            logger.error("[doProcess][job({}) 异常：{}]", jobName, exceptionMessage);
//            if (dispatchId != null) {
//                schedulerManageDao.updateDispatchLogById(dispatchId, ScheduleExecuteLog.STATUS_FAILURE, endTime.getTime(), endTime.getTime() - beginTime.getTime(), exceptionMessage);
//            }
        }
    }

}
