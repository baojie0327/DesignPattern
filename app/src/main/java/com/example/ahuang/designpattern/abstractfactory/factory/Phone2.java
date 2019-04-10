package com.example.ahuang.designpattern.abstractfactory.factory;

import com.example.ahuang.designpattern.abstractfactory.interfaces.AbstractFactory;
import com.example.ahuang.designpattern.abstractfactory.interfaces.ICPU;
import com.example.ahuang.designpattern.abstractfactory.interfaces.IScreen;
import com.example.ahuang.designpattern.abstractfactory.product.LGScreen;
import com.example.ahuang.designpattern.abstractfactory.product.MTKCpu;

/*
 * Phone2  2018-12-14
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * MTK CPu+LG 屏幕
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 14
 */
public class Phone2 implements AbstractFactory {
    @Override
    public ICPU createCpu() {
        return new MTKCpu();
    }

    @Override
    public IScreen createScreen() {
        return new LGScreen();
    }
}