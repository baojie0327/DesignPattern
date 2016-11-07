package com.example.ahuang.designpattern.simplefactory31;

/**
 * Created by Frank on 2016/11/3 13:59.
 * Email:512395540@qq.com
 */

/**
 * 定义一个接口实现，生产iphone6s手机
 */
public class ImplA implements Api{
    @Override
    public void operation(String s) {
       System.out.println("iphone6s--"+s);
    }
}
