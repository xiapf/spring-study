package com.sansan.tx.dao;

public interface AccountDao {
    void out(String outer, Integer money);

    void in(String inner, Integer money);
}
