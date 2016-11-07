package com.example.ahuang.designpattern.simplefactory31;

/**
 * Created by Frank on 2016/11/3 14:01.
 * Email:512395540@qq.com
 */

/**
 * 客户端代码
 */
public class Client {
    public static void main(String[] args){
        //得到iphone6s手机
        Api api=new ImplA();
        api.operation("手机");
        //得到iphone7手机
        Api api1=new ImplB();
        api1.operation("手机");
    }
}
