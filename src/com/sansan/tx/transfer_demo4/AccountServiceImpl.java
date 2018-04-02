package com.sansan.tx.transfer_demo4;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, noRollbackFor = ArithmeticException.class)
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
		int i = 1/0;

        //目标账户转入
        accountDao.in(inner, money);

    }
}
