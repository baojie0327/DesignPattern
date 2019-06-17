package com.example.ahuang.designpattern.observermode;

/*
 * ConcreteObserver  2019-05-27
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 27
 */
public class ConcreteObserver implements Observer {


    @Override
    public void update() {
        System.out.println("接收到更新通知，更新！");
    }
}