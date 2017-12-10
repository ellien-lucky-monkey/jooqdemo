package com.jooq.demo.quartz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * 定时器触发器
 * Quartz自带数据库表SCHE_TRIGGERS
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleTrigger {

    /**
     * 触发器名 - 临时触发器前缀
     */
    public static final String TRIGGER_NAME_MT_PREFIX = "MT_";

    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 集群名
     */
    private String schedName;
    /**
     * 触发器名
     */
    private String triggerName;
    /**
     * 任务名
     */
    private String jobName;
    /**
     * 触发器状态
     */
    private String triggerState;

}