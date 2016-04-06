package com.spring.aop.jdk.service.impl;

import com.spring.aop.jdk.service.UserService;


public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("start insert user into database");
    }

    @Override
    public String findUserById() {
        System.out.println("start find user by userId");
        return null;
    }

}
