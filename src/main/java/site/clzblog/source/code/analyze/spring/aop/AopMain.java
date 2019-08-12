package site.clzblog.source.code.analyze.spring.aop;

import site.clzblog.source.code.analyze.spring.aop.interceptor.MethodInterceptor;
import site.clzblog.source.code.analyze.spring.aop.interceptor.impl.AfterMethodInterceptor;
import site.clzblog.source.code.analyze.spring.aop.interceptor.impl.BeforeMethodInterceptor;
import site.clzblog.source.code.analyze.spring.aop.invocation.impl.DefaultMethodInvocation;
import site.clzblog.source.code.analyze.spring.aop.service.UserService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AopMain {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        List<MethodInterceptor> methodInterceptors = new ArrayList<>();
        methodInterceptors.add(new BeforeMethodInterceptor());
        methodInterceptors.add(new AfterMethodInterceptor());
        UserService service = new UserService();
        Method login = service.getClass().getMethod("login", String.class, Integer.class);
        new DefaultMethodInvocation(methodInterceptors, service, login, new Object[]{"jack", 19}).process();
    }
}
