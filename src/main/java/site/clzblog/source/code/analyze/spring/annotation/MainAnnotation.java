package site.clzblog.source.code.analyze.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.clzblog.source.code.analyze.spring.annotation.config.CustomizeConfig;
import site.clzblog.source.code.analyze.spring.annotation.config.CustomizeImportBean;
import site.clzblog.source.code.analyze.spring.annotation.config.CustomizeScan;
import site.clzblog.source.code.analyze.spring.annotation.entity.UserEntity;
import site.clzblog.source.code.analyze.spring.annotation.service.UserService;

public class MainAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contextSupper = new AnnotationConfigApplicationContext(CustomizeImportBean.class);
        String[] beans = contextSupper.getBeanDefinitionNames();
        for (String bean: beans) System.out.println(bean);

        System.out.println();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomizeConfig.class);
        UserEntity userEntity = context.getBean("userEntity", UserEntity.class);
        System.out.println(userEntity);
        System.out.println("Print execute");
        UserService userService = context.getBean("userService", UserService.class);
        UserService userServiceCopy = context.getBean("userService", UserService.class);
        System.out.println(userService == userServiceCopy);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) System.out.println(beanDefinitionName);

        System.out.println();
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CustomizeScan.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name: definitionNames) System.out.println(name);

        UserService service = applicationContext.getBean("userService", UserService.class);
        service.execute();
    }
}
