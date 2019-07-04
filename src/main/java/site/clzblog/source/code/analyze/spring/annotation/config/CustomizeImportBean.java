package site.clzblog.source.code.analyze.spring.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import site.clzblog.source.code.analyze.spring.annotation.EnableUserEntity;
import site.clzblog.source.code.analyze.spring.annotation.MyComponent;
import site.clzblog.source.code.analyze.spring.annotation.entity.ImportUserEntity;
import site.clzblog.source.code.analyze.spring.annotation.select.CustomizeImportBeanDefinition;
import site.clzblog.source.code.analyze.spring.annotation.select.CustomizeImportSelector;

@Configuration
@Import({ImportUserEntity.class, CustomizeImportSelector.class, CustomizeImportBeanDefinition.class})
@EnableUserEntity
@ComponentScan(basePackages = {"site.clzblog.source.code.analyze.spring.annotation.entity"}, includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = MyComponent.class)}, useDefaultFilters = false)
public class CustomizeImportBean {
}
