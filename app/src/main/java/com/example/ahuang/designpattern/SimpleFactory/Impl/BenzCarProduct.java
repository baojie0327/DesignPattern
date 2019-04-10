package com.example.ahuang.designpattern.SimpleFactory.Impl;


import com.example.ahuang.designpattern.SimpleFactory.interfaces.CarProduct;

/*
 *   2018-12-06
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 06
 */
public class BenzCarProduct implements CarProduct {
    @Override
    public void drive() {
        System.out.println("Benz车行驶中...");
    }
}