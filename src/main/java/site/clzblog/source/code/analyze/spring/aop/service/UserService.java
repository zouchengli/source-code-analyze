package site.clzblog.source.code.analyze.spring.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.clzblog.source.code.analyze.spring.aop.dao.UserDao;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void login(String username, Integer age) {
        System.out.printf("username:%s,age:%s\n", username, age);
    }

    @Transactional
    public void addUser() {
        userDao.addUser();
        int i = 1/0;
    }
}
