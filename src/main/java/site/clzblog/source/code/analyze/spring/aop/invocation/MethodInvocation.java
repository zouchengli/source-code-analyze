package site.clzblog.source.code.analyze.spring.aop.invocation;

import java.lang.reflect.InvocationTargetException;

public interface MethodInvocation {
  void process() throws InvocationTargetException, IllegalAccessException;
}
