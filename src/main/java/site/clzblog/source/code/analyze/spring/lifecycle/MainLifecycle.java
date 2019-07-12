package site.clzblog.source.code.analyze.spring.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.clzblog.source.code.analyze.spring.lifecycle.config.ProcessorConfig;

public class MainLifecycle {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProcessorConfig.class);
        context.close();
    }
}
