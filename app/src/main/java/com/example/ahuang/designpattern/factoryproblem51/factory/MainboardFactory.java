package com.example.ahuang.designpattern.factoryproblem51.factory;

/**
 * Created by Frank on 2016/11/2 16:42.
 * Email:512395540@qq.com
 */

import com.example.ahuang.designpattern.factoryproblem51.impl.GAMainboard;
import com.example.ahuang.designpattern.factoryproblem51.impl.MSIMainboard;
import com.example.ahuang.designpattern.factoryproblem51.interf.MainboardApi;

/**
 * 生产主板的工厂
 */
public class MainboardFactory {
    public static MainboardApi createMainboard(int type){
        MainboardApi mainboard=null;
        //根据参数决定生产的主板
        switch (type){
            case 1:
                mainboard=new GAMainboard(1156);//生产技嘉1156脚主板
                break;
            case 2:
                mainboard=new MSIMainboard(939);//生产微星939脚主板
                break;
            default:
                break;
        }
        return mainboard;
    }
}
