package com.example.ahuang.designpattern.abstractfactory.interfaces;

public interface AbstractFactory {

    /**
     * 创建CPU对象
     * @return
     */
    public ICPU createCpu();

    /**
     * 创建屏幕对象
     * @return
     */
    public IScreen createScreen();


}
