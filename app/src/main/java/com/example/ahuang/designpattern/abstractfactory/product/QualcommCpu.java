package com.example.ahuang.designpattern.abstractfactory.product;

import com.example.ahuang.designpattern.abstractfactory.interfaces.ICPU;

/*
 * QualcommCpu  2018-12-14
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * 高通的cpu
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 14
 */
public class QualcommCpu implements ICPU {
    @Override
    public void calculate() {
        System.out.println("高通cpu计算中...");
    }
}