package site.clzblog.source.code.analyze.spring.reference.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BService {
    private AService aService;

    public void setAService(AService aService) {
        this.aService = aService;
    }
}
