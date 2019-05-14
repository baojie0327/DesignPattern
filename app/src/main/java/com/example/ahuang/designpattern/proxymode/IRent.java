package com.example.ahuang.designpattern.proxymode;

/**
 * 抽象主题类，租房子
 */
public interface IRent {

    // 查找房源
    void findHouse();
    // 协商租金
    void consult();
    // 签订合同
    void contract();
    // 完成租房
    void finish();

}
