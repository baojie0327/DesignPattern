package com.example.ahuang.designpattern.strategymode;

public interface IDiscountStrategy {

    /**
     * 根据消费金额，计算实际花费金额
     * @param count
     * @return
     */
    double getPrice(double count);
}
