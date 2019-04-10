package com.example.ahuang.designpattern.adaptermode;

/*
 * VoltsAdapter  2019-02-19
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 02 19
 */
// 对象适配器模式
public class VoltsAdapter implements FiveVolt{

    Volt220 mVolt220;

    public VoltsAdapter(Volt220 adaptee){
        mVolt220=adaptee;
    }


    public int getVolt220(){
        return mVolt220.getVolt220();
    }


    @Override
    public int getVole5() {
        return 5;
    }
}