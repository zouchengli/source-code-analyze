package site.clzblog.source.code.analyze.spring.aop.interceptor;

import site.clzblog.source.code.analyze.spring.aop.invocation.MethodInvocation;

import java.lang.reflect.InvocationTargetException;

public interface MethodInterceptor {
    void invoke(MethodInvocation methodInvocation) throws InvocationTargetException, IllegalAccessException;
}
