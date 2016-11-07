package com.example.ahuang.designpattern.simplefactory32.impl;

/**
 * Created by Frank on 2016/11/2 10:38.
 * Email:512395540@qq.com
 */

import com.example.ahuang.designpattern.simplefactory32.interf.Api;

/**
 * 接口的具体实现类，生产iphone6s手机
 */
public class ImplA implements Api {
    @Override
    public void operation(String s) {
        System.out.println("iphone6s--"+s);
    }
}
