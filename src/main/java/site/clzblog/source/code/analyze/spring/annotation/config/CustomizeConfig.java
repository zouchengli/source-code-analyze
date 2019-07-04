package site.clzblog.source.code.analyze.spring.annotation.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;
import site.clzblog.source.code.analyze.spring.annotation.entity.UserEntity;

@Configuration
@ComponentScan(value = "site.clzblog.source.code.analyze.spring.annotation",
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class)},
        useDefaultFilters = false)
public class CustomizeConfig {
    @Bean
    @Conditional(CustomizeConditional.class)
    UserEntity userEntity() {
        return new UserEntity(1L, "Test");
    }
}
