package com.sansan.aop.cglibproxy;

/**
 * Created by xiapf on 2018/3/27.
 */
public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();
        UserServiceProxy proxy = new UserServiceProxy(userService);
        UserService userServiceProxy = (UserService) proxy.getProxyInstance();
        userServiceProxy.addUser();
    }
}
