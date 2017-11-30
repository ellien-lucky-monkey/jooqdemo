package com.jooq.demo.config;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationVersion;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.util.ObjectUtils;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ellien
 * @package com.jooq.demo.config
 * @date 2017/11/30 12:00
 */
@Configuration
public class FlywayConfig {
    @Bean(initMethod = "migrate")
    public Flyway flyway(@Qualifier("dataSourceA") DataSource dataSourceA) {
        Flyway test = new Flyway();
        test.setDataSource(dataSourceA);
        return test;
    }

    @Bean
    @ConfigurationPropertiesBinding
    public StringOrNumberToMigrationVersionConverter stringOrNumberMigrationVersionConverter() {
        return new StringOrNumberToMigrationVersionConverter();
    }

    /**
     * Convert a String or Number to a {@link MigrationVersion}.
     *
     * @see FlywayAutoConfiguration
     */
    private static class StringOrNumberToMigrationVersionConverter
            implements GenericConverter {

        private static final Set<ConvertiblePair> CONVERTIBLE_TYPES;

        static {
            Set<ConvertiblePair> types = new HashSet<ConvertiblePair>(2);
            types.add(new ConvertiblePair(String.class, MigrationVersion.class));
            types.add(new ConvertiblePair(Number.class, MigrationVersion.class));
            CONVERTIBLE_TYPES = Collections.unmodifiableSet(types);
        }

        @Override
        public Set<ConvertiblePair> getConvertibleTypes() {
            return CONVERTIBLE_TYPES;
        }

        @Override
        public Object convert(Object source, TypeDescriptor sourceType,
                              TypeDescriptor targetType) {
            String value = ObjectUtils.nullSafeToString(source);
            return MigrationVersion.fromVersion(value);
        }

    }
}