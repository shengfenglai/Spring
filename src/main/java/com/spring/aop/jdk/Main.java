package com.spring.aop.jdk;


import java.lang.reflect.Proxy;

import com.spring.aop.jdk.proxy.ProxyUtil;
import com.spring.aop.jdk.service.UserService;
import com.spring.aop.jdk.service.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        Object proxyObject = new UserServiceImpl();
        ProxyUtil proxyUtil = new ProxyUtil(proxyObject);
        UserService userService  = (UserService) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                UserServiceImpl.class.getInterfaces(), proxyUtil);
        userService.addUser();
        userService.findUserById();
    }

}
