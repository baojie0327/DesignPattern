package com.example.ahuang.designpattern.templatemode;

/*
 * Beverage  2019-06-25
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 06 25
 */
public abstract class Beverage {

    /**
     * 煮开水
     */
    public void boilWater(){
        System.out.println("煮开水");
    }

    /**
     * 冲泡
     */
    public abstract void brew();

    /**
     * 倒进杯子
     */
    public void pourInCup(){
        System.out.println("倒进杯子");
    }

    /**
     * 加点东西
     */
    public abstract void addSomething();


    /**
     * 冲泡茶叶或者咖啡流程
     * 用final修饰，防止算法被改写
     */
    public final void create(){
        boilWater();
        brew();
        pourInCup();
        addSomething();
    }


}