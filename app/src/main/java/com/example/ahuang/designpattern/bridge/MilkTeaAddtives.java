package com.example.ahuang.designpattern.bridge;

/*
 * MilkTeaAddtives  2019-03-05
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * 实现部分
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 05
 */
public abstract class MilkTeaAddtives {

    /**
     * 具体往奶茶里添加什么，由子类实现
     * @return
     */
    public abstract String addSomething();
}