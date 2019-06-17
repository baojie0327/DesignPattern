package com.example.ahuang.designpattern.observermode;

import java.util.ArrayList;
import java.util.List;

/*
 * Subject  2019-05-27
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 27
 */
public abstract class Subject {

    // 定义一个观察者数组
    private List<Observer> mObservers=new ArrayList<>();

    /**
     * 注册观察者对象
     * @param o
     */
    public void addObserver(Observer o){
        this.mObservers.add(o);
    }


    /**
     * 移除观察者对象
     * @param o
     */
    public void deleteObserver(Observer o){
        this.mObservers.remove(o);
    }


    /**
     * 通知所有观察者更新
     */
    public void notifyObserver(){
        for (Observer observer:mObservers){
            observer.update();
        }
     }



}