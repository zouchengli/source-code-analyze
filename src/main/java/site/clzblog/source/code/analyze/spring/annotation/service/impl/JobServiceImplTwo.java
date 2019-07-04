package site.clzblog.source.code.analyze.spring.annotation.service.impl;

import org.springframework.stereotype.Service;
import site.clzblog.source.code.analyze.spring.annotation.service.JobService;

@Service
public class JobServiceImplTwo implements JobService {
    public void execute() {
        System.out.println("Job service two execute ...");
    }
}
