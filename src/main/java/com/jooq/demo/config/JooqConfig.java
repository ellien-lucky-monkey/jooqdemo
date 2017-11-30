package com.jooq.demo.config;

import org.jooq.*;
import org.jooq.conf.Settings;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;


/**
 * @author ellien
 * @package com.jooq.demo.config
 * @date 2017/11/29 14:58
 */
@Configuration
public class JooqConfig {

    @Bean
    public DataSourceConnectionProvider dataSourceConnectionProviderA(
            @Qualifier("dataSourceA") DataSource dataSourceA) {
        return new DataSourceConnectionProvider(
                new TransactionAwareDataSourceProxy(dataSourceA));
    }

    @Bean
    public SpringTransactionProvider transactionProviderA(
            @Qualifier("transactionManagerA") DataSourceTransactionManager txManagerW) {
        return new SpringTransactionProvider(txManagerW);
    }

    @Configuration
    public static class DslContextConfig {

        @Autowired(required = false)
        private RecordMapperProvider recordMapperProvider;
        @Autowired(required = false)
        private Settings settings;
        @Autowired(required = false)
        private RecordListenerProvider[] recordListenerProviders;
        @Autowired
        private ExecuteListenerProvider[] executeListenerProviders;
        @Autowired(required = false)
        private VisitListenerProvider[] visitListenerProviders;

        @Bean
        @Primary
        public DefaultDSLContext dslContextA(@Qualifier(value = "dataSourceConnectionProviderA") DataSourceConnectionProvider connectionProviderA,
                                             @Qualifier("transactionProviderA") SpringTransactionProvider transactionProviderA) {
            return new DefaultDSLContext(configuration(connectionProviderA, transactionProviderA));
        }

        private DefaultConfiguration configuration(ConnectionProvider connectionProvider, TransactionProvider transactionProvider) {
            DefaultConfiguration configuration = new DefaultConfiguration();
            configuration.setSQLDialect(SQLDialect.MYSQL);
            configuration.set(connectionProvider);
            configuration.set(transactionProvider);
            if (this.recordMapperProvider != null) {
                configuration.set(this.recordMapperProvider);
            }
            if (this.settings != null) {
                configuration.set(this.settings);
            }
            configuration.set(this.recordListenerProviders);
            configuration.set(this.executeListenerProviders);
            configuration.set(this.visitListenerProviders);
            return configuration;
        }
    }
}
