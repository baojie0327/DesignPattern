package com.example.ahuang.designpattern.mediator;

/*
 * Mediator  2019-05-13
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 13
 */
public abstract class Mediator {

    protected ConcreteColleagueA mConcreteColleagueA;
    protected ConcreteColleagueB mConcreteColleagueB;

    /**
     * 抽象的中介方法，由子类实现
     */
    public abstract void method();


    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        mConcreteColleagueA = concreteColleagueA;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        mConcreteColleagueB = concreteColleagueB;
    }
}