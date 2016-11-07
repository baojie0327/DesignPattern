package com.example.ahuang.designpattern.factorymethod41.impl;

import com.example.ahuang.designpattern.factorymethod41.Interf.Product;

/**
 * Created by Frank on 2016/11/2 13:57.
 * Email:512395540@qq.com
 */

/**
 * 生产iphone7手机
 */
public class ConcreteProductB implements Product {
    @Override
    public void operation(String s) {
        System.out.println("iphone7---"+s);
    }
}
