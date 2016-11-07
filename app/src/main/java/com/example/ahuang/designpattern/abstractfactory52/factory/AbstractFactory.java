package com.example.ahuang.designpattern.abstractfactory52.factory;

/**
 * Created by Frank on 2016/11/2 20:12.
 * Email:512395540@qq.com
 */

import com.example.ahuang.designpattern.abstractfactory52.interf.AbstractProductA;
import com.example.ahuang.designpattern.abstractfactory52.interf.AbstractProductB;

/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
 */
public interface AbstractFactory {

    /**
     * 创建抽象产品A的对象
     */
    public AbstractProductA createProductA();

    /**
     * 创建抽象产品B的对象
     */
    public AbstractProductB createProductB();




}
