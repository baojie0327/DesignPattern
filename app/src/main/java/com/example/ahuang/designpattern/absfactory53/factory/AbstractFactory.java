package com.example.ahuang.designpattern.absfactory53.factory;

/**
 * Created by Frank on 2016/11/2 20:42.
 * Email:512395540@qq.com
 */

import com.example.ahuang.designpattern.factoryproblem51.interf.CPUApi;
import com.example.ahuang.designpattern.factoryproblem51.interf.MainboardApi;

/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     */
    public CPUApi createCPU();

    /**
     * 创建主板对象
     */
    public MainboardApi createMainboard();
}
