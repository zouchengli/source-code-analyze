package site.clzblog.source.code.analyze.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.clzblog.source.code.analyze.spring.xml.entity.UserEntity;

public class MainXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserEntity userEntity = applicationContext.getBean("userEntity", UserEntity.class);
        System.out.println(userEntity);
    }
}
