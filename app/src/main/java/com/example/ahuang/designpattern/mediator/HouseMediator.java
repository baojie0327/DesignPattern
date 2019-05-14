package com.example.ahuang.designpattern.mediator;

/*
 * HouseMediator  2019-05-14
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 14
 */
public abstract class HouseMediator {


    protected CustomerBuyer mCustomerBuyer;   // 买家对象
    protected CustomerSeller mCustomerSeller;  // 卖家对象

    /**
     * 抽象的中介方法，模拟房子的交易过程，由子类实现
     */
    public abstract void method();


    public void setCustomerBuyer(CustomerBuyer customerBuyer) {
        mCustomerBuyer = customerBuyer;
    }

    public void setCustomerSeller(CustomerSeller customerSeller) {
        mCustomerSeller = customerSeller;
    }
}