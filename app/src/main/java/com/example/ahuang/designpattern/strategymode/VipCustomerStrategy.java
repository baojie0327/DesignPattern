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
public class VipCustomerStrategy implements IDiscountStrategy{

    @Override
    public double getPrice(double count) {
        System.out.println("-----VIP用户报价策略----");
        if (count < 800) {
            return count*0.8;
        } else {
            return count * 0.7;
        }
    }
}