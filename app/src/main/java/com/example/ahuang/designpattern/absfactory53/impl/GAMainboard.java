package com.example.ahuang.designpattern.absfactory53.impl;

import com.example.ahuang.designpattern.factoryproblem51.interf.MainboardApi;

/**
 * Created by Frank on 2016/11/2 16:29.
 * Email:512395540@qq.com
 */

/**
 * 技嘉的主板
 */
public class GAMainboard implements MainboardApi {
    //CPU插槽孔数
    private int cpuHoles;

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("GAMainboard,pins="+cpuHoles);
    }
}
