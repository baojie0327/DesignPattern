package com.example.ahuang.designpattern.decoratemode;

/*
 * MilkTea  2019-03-13
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * 组件的具体实现，被装饰的具体对象
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 13
 */
public class MilkTea extends Beverage {

    @Override
    public void makeBeverage() {
        // 奶茶的基本逻辑
        System.out.println("     添加奶茶    ");
    }
}