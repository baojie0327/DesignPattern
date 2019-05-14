package com.example.ahuang.designpattern.mediator;

/*
 * ConcreteColleagueA  2019-05-13
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 13
 */
public class ConcreteColleagueA extends Colleague{


    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueA将信息传递给中介者处理");
    }
}