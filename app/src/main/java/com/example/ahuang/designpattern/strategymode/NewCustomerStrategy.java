package com.example.ahuang.designpattern.strategymode;

/*
 * NewCustomerStrategy  2019-06-17
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * 新用户报价
 * @author Jackson
 * @version 1.0.0
 * since 2019 06 17
 */
public class NewCustomerStrategy implements IDiscountStrategy {
    
    @Override
    public double getPrice(double count) {
        System.out.println("-----新用户报价策略----");
        if (count < 1000) {
            return count;
        } else {
            return count * 0.9;
        }

    }
}