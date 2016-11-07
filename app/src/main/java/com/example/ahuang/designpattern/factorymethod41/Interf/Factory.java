package com.example.ahuang.designpattern.factorymethod41.Interf;

/**
 * Created by Frank on 2016/11/2 14:01.
 * Email:512395540@qq.com
 */

/**
 * 建立手机工厂的接口,返回的是Product接口类型
 */
public abstract class Factory {
    //生产手机的方法
    public abstract Product createProduct();
}
