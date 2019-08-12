package site.clzblog.source.code.analyze.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.clzblog.source.code.analyze.spring.aop.config.JdbcConfig;
import site.clzblog.source.code.analyze.spring.aop.service.UserService;

public class AopMainCopy {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.addUser();
    }
}
