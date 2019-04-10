package com.example.ahuang.designpattern.flyweight;

/*
 * ConcreteFlyweight  2019-04-10
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 10
 */
public class ConcreteFlyweight extends Flyweight{
    // 接受外部状态
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }


    // 根据外部状态进行逻辑处理
    @Override
    public void operate() {
        // 业务处理

    }
}