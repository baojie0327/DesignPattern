package com.example.ahuang.designpattern.observermode;

import java.util.Observable;
import java.util.Observer;

/*
 * Developer  2019-05-27
 * Copyright (c) 2019 KL Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 27
 */
public class Developer implements Observer {

    private String name;

    public Developer(String name){
        this.name=name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("你好，"+name+",Android开发网站更新啦，内容："+arg);
    }
}