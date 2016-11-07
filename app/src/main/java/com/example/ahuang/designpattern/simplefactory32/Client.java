package com.example.ahuang.designpattern.simplefactory32;

import com.example.ahuang.designpattern.simplefactory32.factory.Factory;
import com.example.ahuang.designpattern.simplefactory32.interf.Api;

/**
 * Created by Frank on 2016/11/2 11:11.
 * Email:512395540@qq.com
 */
public class Client {
    public static void main(String[] args){
        /**
         * 建iphone6s手机生产工厂
         */
        Api api1= Factory.createApi(4588);
        api1.operation("手机");
        /**
         * 建iphone7手机生产工厂
         */
        Api api2=Factory.createApi(5388);
        api2.operation("手机");
    }
}
