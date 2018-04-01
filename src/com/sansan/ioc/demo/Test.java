package com.sansan.ioc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiapf on 2018/3/22.
 */
public class Test {
    public static void main(String[] args) {
        String xmlPath = "com/sansan/ioc/demo/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userServiceId");
        userService.addUser();
    }
}
