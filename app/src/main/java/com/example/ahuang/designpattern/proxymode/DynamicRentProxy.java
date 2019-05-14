package com.example.ahuang.designpattern.proxymode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * DynamicRentProxy  2019-04-17
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 17
 */
public class DynamicRentProxy implements InvocationHandler {

    private Object mObject;

    public DynamicRentProxy(Object object){
        this.mObject=object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用被代理类对象的方法
        Object result=method.invoke(mObject, args);
        return result;
    }
}