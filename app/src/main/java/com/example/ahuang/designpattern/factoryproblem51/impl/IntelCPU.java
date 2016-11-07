package com.example.ahuang.designpattern.factoryproblem51.impl;

import com.example.ahuang.designpattern.factoryproblem51.interf.CPUApi;

/**
 * Created by Frank on 2016/11/2 16:24.
 * Email:512395540@qq.com
 */

/**
 * 生产Intel的CPU
 */
public class IntelCPU implements CPUApi {
    //CPU针脚数
    private int pins;

    public IntelCPU(int pins) {
        this.pins = pins;
    }

    //Intel的CPU
    @Override
    public void calculate() {
        System.out.println("Intel CPU,pins="+pins);
    }
}
