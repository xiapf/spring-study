package com.sansan.tx.transfer_demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:com/sansan/tx/transfer_demo4/applicationContext.xml")
public class TxTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testTransfer() {
//        String xmlPath = "com/sansan/tx/transfer_demo4/applicationContext.xml";
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//        AccountService accountService =  (AccountService) applicationContext.getBean("accountService");

        accountService.transfer("jack", "rose", 1000);
    }
}
