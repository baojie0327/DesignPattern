package com.example.ahuang.designpattern.statemode;

/*
 * RunningState  2019-06-11
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 06 11
 */
public class RunningState implements ILiftState{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
        System.out.println("停止电梯");
    }
}