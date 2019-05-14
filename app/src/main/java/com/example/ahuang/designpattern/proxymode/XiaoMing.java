package com.example.ahuang.designpattern.proxymode;

/*
 * XiaoMing  2019-04-16
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 16
 */
public class XiaoMing implements IRent{


    @Override
    public void findHouse() {
        System.out.println("查看房子");
    }

    @Override
    public void consult() {
        System.out.println("协商房租");
    }

    @Override
    public void contract() {
        System.out.println("签订租房合同");
    }



    @Override
    public void finish() {
        System.out.println("完成租房");
    }
}