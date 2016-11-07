package com.example.ahuang.designpattern.abstractfactory52.product;

import com.example.ahuang.designpattern.abstractfactory52.interf.AbstractProductB;

/**
 * Created by Frank on 2016/11/2 20:28.
 * Email:512395540@qq.com
 */
public class ProductB1 implements AbstractProductB{
    @Override
    public void productB(String s) {
        System.out.println("ProductB1---"+s);
    }
}
