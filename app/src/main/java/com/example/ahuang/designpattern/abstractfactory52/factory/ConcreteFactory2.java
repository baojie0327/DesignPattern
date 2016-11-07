package com.example.ahuang.designpattern.abstractfactory52.factory;

import com.example.ahuang.designpattern.abstractfactory52.interf.AbstractProductA;
import com.example.ahuang.designpattern.abstractfactory52.interf.AbstractProductB;
import com.example.ahuang.designpattern.abstractfactory52.product.ProductA2;
import com.example.ahuang.designpattern.abstractfactory52.product.ProductB2;

/**
 * Created by Frank on 2016/11/2 20:32.
 * Email:512395540@qq.com
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
