package com.example.ahuang.designpattern.bridge;

/*
 * SmallMilkTea  2019-03-06
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 06
 */
public class SmallMilkTea extends MilkTea{
    /**
     * 构造方法
     *
     * @param milkTeaAddtives
     */
    public SmallMilkTea(MilkTeaAddtives milkTeaAddtives) {
        super(milkTeaAddtives);
    }

    @Override
    public void makeMilkTea() {
        System.out.println("小杯的"+mMilkTeaAddtives.addSomething()+"奶茶");
    }
}