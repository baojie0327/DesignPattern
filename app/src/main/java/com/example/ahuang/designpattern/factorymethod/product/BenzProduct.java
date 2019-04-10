package com.example.ahuang.designpattern.factorymethod.product;

/*
 * BenzProduct  2018-12-10
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 10
 */
public class BenzProduct extends Product {
    @Override
    public void drive() {
        System.out.println("Benz车行驶中...");
    }
}