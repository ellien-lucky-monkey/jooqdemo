package com.jooq.demo;

import org.joda.time.DateTime;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ellien
 * @package com.jooq.demo
 * @date 2017/11/30 12:54
 */
public class JodaTimeTest {

    private static final Logger logger = LoggerFactory.getLogger(JodaTimeTest.class);

    @Test
    public void init() {
        DateTime dateTime = new DateTime();
        Date joda = dateTime.toDate();
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
        logger.info(dateFormat.format(date));
        logger.info(dateFormat.format(joda));
    }
}
