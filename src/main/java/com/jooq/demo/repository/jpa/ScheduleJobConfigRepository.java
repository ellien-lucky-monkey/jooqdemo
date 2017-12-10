package com.jooq.demo.repository.jpa;

import com.jooq.demo.quartz.entity.ScheduleJobConfig;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author ellien
 * @package com.jooq.demo.repository.jpa
 * @date 2017/12/10 12:17
 */
public interface ScheduleJobConfigRepository extends BaseRepository<ScheduleJobConfig, Integer> {
    @Modifying
    @Query("update ScheduleJobConfig sc set " +
            "sc.jobName = :jobName, sc.jobDesc = :jobDesc, sc.triggerType = :triggerType, sc.triggerExpression = :triggerExpression" +
            " where sc.id = :id")
    void updateById(@Param("id") Integer jobId,
                    @Param("jobName") String jobName,
                    @Param("jobDesc") String jobDesc,
                    @Param("triggerType") String triggerType,
                    @Param("triggerExpression") String triggerExpression);
}
