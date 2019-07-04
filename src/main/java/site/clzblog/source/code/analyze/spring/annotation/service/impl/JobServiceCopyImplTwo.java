package site.clzblog.source.code.analyze.spring.annotation.service.impl;

import org.springframework.stereotype.Service;
import site.clzblog.source.code.analyze.spring.annotation.service.JobServiceCopy;

@Service
public class JobServiceCopyImplTwo implements JobServiceCopy {
    public void execute() {
        System.out.println("Job service copy two execute ...");
    }
}
