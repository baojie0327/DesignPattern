package com.example.ahuang.designpattern.commandmode;

/*
 * Receiver  2019-05-07
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 07
 */
public class Receiver {

    /**
     * 真正执行具体命令逻辑的方法
     */
    public void action(){
        System.out.println("执行具体的操作");
    }
}