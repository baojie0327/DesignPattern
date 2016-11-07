package com.example.ahuang.designpattern.abstractfactory52;

import com.example.ahuang.designpattern.abstractfactory52.factory.AbstractFactory;
import com.example.ahuang.designpattern.abstractfactory52.factory.ConcreteFactory1;

/**
 * Created by Frank on 2016/11/2 20:33.
 * Email:512395540@qq.com
 */
public class Client {
    public static void main(String[] args){
        //创建抽象工厂对象
        AbstractFactory factory=new ConcreteFactory1();
        factory.createProductA().productA("产品");
        factory.createProductB().productB("产品");
    }
}
