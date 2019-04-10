package com.example.ahuang.designpattern.decoratemode;

/*
 * Decorator  2019-03-13
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * 抽象的装饰者
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 13
 */
public abstract class Decorator extends Beverage {

    protected Beverage mBeverage; // 其内部保持一个被装饰类的引用

    /**
     * 构造方法
     * @param beverage
     */
    public Decorator(Beverage beverage){
        this.mBeverage=beverage;
    }

    @Override
    public void makeBeverage() {
        // 调用Beverage的makeBeverage（)方法）
        mBeverage.makeBeverage();
    }
}