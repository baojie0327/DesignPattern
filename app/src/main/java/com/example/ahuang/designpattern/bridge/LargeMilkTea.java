package com.example.ahuang.designpattern.bridge;

/*
 * LargeMilkTea  2019-03-06
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 06
 */
public class LargeMilkTea extends MilkTea{
    /**
     * 构造方法
     *
     * @param milkTeaAddtives
     */
    public LargeMilkTea(MilkTeaAddtives milkTeaAddtives) {
        super(milkTeaAddtives);
    }

    @Override
    public void makeMilkTea() {
        System.out.println("大杯的"+mMilkTeaAddtives.addSomething()+"奶茶");
    }
}