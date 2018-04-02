package com.sansan.tx.transfer_demo2;

import com.sansan.tx.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {
    public static void main(String[] args) {
        String xmlPath = "com/sansan/tx/transfer_demo2/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService =  (AccountService) applicationContext.getBean("proxyAccountService");
        accountService.transfer("jack", "rose", 1000);
    }
}
