package com.example.ahuang.designpattern.mediator;

/*
 * ConcreteMediator  2019-05-13
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 13
 */
public class ConcreteMediator extends Mediator{

    @Override
    public void method() {
        mConcreteColleagueA.action();
        mConcreteColleagueB.action();
    }
}