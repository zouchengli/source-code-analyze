package site.clzblog.source.code.analyze.spring.aop.interceptor.impl;

import site.clzblog.source.code.analyze.spring.aop.interceptor.MethodInterceptor;
import site.clzblog.source.code.analyze.spring.aop.invocation.MethodInvocation;

import java.lang.reflect.InvocationTargetException;

public class AfterMethodInterceptor implements MethodInterceptor {
    public void invoke(MethodInvocation methodInvocation) throws InvocationTargetException, IllegalAccessException {
        methodInvocation.process();
        System.out.println("After notice");
    }
}
