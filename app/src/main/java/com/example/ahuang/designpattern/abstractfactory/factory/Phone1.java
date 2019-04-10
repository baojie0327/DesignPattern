package com.example.ahuang.designpattern.abstractfactory.factory;

import com.example.ahuang.designpattern.abstractfactory.AbstractFactoryActivity;
import com.example.ahuang.designpattern.abstractfactory.interfaces.AbstractFactory;
import com.example.ahuang.designpattern.abstractfactory.interfaces.ICPU;
import com.example.ahuang.designpattern.abstractfactory.interfaces.IScreen;
import com.example.ahuang.designpattern.abstractfactory.product.QualcommCpu;
import com.example.ahuang.designpattern.abstractfactory.product.SamsungScreen;

/*
 * Phone1  2018-12-14
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * 手机1，高通cpu+三星屏幕
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 14
 */
public class Phone1 implements AbstractFactory {
    @Override
    public ICPU createCpu() {
        return new QualcommCpu();
    }

    @Override
    public IScreen createScreen() {
        return new SamsungScreen();
    }
}