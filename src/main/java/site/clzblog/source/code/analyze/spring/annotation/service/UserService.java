package site.clzblog.source.code.analyze.spring.annotation.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserService() {
        System.out.println("No args constructor first execute");
    }
}
