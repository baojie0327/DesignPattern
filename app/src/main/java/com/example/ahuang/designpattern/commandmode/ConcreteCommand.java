package com.example.ahuang.designpattern.commandmode;

/*
 * ConcreteCommand  2019-05-07
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 07
 */
public class ConcreteCommand implements Command{

    private Receiver mReceiver;

    public ConcreteCommand(Receiver receiver){
        this.mReceiver=receiver;
    }


    @Override
    public void execute() {
        // 调用接收者的相关方法来执行具体逻辑
        mReceiver.action();
    }
}