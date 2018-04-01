package com.sansan.aop.demo2;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by xiapf on 2018/3/27.
 */
public class MyAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("前333");
        Object obj = invocation.proceed();
        System.out.println("后333");
        return obj;
    }
}
