package com.example.ahuang.designpattern.statemode;

/*
 * StoppingState  2019-06-11
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 06 11
 */
public class StoppingState implements ILiftState{
    @Override
    public void open() {
        System.out.println("停打开电梯门");
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("运行电梯");
    }

    @Override
    public void stop() {

    }
}