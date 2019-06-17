package com.example.ahuang.designpattern.statemode;

/*
 * LiftController  2019-06-11
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 06 11
 */
public class LiftController implements ILiftController{


    private ILiftState mLiftState;


    @Override
    public void setState(ILiftState state) {
        this.mLiftState=state;
    }

    @Override
    public void open() {
        mLiftState.open();
    }

    @Override
    public void close() {
        mLiftState.close();
    }

    @Override
    public void run() {
        mLiftState.run();
    }

    @Override
    public void stop() {
        mLiftState.stop();
    }
}