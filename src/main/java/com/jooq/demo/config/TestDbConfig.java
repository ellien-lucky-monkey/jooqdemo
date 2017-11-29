package com.jooq.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


/**
 * @author ellien
 * @package com.jooq.demo.config
 * @date 2017/11/29 15:11
 */
@Configuration
public class TestDbConfig {

    @Bean(initMethod = "init", destroyMethod = "close")
    @ConfigurationProperties(prefix = "db.test")
    public DataSource dataSourceA() {
        return new DruidDataSource();
    }

    @Bean
    public DataSourceTransactionManager transactionManagerA() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSourceA());
        return transactionManager;
    }
}
