package com.example.ahuang.designpattern.mediator;

/*
 * LianJiaHouseMediator  2019-05-14
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 14
 */
public class LianJiaHouseMediator extends HouseMediator{

    @Override
    public void method() {
        mCustomerBuyer.register();
        mCustomerSeller.register();
        mCustomerBuyer.sendMes();
        mCustomerSeller.receiverMsg();
        mCustomerSeller.sendMes();
        mCustomerBuyer.receiverMsg();
        mCustomerBuyer.action();
        mCustomerSeller.action();
    }
}