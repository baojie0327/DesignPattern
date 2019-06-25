package com.example.ahuang.designpattern.strategymode;

/*
 * OldCustomerStrategy  2019-06-18
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 06 18
 */
public class OldCustomerStrategy implements IDiscountStrategy{

    @Override
    public double getPrice(double count) {
        System.out.println("-----老用户报价策略----");
        if (count < 900) {
            return count*0.9;
        } else {
            return count * 0.8;
        }
    }
}