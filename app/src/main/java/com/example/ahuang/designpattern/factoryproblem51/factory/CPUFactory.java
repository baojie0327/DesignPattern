package com.example.ahuang.designpattern.factoryproblem51.factory;

/**
 * Created by Frank on 2016/11/2 16:36.
 * Email:512395540@qq.com
 */

import com.example.ahuang.designpattern.factoryproblem51.impl.AMDCPU;
import com.example.ahuang.designpattern.factoryproblem51.impl.IntelCPU;
import com.example.ahuang.designpattern.factoryproblem51.interf.CPUApi;

/**
 * 创建CPU的工厂
 */
public class CPUFactory {

    public static CPUApi createCPUApi(int type){
        CPUApi cpu=null;
        //根据参数来选择需要创建的CPU
        switch (type){
            case 1:
                cpu=new IntelCPU(1156);//生产Intel 1156针CPU
                break;
            case 2:
                cpu=new AMDCPU(939);//生产AMD 939针CPU
                break;
            default:
                break;
        }
        return cpu;
    }
}
