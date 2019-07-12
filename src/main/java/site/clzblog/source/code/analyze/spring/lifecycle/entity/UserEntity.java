package site.clzblog.source.code.analyze.spring.lifecycle.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class UserEntity implements BeanNameAware, BeanFactoryAware, InitializingBean , DisposableBean, ApplicationContextAware {
    public UserEntity() {
        System.out.println("Constructor initialized");
    }

    public void setBeanName(String s) {
        System.out.printf("Bean name -> %s\n", s);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.printf("Bean factory -> %s\n", beanFactory.toString().replace(",", "\n"));
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties executed ...");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.printf("Application context -> %s\n", applicationContext);
    }

    public void destroy() throws Exception {
        System.out.println("Destroyed");
    }
}
