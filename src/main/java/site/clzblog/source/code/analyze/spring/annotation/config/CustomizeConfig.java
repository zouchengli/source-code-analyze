package site.clzblog.source.code.analyze.spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;
import site.clzblog.source.code.analyze.spring.annotation.entity.UserEntity;

@Configuration
@ComponentScan(value = "site.clzblog.source.code.analyze.spring.annotation",
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class)},
        useDefaultFilters = false)
public class CustomizeConfig {
    @Bean
    UserEntity userEntity() {
        return new UserEntity(1L, "Test");
    }
}
