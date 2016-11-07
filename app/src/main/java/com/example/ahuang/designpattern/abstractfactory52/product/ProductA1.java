package com.example.ahuang.designpattern.abstractfactory52.product;

import com.example.ahuang.designpattern.abstractfactory52.interf.AbstractProductA;

/**
 * Created by Frank on 2016/11/2 20:27.
 * Email:512395540@qq.com
 */
public class ProductA1 implements AbstractProductA{
    @Override
    public void productA(String s) {
        System.out.println("ProductA1---"+s);
    }
}
