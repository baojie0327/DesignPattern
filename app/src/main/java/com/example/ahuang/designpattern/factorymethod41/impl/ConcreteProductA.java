package com.example.ahuang.designpattern.factorymethod41.impl;

import com.example.ahuang.designpattern.factorymethod41.Interf.Product;

/**
 * Created by Frank on 2016/11/2 13:55.
 * Email:512395540@qq.com
 */

/**
 * 生产小iphone6s手机
 */
public class ConcreteProductA implements Product {
    @Override
    public void operation(String s) {
        System.out.println("iphone6s---"+s);
    }
}
