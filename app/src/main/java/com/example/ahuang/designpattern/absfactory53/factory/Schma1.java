package com.example.ahuang.designpattern.absfactory53.factory;

import com.example.ahuang.designpattern.factoryproblem51.impl.GAMainboard;
import com.example.ahuang.designpattern.factoryproblem51.impl.IntelCPU;
import com.example.ahuang.designpattern.factoryproblem51.interf.CPUApi;
import com.example.ahuang.designpattern.factoryproblem51.interf.MainboardApi;

/**
 * Created by Frank on 2016/11/2 20:54.
 * Email:512395540@qq.com
 */

/**
 * 装机方案1：Intel CPU 1156针 + 技嘉主板 1156插口
 */
public class Schma1 implements AbstractFactory{
    /**
     * Intel的CPU+技嘉的主板
     * @return
     */
    @Override
    public CPUApi createCPU() {
        return new IntelCPU(1156);
    }

    @Override
    public MainboardApi createMainboard() {
        return new GAMainboard(1156);
    }
}
