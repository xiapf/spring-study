package com.sansan.aop.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by xiapf on 2018/3/26.
 */
public class UserServiceProxy implements MethodInterceptor {
    private UserService target;
    public UserServiceProxy(UserService target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("事务开始");
        Object obj = method.invoke(target, args);
        System.out.println("事务结束");
        return obj;
    }
}
