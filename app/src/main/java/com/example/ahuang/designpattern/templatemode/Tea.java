package com.example.ahuang.designpattern.templatemode;

/*
 * Tea  2019-06-25
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 06 25
 */
public class Tea extends Beverage{
    @Override
    public void brew() {
        System.out.println("用水冲茶");
    }

    @Override
    public void addSomething() {
        System.out.println("加点蜂蜜");
    }
}