package site.clzblog.source.code.analyze.spring.aop.invocation.impl;

import site.clzblog.source.code.analyze.spring.aop.interceptor.MethodInterceptor;
import site.clzblog.source.code.analyze.spring.aop.invocation.MethodInvocation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class DefaultMethodInvocation implements MethodInvocation {
    private List<MethodInterceptor> methodInterceptors;
    private Object target;
    private Method method;
    private Object[] args;
    private int index;

    public DefaultMethodInvocation(List<MethodInterceptor> methodInterceptors, Object target, Method method, Object[] args) {
        this.methodInterceptors = methodInterceptors;
        this.target = target;
        this.method = method;
        this.args = args;
    }

    public DefaultMethodInvocation(List<MethodInterceptor> methodInterceptors) {
        this.methodInterceptors = methodInterceptors;
    }

    @Override
    public void process() throws InvocationTargetException, IllegalAccessException {
        if (index == methodInterceptors.size()) {
            method.invoke(target, args);
            return;
        }
        MethodInterceptor interceptor = methodInterceptors.get(index++);
        interceptor.invoke(this);
    }
}
