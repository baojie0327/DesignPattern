package com.example.ahuang.designpattern.bridge;

/*
 * SugerAddMilkTea  2019-03-06
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * 实现部分的具体实现，加糖
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 06
 */
public class SugerAddMilkTea extends MilkTeaAddtives{
    @Override
    public String addSomething() {
        return "加糖";
    }
}