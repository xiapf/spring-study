package com.sansan.aop.demo4;

import org.springframework.stereotype.Service;

@Service("userServiceId")
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
