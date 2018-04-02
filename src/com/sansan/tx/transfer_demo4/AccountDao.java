package com.sansan.tx.transfer_demo4;

public interface AccountDao {
    void out(String outer, Integer money);

    void in(String inner, Integer money);
}
