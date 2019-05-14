package com.example.ahuang.designpattern.mediator;

/*
 * ConcreteColleagueB  2019-05-13
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 13
 */
public class ConcreteColleagueB extends Colleague{

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueB将信息传递给中介者处理");
    }
}