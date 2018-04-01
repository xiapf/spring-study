package com.sansan.aop.demo3;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by xiapf on 2018/3/27.
 */
public class MyAspect {
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知：" + joinPoint.getSignature().getName());
    }

    public void afterReturning(JoinPoint joinPoint, Object object) {
        System.out.println("后置通知：" + joinPoint.getSignature().getName() + object);
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法执行前的操作");
        Object obj = joinPoint.proceed();
        System.out.println("方法执行后的操作");
        return obj;
    }

    public void afterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("异常后执行的操作：" + e.getMessage());
    }

    public void after(JoinPoint joinPoint) {
        System.out.println("最终通知");
    }
}
