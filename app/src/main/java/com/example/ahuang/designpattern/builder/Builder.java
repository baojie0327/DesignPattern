package com.example.ahuang.designpattern.builder;

/**
 * Created by Hbj on 2016/11/8 16:53.
 * Email:512395540@qq.com
 */

/**
 * 抽象的Builder类
 * 创建一个Product对象所需要的各个组件的操作
 * 同时提供一个让用户获取组装完成后的产品对象的方法
 */
public abstract class Builder {
    //设置主机
    public abstract void buildBoard(String board);
    //设置显示器
    public abstract void buildDisplay(String display);
    //设置操作系统
    public abstract void buildOs(String os);
    //返回组装完成后的产品对象
    public abstract Computer create();
}
