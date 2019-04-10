package com.example.ahuang.designpattern.abstractfactory.product;

import com.example.ahuang.designpattern.abstractfactory.interfaces.ICPU;

/*
 * MTKCpu  2018-12-14
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * MTK的CPU
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 14
 */
public class MTKCpu implements ICPU {
    @Override
    public void calculate() {
        System.out.println("联发科cpu计算中....");
    }
}