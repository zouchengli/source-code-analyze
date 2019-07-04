package site.clzblog.source.code.analyze.spring.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({site.clzblog.source.code.analyze.spring.annotation.entity.EnableUserEntity.class})
public @interface EnableUserEntity {
}
