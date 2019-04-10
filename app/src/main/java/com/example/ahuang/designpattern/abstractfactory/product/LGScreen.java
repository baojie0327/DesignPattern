package com.example.ahuang.designpattern.abstractfactory.product;

import com.example.ahuang.designpattern.abstractfactory.interfaces.IScreen;

/*
 * LGScreen  2018-12-14
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 14
 */
public class LGScreen implements IScreen {
    @Override
    public void display() {
        System.out.println("LG的屏幕显示中...");
    }
}