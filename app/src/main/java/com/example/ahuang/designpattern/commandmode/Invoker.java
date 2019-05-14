package com.example.ahuang.designpattern.commandmode;

/*
 * Invoker  2019-05-07
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 07
 */
public class Invoker {

    private Command mCommand; // 持有一个对应命令对象的引用

    public Invoker(Command command){
        this.mCommand=command;
    }

    public void action(){
        // 调用具体命令对象的相关方法，执行具体命令
        mCommand.execute();
    }

}