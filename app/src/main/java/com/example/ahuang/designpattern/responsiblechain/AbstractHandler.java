package com.example.ahuang.designpattern.responsiblechain;

/*
 * AbstractHandler  2019-04-23
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 23
 */
public abstract class AbstractHandler {

    protected AbstractHandler nexthandler;  // 下一节点上的处理者对象

    public final void handleRequest(AbstractRequest request){
        // 判断当前处理者对象的处理级别是否与请求者的级别一致
        if (getHandleLevel()==request.getRequestLevel()){
            // 一致则由该处理对象处理
            handle(request);
        }else {
            // 否则将该请求对象转发给下一个节点上的请求对象
            if (nexthandler!=null){
                nexthandler.handle(request);
            }else {
                // 当前所有处理者对象均不能处理该请求时输出
                System.out.println("All of handler can  not handle the request!");
            }
        }

    }


    /**
     * 获取处理者对象的处理级别
     * @return
     */
    protected abstract int getHandleLevel();


    /**
     * 每个处理者对象的具体处理方式
     * @param request
     */
    protected abstract void handle(AbstractRequest request);

}