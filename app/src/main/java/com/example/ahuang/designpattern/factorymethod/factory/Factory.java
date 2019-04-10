package com.example.ahuang.designpattern.factorymethod.factory;

import com.example.ahuang.designpattern.factorymethod.product.Product;

/*
 * Factory  2018-12-10
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 10
 */
public abstract class Factory {

    /**
     * 抽象工厂方法
     * 具体生产什么由子类去实现
     * @return
     */
    public abstract Product creatProduct();
}