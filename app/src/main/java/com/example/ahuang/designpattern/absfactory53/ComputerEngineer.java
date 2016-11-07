package com.example.ahuang.designpattern.absfactory53;

/**
 * Created by Frank on 2016/11/2 16:46.
 * Email:512395540@qq.com
 */

import com.example.ahuang.designpattern.absfactory53.factory.AbstractFactory;
import com.example.ahuang.designpattern.factoryproblem51.interf.CPUApi;
import com.example.ahuang.designpattern.factoryproblem51.interf.MainboardApi;

/**
 * 装机工程师
 */
public class ComputerEngineer {
    //组装机器需要的CPU
    private CPUApi cpu=null;
    //组装机器需要的主板
    private MainboardApi mainboard=null;

    /**
     * 装机过程
     * @param
     * @param
     */
    public void makeComputer(AbstractFactory schema){

        //1.挑选硬件
        prepareHardware(schema);
        //2.组装机器
        //3.测试机器
        //4.交付客户

    }

    /**
     * 挑选硬件
     * @param
     */
    private void prepareHardware(AbstractFactory schema){
        cpu= schema.createCPU();
        mainboard= schema.createMainboard();

        //测试硬件是否好用
        cpu.calculate();
        mainboard.installCPU();

    }
}
