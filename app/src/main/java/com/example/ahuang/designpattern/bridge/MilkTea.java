package com.example.ahuang.designpattern.bridge;

/*
 * MilkTea  2019-03-05
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * 抽象部分
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 05
 */
public abstract class MilkTea {

    protected MilkTeaAddtives mMilkTeaAddtives;  // 声明一个实现部分对象的引用

    /**
     * 构造方法
     * @param milkTeaAddtives
     */
    public MilkTea(MilkTeaAddtives milkTeaAddtives) {
        this.mMilkTeaAddtives = milkTeaAddtives;
    }

    /**
     * 具体什么样的奶茶由子类决定
     */
    public abstract void makeMilkTea();


}