package com.example.ahuang.designpattern.responsiblechain;

/*
 * AbstractRequest  2019-04-23
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 23
 */
public abstract class AbstractRequest {

    private Object obj;

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    /**
     * 获取处理的内容对象
     * @return
     */
    public Object getContent(){
        return obj;
    }

    /**
     * 获取请求级别
     * @return
     */
    public abstract int getRequestLevel();


}