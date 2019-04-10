package com.example.ahuang.designpattern.facademode;

/*
 * InternetImpl  2019-03-26
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 26
 */
public class InternetImpl implements Internet{
    @Override
    public void netPlay() {
        System.out.println("上网");
    }
}