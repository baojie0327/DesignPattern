package com.example.ahuang.designpattern.singleton1;

/**
 * Created by Hbj on 2016/10/29.
 */

public class SingleDEmo2 {
    /**
     * 测试多进程并发下的单例模式
     * @param args
     */
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton mSingleton2 = Singleton.GetInstance();
                System.out.println("----"+mSingleton2);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton mSingleton3 = Singleton.GetInstance();
                System.out.println("----"+mSingleton3);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton mSingleton4 = Singleton.GetInstance();
                System.out.println("----"+mSingleton4);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton mSingleton5 = Singleton.GetInstance();
                System.out.println("----"+mSingleton5);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton mSingleton5 = Singleton.GetInstance();
                System.out.println("----"+mSingleton5);
            }
        }).start();

    }

    /**
     * Created by Hbj on 2016/10/29.
     * 定义一个单例模式
     */

    public static class Singleton {
        private static Singleton instance;
        private Singleton() {
        }
        public static Singleton GetInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
    /***----------单例模式定义完成-----------------*****/

    /**
     * Created by Hbj on 2016/10/29.
     * 测试单例模式对象唯一
     */

    public static class SingltDemo {
        public static void main(String[] args) {
            /**
             * 获得单例模式对象
             */
            Singleton mSingleton1 = Singleton.GetInstance();
            Singleton mSingleton2 = Singleton.GetInstance();

            System.out.println(mSingleton1+"----"+mSingleton2);
            if (mSingleton1==mSingleton2){
                System.out.println("两个对象是相同的实例");
            }
        }
    }
}
