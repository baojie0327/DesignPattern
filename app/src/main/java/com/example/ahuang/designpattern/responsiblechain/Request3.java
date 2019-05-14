package com.example.ahuang.designpattern.responsiblechain;

/*
 * Request1  2019-04-23
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 23
 */
public class Request3 extends AbstractRequest{

    public Request3(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 3;
    }
}