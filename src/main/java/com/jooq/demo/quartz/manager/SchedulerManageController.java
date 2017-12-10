package com.jooq.demo.quartz.manager;

import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ellien
 * @package com.jooq.demo.quartz.manager
 * @date 2017/12/09 17:00
 */
@RestController
@RequestMapping("/manage")
public class SchedulerManageController {

    private static final Logger logger = LoggerFactory.getLogger(SchedulerManageController.class);


    @Autowired
    private SchedulerManageService schedulerManageService;

    /**
     * 添加定时器
     * @throws SchedulerException
     */
    @RequestMapping(value = "add")
    public Integer add(String jobName, String jobDesc, String triggerType, String triggerExpression) throws SchedulerException {

        try {
            schedulerManageService.add(jobName, jobDesc, triggerType, triggerExpression);
        } catch (Exception e) {
            logger.error("Unexpected error occur at add(), cause: " + e.getMessage(), e);
            return 1;
        }
        return 0;
    }

    /**
     * 修改定时器
     * @throws SchedulerException
     */
    @RequestMapping(value = "modify")
    public Integer modify(Integer jobId, String jobName, String jobDesc, String triggerType, String triggerExpression) throws SchedulerException {
        try {
            schedulerManageService.modify(jobId, jobName, jobDesc, triggerType, triggerExpression);
        } catch (Exception e) {
            logger.error("Unexpected error occur at modify(), cause: " + e.getMessage(), e);
            return 1;
        }
        return 0;
    }

    /**
     * 删除定时器
     * @throws SchedulerException
     */
    @RequestMapping(value = "remove")
    public Integer remove(String jobName) throws SchedulerException {
        try {
        schedulerManageService.remove(jobName);
        } catch (Exception e) {
            logger.error("Unexpected error occur at remove(), cause: " + e.getMessage(), e);
            return 1;
        }
        return 0;
    }

    /**
     * 暂停定时器
     * @throws SchedulerException
     */
    @RequestMapping(value = "pause")
    public Integer pause(String jobName) throws SchedulerException {
        try {
            schedulerManageService.pause(jobName);
        } catch (Exception e) {
            logger.error("Unexpected error occur at pause(), cause: " + e.getMessage(), e);
            return 1;
        }
        return 0;
    }

    /**
     * 恢复定时器
     * @throws SchedulerException
     */
    @RequestMapping(value = "resume")
    public Integer resume(String jobName) throws SchedulerException {
        try {
            schedulerManageService.resume(jobName);
        } catch (Exception e) {
            logger.error("Unexpected error occur at resume(), cause: " + e.getMessage(), e);
            return 1;
        }
        return 0;
    }

    /**
     * 立即执行定时器
     * @throws SchedulerException
     */
    @RequestMapping(value = "run")
    public Integer run(String jobName) throws SchedulerException {
        try {
            schedulerManageService.run(jobName);
        } catch (Exception e) {
            logger.error("Unexpected error occur at run(), cause: " + e.getMessage(), e);
            return 1;
        }
        return 0;
    }
}
