package com.sansan.tx.transfer_demo4;

public interface AccountService {
    /**
     * 转账服务
     * @param outer
     * @param inner
     * @param money
     */
    void transfer(String outer, String inner, Integer money);
}
