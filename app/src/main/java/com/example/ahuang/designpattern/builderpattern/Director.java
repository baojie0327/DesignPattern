package com.example.ahuang.designpattern.builderpattern;

/*
 * Director  2018-12-24
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * Director类，负责组建MacBook
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 24
 */
public class Director {

    Builder mBuilder=null;

    public Director(Builder builder){
        this.mBuilder=builder;
    }

    public void constract(String board,String display,String os){
        mBuilder.builderBoard(board);
        mBuilder.builderDisplay(display);
        mBuilder.builderOs(os);
    }



}