package com.jooq.demo.quartz;

import org.quartz.Job;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ellien
 * @package com.jooq.demo.quartz
 * @date 2017/12/08 18:16
 */
@Configuration
@EnableScheduling
public class QuartzConfig {
    private static final Logger log = LoggerFactory.getLogger(QuartzConfig.class);

    @Autowired
    @Qualifier("dataSourceB")
    private DataSource dataSourceB;

    @Bean
    public SchedulerFactoryBean quartzScheduler() throws IOException, SchedulerException {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setOverwriteExistingJobs(true);
        schedulerFactoryBean.setAutoStartup(true);

        // 要注入DataSource
        schedulerFactoryBean.setDataSource(dataSourceB);
        schedulerFactoryBean.setQuartzProperties(quartzProperties());
        schedulerFactoryBean.setApplicationContextSchedulerContextKey("applicationContext");
        return schedulerFactoryBean;
    }

    /**
     * 设置quartz属性
     * @throws IOException
     * 2016年10月8日下午2:39:05
     */
    public Properties quartzProperties() throws IOException {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.setLocation(new ClassPathResource("/config/quartz.properties"));
        propertiesFactoryBean.afterPropertiesSet();
        return propertiesFactoryBean.getObject();
    }

    @Bean
    public JobDetailFactoryBean jobTask(){
        JobDetailFactoryBean jobTask = new JobDetailFactoryBean();

        jobTask.setJobClass(Job.class);
        return jobTask;
    }

}
