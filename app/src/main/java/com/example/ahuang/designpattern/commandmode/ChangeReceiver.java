package com.example.ahuang.designpattern.commandmode;

/*
 * ChangeReceiver  2019-05-09
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * Receiver角色，真正的命令执行者
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 09
 */
public class ChangeReceiver {

    /**
     * 真正处理节目加的逻辑
     */
     public void addItem(){
         System.out.println("节目+");
     }


    /**
     * 真正处理节目减的逻辑
     */
    public void subtractItem(){
         System.out.println("节目-");
     }


    /**
     * 真正处理音量加的逻辑
     */
    public void addVoice(){
        System.out.println("音量+");
    }

    /**
     * 真正处理音量减的逻辑
     */
    public void subtractVoice(){
        System.out.println("音量-");
    }

}