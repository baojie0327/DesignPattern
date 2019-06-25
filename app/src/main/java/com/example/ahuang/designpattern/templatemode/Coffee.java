package com.example.ahuang.designpattern.templatemode;

/*
 * Coffee  2019-06-25
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 06 25
 */
public class Coffee extends Beverage{

    @Override
    public void brew() {
        System.out.println("用水冲咖啡");
    }

    @Override
    public void addSomething() {
        System.out.println("往咖啡里加点糖或者牛奶");
    }
}