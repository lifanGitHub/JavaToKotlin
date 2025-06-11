package com.lifan.app.javasrc.java18;

/**
 * @author by LiFan
 * @date 2019/2/25
 */

interface Interface {
    String str = "OK";

    void fun();

    static void staticMethod() {
        System.out.println("接口中的静态方法");
    }

    default void defaultMethod() {
        System.out.println("接口中的默认方法");
    }

}
