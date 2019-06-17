package com.example.ahuang.designpattern.statemode;

/*
 * Lift  2019-06-11
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 06 11
 */
public class Lift implements ILift{

    private int state;

    @Override
    public void setState(int state) {
        this.state=state;

    }


    // 电梯门打开
    @Override
    public void open() {
        switch (state){
            case ILift.OPENING_STATE:  // 如果是打开状态，本来就是打开的，什么也不用做

                break;

            case ILift.CLOSING_STATE: // 关闭状态，可以打开
                System.out.println("打开电梯门");
                setState(ILift.OPENING_STATE);
                break;
            case ILift.RUNNING_STATE:  // 运行状态下是不能打开电梯门的

                break;

            case ILift.STOPPING_STATE:  // 停止状态可以打开电梯门
                System.out.println("打开电梯门");
                setState(ILift.OPENING_STATE);
                break;
        }
    }

    @Override
    public void close() {
        switch (state){
            case ILift.OPENING_STATE:  // 打开状态，可以关闭
                System.out.println("关闭电梯门");
                setState(ILift.CLOSING_STATE);
                break;

            case ILift.CLOSING_STATE: // 关闭状态，什么都不用做

                break;
            case ILift.RUNNING_STATE:  // 运行状态,本来就是关闭的

                break;

            case ILift.STOPPING_STATE:  // 停止状态,本来就是关闭的

                break;
        }
    }

    @Override
    public void run() {
        switch (state){
            case ILift.OPENING_STATE:  // 运行状态，不能开门

                break;

            case ILift.CLOSING_STATE: // 关闭状态，什么都不用做

                break;
            case ILift.RUNNING_STATE:  // 运行状态,什么都不用做

                break;

            case ILift.STOPPING_STATE:  // 运行状态，可以停止
                System.out.println("停止电梯");
                setState(ILift.STOPPING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (state){
            case ILift.OPENING_STATE:  // 停止状态，可以开门
                System.out.println("打开电梯");
                setState(ILift.OPENING_STATE);
                break;

            case ILift.CLOSING_STATE: // 关闭状态，什么都不用做

                break;
            case ILift.RUNNING_STATE:  // 停止状态,可以运行
                System.out.println("运行电梯");
                setState(ILift.RUNNING_STATE);
                break;

            case ILift.STOPPING_STATE:  // 停止状态，什么都不用做

                break;
        }
    }
}