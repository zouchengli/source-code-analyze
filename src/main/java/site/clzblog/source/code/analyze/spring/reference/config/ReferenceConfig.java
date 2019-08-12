package site.clzblog.source.code.analyze.spring.reference.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "site.clzblog.source.code.analyze.spring.reference.service")
public class ReferenceConfig {
}
