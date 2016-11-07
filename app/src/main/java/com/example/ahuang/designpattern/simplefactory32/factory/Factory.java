package com.example.ahuang.designpattern.simplefactory32.factory;

/**
 * Created by Frank on 2016/11/2 10:41.
 * Email:512395540@qq.com
 */

import com.example.ahuang.designpattern.simplefactory32.impl.ImplA;
import com.example.ahuang.designpattern.simplefactory32.impl.ImplB;
import com.example.ahuang.designpattern.simplefactory32.interf.Api;

/**
 * 工厂类，用于提供手机
 */
public class Factory {
    /**
     *
     * @param condition
     * @return
     * 根据不同条件，建造不同手机生产厂
     * 4588--iphpne6s 5388--iphpne7
     */
    public static Api createApi(int condition){
        Api api=null;
       switch (condition){
           case 4588:
               api=new ImplA();//生产iphone6s手机
               break;
           case 5388:
               api=new ImplB();//生产iphone7手机
               break;
           default:
               break;
       }
        return api;
    }
}
