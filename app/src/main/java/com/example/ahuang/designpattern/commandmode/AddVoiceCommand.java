package com.example.ahuang.designpattern.commandmode;

/*
 * AddItemCommand  2019-05-09
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 09
 */
public class AddVoiceCommand implements Command{

    // 持有一个接收者对象的引用
    private ChangeReceiver mChangeReceiver;


    public AddVoiceCommand(ChangeReceiver changeReceiver){
        this.mChangeReceiver=changeReceiver;
    }



    @Override
    public void execute() {
        // 调用遥控器的具体方法执行操作
        mChangeReceiver.addVoice();
    }
}