package com.example.ahuang.designpattern.responsiblechain;

/*
 * Handler1  2019-04-23
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 23
 */
public class Handler2 extends AbstractHandler{

    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler2 handle request:"+request.getRequestLevel());
    }
}