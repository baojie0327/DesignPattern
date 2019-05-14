package com.example.ahuang.designpattern.responsiblechain;

/*
 * ConcreteHandler1  2019-04-23
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 23
 */
public class ConcreteHandler1 extends Handler{

    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler1")){
            System.out.println("ConcreteHandler1 handled");
            return;
        }else {
            successor.handleRequest(condition);
        }
    }
}