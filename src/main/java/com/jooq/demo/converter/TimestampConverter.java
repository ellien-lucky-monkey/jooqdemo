package com.jooq.demo.converter;

import org.joda.time.DateTime;
import org.jooq.Converter;

import java.sql.Timestamp;

/**
 * @author ellien
 * @package com.jooq.demo
 * @date 2017/11/30 13:49
 */
public class TimestampConverter implements Converter<Timestamp, DateTime> {

    @Override
    public DateTime from(Timestamp databaseObject) {
        return databaseObject == null ? null : new DateTime(databaseObject.getTime());
    }

    @Override
    public Timestamp to(DateTime userObject) {
        return userObject == null ? null : new Timestamp(userObject.getMillis());
    }

    @Override
    public Class<Timestamp> fromType() {
        return Timestamp.class;
    }

    @Override
    public Class<DateTime> toType() {
        return DateTime.class;
    }
}
