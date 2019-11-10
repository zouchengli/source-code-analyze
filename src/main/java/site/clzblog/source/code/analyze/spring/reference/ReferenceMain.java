package site.clzblog.source.code.analyze.spring.reference;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.clzblog.source.code.analyze.spring.reference.config.ReferenceConfig;
import site.clzblog.source.code.analyze.spring.reference.service.AService;
import site.clzblog.source.code.analyze.spring.reference.service.BService;

public class ReferenceMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ReferenceConfig.class);
        AService aService = context.getBean("AService", AService.class);
        BService bService = context.getBean("BService", BService.class);
        aService.setBService(bService);
        bService.setAService(aService);
        //Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
