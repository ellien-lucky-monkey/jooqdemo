package com.jooq.demo.config.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

/**
 * @author ellien
 * @package com.jooq.demo.config.jpa
 * @date 2017/12/07 16:26
 */
@Configuration
@EnableJpaRepositories("com.jooq.demo.repository")
@EnableTransactionManagement
public class JPAConfig {
    @Autowired
    private JpaProperties jpaProperties;

    @Bean(name = "entityManager")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder, @Qualifier("dataSourceB") DataSource dataSourceB) {
        return entityManagerFactory(builder, dataSourceB).getObject().createEntityManager();
    }

    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("dataSourceB") DataSource dataSourceB) {
        return builder
                .dataSource(dataSourceB)
                .properties(getVendorProperties(dataSourceB))
                .packages("com.jooq.demo.pojo")
                .persistenceUnit("persistenceUnit")
                .build();
    }

    private Map<String, String> getVendorProperties(@Qualifier("dataSourceB") DataSource dataSourceB) {
        return jpaProperties.getHibernateProperties(dataSourceB);
    }

}
