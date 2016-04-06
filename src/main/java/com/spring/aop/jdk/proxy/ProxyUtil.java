package com.spring.aop.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class ProxyUtil implements InvocationHandler {
    
    private Object target;//被代理的对象

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("do something before");
        // 调用被代理对象的方法并得到返回值
        Object result = method.invoke(target, args);
        System.out.println("do something after");
        return result;
    }

    public ProxyUtil(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
    
}
