package com.example.ahuang.designpattern.absfactory53.factory;

import com.example.ahuang.designpattern.factoryproblem51.impl.AMDCPU;
import com.example.ahuang.designpattern.factoryproblem51.impl.MSIMainboard;
import com.example.ahuang.designpattern.factoryproblem51.interf.CPUApi;
import com.example.ahuang.designpattern.factoryproblem51.interf.MainboardApi;

/**
 * Created by Frank on 2016/11/2 20:55.
 * Email:512395540@qq.com
 */
/**
 * 装机方案1：AMD CPU 939针 + 微星主板 939插口
 */
public class Schma2 implements AbstractFactory{
    /**
     * AMD的CPU+微星的主板
     * @return
     */
    @Override
    public CPUApi createCPU() {
        return new AMDCPU(939);
    }

    @Override
    public MainboardApi createMainboard() {
        return new MSIMainboard(939);
    }
}
