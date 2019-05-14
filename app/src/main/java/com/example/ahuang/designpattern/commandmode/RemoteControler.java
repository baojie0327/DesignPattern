package com.example.ahuang.designpattern.commandmode;

/*
 * RemoteControler  2019-05-09
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 09
 */
public class RemoteControler {

    private AddItemCommand mAddItemCommand;       // 节目加命令对象的引用
    private SubtractItemCommand mSubtractItemCommand;  // 节目减命令的引用
    private AddVoiceCommand mAddVoiceCommand;         // 声音加命令的引用
    private SubtractVoiceCommand mSubtractVoiceCommand;  // 声音减命令的引用


    public void setAddItemCommand(AddItemCommand addItemCommand) {
        mAddItemCommand = addItemCommand;
    }


    public void setSubtractItemCommand(SubtractItemCommand subtractItemCommand) {
        mSubtractItemCommand = subtractItemCommand;
    }

    public void setAddVoiceCommand(AddVoiceCommand addVoiceCommand) {
        mAddVoiceCommand = addVoiceCommand;
    }


    public void setSubtractVoiceCommand(SubtractVoiceCommand subtractVoiceCommand) {
        mSubtractVoiceCommand = subtractVoiceCommand;
    }


    /**
     * 遥控器上的节目加按键
     */
    public void addItem(){
        mAddItemCommand.execute();
    }


    /**
     * 遥控器上的节目减按键
     */
    public void subtractItem(){
        mSubtractItemCommand.execute();
    }


    /**
     * 遥控器上的声音加按键
     */
    public void addVoice(){
        mAddVoiceCommand.execute();
    }



    /**
     * 遥控器上的声音减按键
     */
    public void subtractVoice(){
        mSubtractVoiceCommand.execute();
    }


}