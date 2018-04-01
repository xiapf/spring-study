package com.sansan.aop.demo2;

/**
 * Created by xiapf on 2018/3/27.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("add user success!");
    }

    @Override
    public void updateUser() {
        System.out.println("update user success!");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete user success!");
    }
}
