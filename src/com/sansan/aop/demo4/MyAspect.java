package com.sansan.aop.demo4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    //公共切入点
    @Pointcut("execution(* com.sansan.aop.demo4.*.*(..))")
    private void myPointCut() {}

    @Before("execution(* com.sansan.aop.demo4.*.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知：" + joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "myPointCut()", returning = "ret")
    public void afterReturning(JoinPoint joinPoint, Object ret) {
        System.out.println("后置通知：" + joinPoint.getSignature().getName() + ret);
    }

    @Around(value = "myPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法执行前的操作");
        Object obj = joinPoint.proceed();
        System.out.println("方法执行后的操作");
        return obj;
    }

    @AfterThrowing(value = "myPointCut()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("异常后执行的操作：" + e.getMessage());
    }

    @After(value = "myPointCut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("最终通知");
    }
}
