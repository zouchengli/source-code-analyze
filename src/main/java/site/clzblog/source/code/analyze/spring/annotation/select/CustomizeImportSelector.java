package site.clzblog.source.code.analyze.spring.annotation.select;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class CustomizeImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"site.clzblog.source.code.analyze.spring.annotation.entity.ImportUserEntityOne",
                "site.clzblog.source.code.analyze.spring.annotation.entity.ImportUserEntityTwo"};
    }
}
