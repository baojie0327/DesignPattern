package com.example.ahuang.designpattern.simplefactory31;

/**
 * Created by Frank on 2016/11/3 16:52.
 * Email:512395540@qq.com
 */
/**
 * 定义一个接口实现，生产iphone7手机
 */
public class ImplB implements Api{
    @Override
    public void operation(String s) {
        System.out.println("iphone7--"+s);
    }
}
