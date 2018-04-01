package com.sansan.jdbctemplate.dbcp_demo;

import com.sansan.jdbctemplate.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiapf on 2018/3/22.
 */
public class DbcpTest {
    public static void main(String[] args) {
        String xmlPath = "com/sansan/jdbctemplate/dbcp_demo/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        User user = new User();
        user.setId(1);
        user.setUsername("接客");
        user.setPassword("998");

        UserDao userDao = (UserDao) applicationContext.getBean("userDaoId");
        userDao.update(user);
    }
}
