package com.example.ahuang.designpattern.mediator;

/*
 * CustomerBuyer  2019-05-14
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 14
 */
public class CustomerSeller extends Customer {

    public CustomerSeller(HouseMediator houseMediator) {
        super(houseMediator);
    }

    @Override
    public void register() {
        System.out.println("注册为卖家-小华");
    }

    @Override
    public void sendMes() {
        System.out.println("卖家咨发送房子的信息");
    }

    @Override
    public void receiverMsg() {
        System.out.println("卖家接收房子的咨询信息");
    }

    @Override
    public void action() {
        System.out.println("卖家收钱");
    }
}