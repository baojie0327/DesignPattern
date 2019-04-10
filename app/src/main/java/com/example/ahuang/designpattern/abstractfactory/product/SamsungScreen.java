package com.example.ahuang.designpattern.abstractfactory.product;

import com.example.ahuang.designpattern.abstractfactory.interfaces.IScreen;

/*
 * SamsungScreen  2018-12-14
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * 三星的屏幕
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 14
 */
public class SamsungScreen implements IScreen {
    @Override
    public void display() {
        System.out.println("三星的屏幕显示中....");
    }
}