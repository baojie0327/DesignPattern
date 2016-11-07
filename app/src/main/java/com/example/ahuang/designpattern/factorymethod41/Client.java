package com.example.ahuang.designpattern.factorymethod41;

import com.example.ahuang.designpattern.factorymethod41.Interf.Product;
import com.example.ahuang.designpattern.factorymethod41.impl.ConcreteFactoryA;
import com.example.ahuang.designpattern.factorymethod41.impl.ConcreteFactoryB;

/**
 * Created by Frank on 2016/11/2 15:02.
 * Email:512395540@qq.com
 */
public class Client {
    public static void main(String[] args){
        //建立iphone6s手机生产工厂并生产手机
        Product concreteProductA=new ConcreteFactoryA().createProduct();
        concreteProductA.operation("手机");
        //建立iphone7手机生产工厂并生产手机
        Product concreteProductB=new ConcreteFactoryB().createProduct();
        concreteProductB.operation("手机");
    }
}
