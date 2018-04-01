package com.sansan.jdbctemplate.c3p0_demo;

import com.sansan.jdbctemplate.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiapf on 2018/4/1.
 */
public class C3p0Test {
    public static void main(String[] args) {
        String xmlPath = "com/sansan/jdbctemplate/c3p0_demo/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        User user = new User();
        user.setId(1);
        user.setUsername("jj");
        user.setPassword("777");

        UserDao userDao = (UserDao) applicationContext.getBean("userDaoId");
        userDao.update(user);
    }
}
