package com.example.ahuang.designpattern.responsiblechain;

/*
 * Handler  2019-04-23
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * 抽象处理者
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 23
 */
public abstract class Handler {

    protected Handler successor; // 下一个节点的处理者

    /**
     * 请求处理
     * @param condition  请求条件
     */
    public abstract void handleRequest(String condition);

}