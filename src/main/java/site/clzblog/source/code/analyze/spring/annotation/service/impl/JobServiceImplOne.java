package site.clzblog.source.code.analyze.spring.annotation.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import site.clzblog.source.code.analyze.spring.annotation.service.JobService;

@Primary
@Service
public class JobServiceImplOne implements JobService {
    public void execute() {
        System.out.println("Job service one execute ...");
    }
}
