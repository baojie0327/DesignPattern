package com.example.ahuang.designpattern.bridge;

/*
 * OrdinaryMilkTea  2019-03-06
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * 实现部分的具体实现二 ，普通
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 06
 */
public class OrdinaryMilkTea extends MilkTeaAddtives{
    @Override
    public String addSomething() {
        return "原味";
    }
}