package com.jooq.demo;

import com.jooq.demo.quartz.manager.SchedulerManageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ellien
 * @package com.jooq.demo
 * @date 2017/12/10 13:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class SchedulerTest {
    @Autowired
    private SchedulerManageService schedulerManageService;

    @Test
    public void add() throws SchedulerException {
        schedulerManageService.add("TestJob", "","Simple", "60");
    }
}
