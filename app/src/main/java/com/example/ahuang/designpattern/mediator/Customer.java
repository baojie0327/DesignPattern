package com.example.ahuang.designpattern.mediator;

/*
 * Customer  2019-05-14
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 14
 */
public abstract class Customer {

    protected HouseMediator mHouseMediator; // 持有一个中介者对象

    public Customer(HouseMediator houseMediator){
        this.mHouseMediator=houseMediator;
    }

    //注册
    public abstract void register();

    //发送消息
    public abstract void sendMes();

    //接收消息
    public abstract void receiverMsg();


    //接收消息
    public abstract void action();


}