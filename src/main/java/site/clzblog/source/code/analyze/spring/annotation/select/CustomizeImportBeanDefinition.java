package site.clzblog.source.code.analyze.spring.annotation.select;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import site.clzblog.source.code.analyze.spring.annotation.entity.ImportUserEntityThree;

public class CustomizeImportBeanDefinition implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(ImportUserEntityThree.class);
        beanDefinitionRegistry.registerBeanDefinition("importUserEntityThree", rootBeanDefinition);
    }
}
