package site.clzblog.source.code.analyze.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private JobService jobService;

    @Autowired
    @Qualifier("jobServiceCopyImplOne")
    private JobServiceCopy jobServiceCopy;

    public UserService() {
        System.out.println("No args constructor first execute");
    }

    public void execute() {
        jobService.execute();
        jobServiceCopy.execute();
    }
}
