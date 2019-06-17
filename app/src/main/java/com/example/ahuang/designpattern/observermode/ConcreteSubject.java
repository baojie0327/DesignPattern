package com.example.ahuang.designpattern.observermode;

/*
 * ConcreteSubject  2019-05-27
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 27
 */
public class ConcreteSubject extends Subject{

    /**
     * 具体的业务逻辑
     */
    public void doSomething(){
        super.notifyObserver();
    }
}