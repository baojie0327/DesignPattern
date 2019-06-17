package com.example.ahuang.designpattern.observermode;

import java.util.Observable;

/*
 * DevelopTribune  2019-05-27
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 27
 */
public class DevelopTribune extends Observable {

    // 自己的业务逻辑
    public void postNewPublish(String content){
        // 标识状态发生改变
        setChanged();
        // 通知所有观察者
        notifyObservers(content);
    }
}