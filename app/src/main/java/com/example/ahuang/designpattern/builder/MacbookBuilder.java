package com.example.ahuang.designpattern.builder;

/**
 * Created by Hbj on 2016/11/8 17:16.
 * Email:512395540@qq.com
 */

/**
 * 具体的Builder类
 */
public class MacbookBuilder extends Builder{
    //建立用于返回装配产品的对象
    private Computer mComputer=new Computer();
    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOs(String os) {
        mComputer.setOS(os);
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
