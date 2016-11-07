package com.example.ahuang.designpattern.factoryproblem51.interf;

/**
 * Created by Frank on 2016/11/2 16:21.
 * Email:512395540@qq.com
 */

/**
 * 主板接口，提供生产主板的能力
 */
public interface MainboardApi {

    //主板具有安装CPU的能力
    void installCPU();
}
