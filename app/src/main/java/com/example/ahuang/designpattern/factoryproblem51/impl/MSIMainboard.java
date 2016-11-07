package com.example.ahuang.designpattern.factoryproblem51.impl;

import com.example.ahuang.designpattern.factoryproblem51.interf.MainboardApi;

/**
 * Created by Frank on 2016/11/2 16:31.
 * Email:512395540@qq.com
 */

/**
 * 生产微星的主板
 */
public class MSIMainboard implements MainboardApi {
    //CPU插槽孔数
    private int cpuHoles;

    public MSIMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("MSIMainboard,pins="+cpuHoles);
    }
}
