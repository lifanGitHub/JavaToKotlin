package com.lifan.app.javasrc.singleinstance;

/**
 * @author by LiFan
 * @date 2019/2/21
 */

public class Singleton1 {
    private volatile static Singleton1 singleton1;
    private Singleton1(){}
    public static Singleton1 getSingleton1() {
        if (singleton1 == null) {
            synchronized (Singleton1.class) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}