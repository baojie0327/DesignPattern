package com.example.ahuang.designpattern.flyweight;

/*
 * UnsharedConcreteFlyweight  2019-04-10
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 10
 */
public class UnsharedConcreteFlyweight extends Flyweight{

    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {

    }
}