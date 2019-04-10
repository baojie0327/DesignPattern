package com.example.ahuang.designpattern.bridge;

/*
 * MiddleMilkTea  2019-03-07
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 07
 */
public class MiddleMilkTea extends MilkTea{
    /**
     * 构造方法
     *
     * @param milkTeaAddtives
     */
    public MiddleMilkTea(MilkTeaAddtives milkTeaAddtives) {
        super(milkTeaAddtives);
    }

    @Override
    public void makeMilkTea() {
        System.out.println("中杯的"+mMilkTeaAddtives.addSomething()+"奶茶");
    }
}