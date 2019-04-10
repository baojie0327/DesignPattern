package com.example.ahuang.designpattern.factorymethod.product;

/*
 * AudiProduct  2018-12-10
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 10
 */
public class AudiProduct extends Product {
    @Override
    public void drive() {
        System.out.println("Audi车行驶中...");
    }
}