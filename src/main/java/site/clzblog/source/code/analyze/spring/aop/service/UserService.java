package site.clzblog.source.code.analyze.spring.aop.service;

public class UserService {
    public void login(String username, Integer age) {
        System.out.printf("username:%s,age:%s\n", username, age);
    }
}
