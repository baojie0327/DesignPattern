package com.example.ahuang.designpattern.facademode;

/*
 * PhoneImpl  2019-03-26
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 26
 */
public class PhoneImpl implements Phone{

    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断电话");
    }
}