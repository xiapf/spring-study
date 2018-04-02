package com.sansan.tx.service;

import com.sansan.tx.dao.AccountDao;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inner, Integer money) {
        //原账户转出
        accountDao.out(outer, money);

        //断电
//		int i = 1/0;

        //目标账户转入
        accountDao.in(inner, money);

    }
}
