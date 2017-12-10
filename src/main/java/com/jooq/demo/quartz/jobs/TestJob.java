package com.jooq.demo.quartz.jobs;

import com.jooq.demo.quartz.base.ProxyBaseJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author ellien
 * @package com.jooq.demo.quartz.jobs
 * @date 2017/12/09 17:10
 */
@Component
public class TestJob extends ProxyBaseJob {

    private static final Logger logger = LoggerFactory.getLogger(TestJob.class);

    @Override
    public void execute(){
        long now = System.currentTimeMillis();
        System.out.println("hello");
        logger.info("共消耗了{}毫秒", System.currentTimeMillis() - now);
    }
}
