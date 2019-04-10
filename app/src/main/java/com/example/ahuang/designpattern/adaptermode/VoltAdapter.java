package com.example.ahuang.designpattern.adaptermode;

/*
 * VoltAdapter  2019-02-18
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 02 18
 */
// Adapter角色，将220V的电压
public class VoltAdapter extends Volt220 implements FiveVolt{
    @Override
    public int getVole5() {
        return 5;
    }
}