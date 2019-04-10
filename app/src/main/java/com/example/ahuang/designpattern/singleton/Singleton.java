package com.example.ahuang.designpattern.singleton;

/*
 * Singleton  2018-12-03
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 03
 */
public class Singleton {


    private String name;

    // 构造方法,私有化，防止从外部可以通过new的方式实例化
    private Singleton() {

    }

    /**
     * 写法一，饿汉式，静态常量，可用
     * 优点，在类装载的时候完成实例化，避免了线程同步问题
     * 缺点：在类加载的时候完成实例化，如果自始至终没有使用过这个实例，会造成资源的浪费
     */

    /************************************************************************************************
     private static Singleton instance = new Singleton();


     public static Singleton getInstance() {
     return instance;
     }

     ***********************************************************************************************/


    /**
     * 写法二，懒汉模式
     * 优点：达到了延迟加载的效果
     * 缺点：在多线程的情况下，可能会产生多个实例
     */
/************************************************************************************************
    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
 ***********************************************************************************************/


    /**
     * 写法三，懒汉模式，线程安全
     */
/************************************************************************************************
    private static Singleton instance = null;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
 ***********************************************************************************************/

    /**
     * 写法四，双重检查，推荐用
     */
/************************************************************************************************
    private static volatile Singleton instance;

    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
 ***********************************************************************************************/


    /**
     * 写法五，静态内部类，推荐用
     */
    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }








    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}