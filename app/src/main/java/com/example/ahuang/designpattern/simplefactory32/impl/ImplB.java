package com.example.ahuang.designpattern.simplefactory32.impl;

/**
 * Created by Frank on 2016/11/2 10:40.
 * Email:512395540@qq.com
 */

import com.example.ahuang.designpattern.simplefactory32.interf.Api;

/**
 * 接口的实现类B，生产iphone7手机
 */
public class ImplB implements Api {
    @Override
    public void operation(String s) {
        System.out.println("iphone7--"+s);
    }
}
