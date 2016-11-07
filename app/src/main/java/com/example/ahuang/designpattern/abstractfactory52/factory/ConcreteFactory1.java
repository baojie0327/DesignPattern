package com.example.ahuang.designpattern.abstractfactory52.factory;

import com.example.ahuang.designpattern.abstractfactory52.interf.AbstractProductA;
import com.example.ahuang.designpattern.abstractfactory52.interf.AbstractProductB;
import com.example.ahuang.designpattern.abstractfactory52.product.ProductA1;
import com.example.ahuang.designpattern.abstractfactory52.product.ProductB1;

/**
 * Created by Frank on 2016/11/2 20:31.
 * Email:512395540@qq.com
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
