package com.example.ahuang.designpattern.factorymethod41.impl;

import com.example.ahuang.designpattern.factorymethod41.Interf.Factory;
import com.example.ahuang.designpattern.factorymethod41.Interf.Product;

/**
 * Created by Frank on 2016/11/2 14:04.
 * Email:512395540@qq.com
 */

/**
 * 建立iphone6s手机生产工厂
 */
public class ConcreteFactoryA extends Factory {
    //具有生产iphpne6s手机的能力
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
