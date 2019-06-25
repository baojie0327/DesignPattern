package com.example.ahuang.designpattern.strategymode;

/*
 * StrategyContext  2019-06-18
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 06 18
 */
public class StrategyContext {

    // 持有一个策略实现的引用
    private IDiscountStrategy mIDiscountStrategy;

    public StrategyContext(IDiscountStrategy strategy) {
        this.mIDiscountStrategy = strategy;
    }

    public double offerPrice(double count){
        return mIDiscountStrategy.getPrice(count);
    }


}