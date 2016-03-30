package com.spring.ioc.impl;

import org.springframework.stereotype.Service;

import com.spring.ioc.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    public void findUserById() {
        
    }

    public String sayHello() {
        return "hello spring ioc";
    }

}
