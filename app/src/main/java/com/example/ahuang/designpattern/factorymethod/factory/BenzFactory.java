package com.example.ahuang.designpattern.factorymethod.factory;

import com.example.ahuang.designpattern.factorymethod.product.BenzProduct;
import com.example.ahuang.designpattern.factorymethod.product.Product;

/*
 * BenzFactory  2018-12-10
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 10
 */
public class BenzFactory extends Factory {
    @Override
    public Product creatProduct() {
        return new BenzProduct();
    }
}