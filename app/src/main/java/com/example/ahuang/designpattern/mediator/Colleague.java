package com.example.ahuang.designpattern.mediator;

/*
 * Colleague  2019-05-13
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 13
 */
public abstract class Colleague {

    protected Mediator mMediator;   // 中介者对象

    public Colleague(Mediator mediator){
        this.mMediator=mediator;
    }

    /**
     * 同事的具体行为，由子类去实现
     */
    public abstract void action();

}