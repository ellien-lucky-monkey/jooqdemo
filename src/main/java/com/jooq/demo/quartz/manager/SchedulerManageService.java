package com.jooq.demo.quartz.manager;


import com.jooq.demo.quartz.common.InvokingProxyJob;
import com.jooq.demo.quartz.entity.ScheduleJobConfig;
import com.jooq.demo.repository.jpa.ScheduleJobConfigRepository;
import com.jooq.demo.utils.BeanManager;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

/**
 * @author ellien
 * @package com.jooq.demo.quartz.manager
 * @date 2017/12/09 17:00
 */
@Service
public class SchedulerManageService {

    private static final String JOB_GROUP = "DEFAULT";
    private static final String TRIGGER_GROUP = "DEFAULT";

    private Scheduler scheduler;
    @Autowired
    private ScheduleJobConfigRepository scheduleJobConfigRepository;
    @Autowired
    private BeanManager beanManager;

    @PostConstruct
    public void init() {
        scheduler = beanManager.getBean(SchedulerFactoryBean.class).getScheduler();
    }

    /**
     * 添加定时器
     *
     * @throws SchedulerException
     */
    @Transactional
    public void add(String jobName, String jobDesc, String triggerType, String triggerExpression) throws SchedulerException {
        ScheduleJobConfig config = new ScheduleJobConfig();
        config.setJobGroup("DEFAULT");
        config.setTriggerName(config.getJobName() + "Trigger");
        config.setTriggerGroup("DEFAULT");
        config.setStatus(ScheduleJobConfig.STATUS_NOT_INIT);
        config.setScheduleName("clusterQuartzDwScheduler");
        config.setJobName(jobName);
        config.setJobDesc(jobDesc);
        config.setTriggerType(triggerType);
        config.setTriggerExpression(triggerExpression);

        config = scheduleJobConfigRepository.save(config);

//        int configId = config.getId();
        String triggerName = jobName + "Trigger";
        JobDetail jobDetail = JobBuilder.newJob(InvokingProxyJob.class)
                .withIdentity(jobName, JOB_GROUP)
                .withDescription(jobDesc)
//                .usingJobData("id", 1)
                .build();
        scheduler.scheduleJob(jobDetail, buildTrigger(triggerType, triggerName, TRIGGER_GROUP, triggerExpression, jobDesc));
    }

    /**
     * 修改定时器
     *
     * @throws SchedulerException
     */
    public void modify(Integer jobId, String jobName, String jobDesc, String triggerType, String triggerExpression) throws SchedulerException {
        scheduleJobConfigRepository.updateById(jobId, jobName, jobDesc, triggerType, triggerExpression);
        String triggerName = jobName + "Trigger";
        Trigger trigger = buildTrigger(triggerType, triggerName, TRIGGER_GROUP, triggerExpression, jobDesc);
        scheduler.rescheduleJob(new TriggerKey(triggerName, TRIGGER_GROUP), trigger);
    }

    /**
     * 删除定时器
     *
     * @throws SchedulerException
     */
    public void remove(String jobName) throws SchedulerException {
        scheduler.deleteJob(new JobKey(jobName, JOB_GROUP));
//        RedisPub.pubSchedulerJobRefresh();
    }

    /**
     * 暂停定时器
     *
     * @throws SchedulerException
     */
    public void pause(String jobName) throws SchedulerException {
        String triggerName = jobName + "Trigger";
        scheduler.pauseJob(new JobKey(jobName, JOB_GROUP));
        scheduler.pauseTrigger(new TriggerKey(triggerName, TRIGGER_GROUP));
    }

    /**
     * 恢复定时器
     *
     * @throws SchedulerException
     */
    public void resume(String jobName) throws SchedulerException {
        String triggerName = jobName + "Trigger";
        scheduler.resumeJob(new JobKey(jobName, JOB_GROUP));
        scheduler.resumeTrigger(new TriggerKey(triggerName, TRIGGER_GROUP));
    }

    /**
     * 立即执行定时器
     *
     * @throws SchedulerException
     */
    public void run(String jobName) throws SchedulerException {
        scheduler.triggerJob(new JobKey(jobName, JOB_GROUP));
    }

    public Trigger buildTrigger(String triggerType, String triggerName, String triggerGroup, String triggerExpression, String jobDesc) {
        Trigger trigger = null;
        switch (triggerType) {
            case "SIMPLE": {
                trigger = TriggerBuilder.newTrigger()
                        .withIdentity(triggerName, triggerGroup)
                        .withDescription(jobDesc)
                        .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                                .withIntervalInSeconds(Integer.valueOf(triggerExpression))
                                .repeatForever())
                        .build();
            }
            break;
            case "CRON": {
                trigger = TriggerBuilder.newTrigger()
                        .withIdentity(triggerName, triggerGroup)
                        .withDescription(jobDesc)
                        .withSchedule(CronScheduleBuilder.cronSchedule(triggerExpression))
                        .build();
            }
            break;
        }
        return trigger;
    }

}
