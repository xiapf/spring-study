package com.sansan.aop.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiapf on 2018/3/27.
 */
public class Test {
    public static void main(String[] args) {
        String xmlPath = "com/sansan/aop/demo2/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userServiceId");
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }
}
