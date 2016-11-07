package com.example.ahuang.designpattern.absfactory53.impl;

import com.example.ahuang.designpattern.factoryproblem51.interf.CPUApi;

/**
 * Created by Frank on 2016/11/2 16:26.
 * Email:512395540@qq.com
 */

/**
 * AMD CPU
 */
public class AMDCPU implements CPUApi {
    //CPU针脚数
    private int pins;

    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU,pins="+pins);
    }
}
