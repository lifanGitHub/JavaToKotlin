package com.lifan.app.javasrc.classload;

/**
 * @author by LiFan
 * @date 2019/2/13
 */

class A {
    static final String num = "0";
    static final String num2;
    static {
        num2 = "";
        System.out.println("Class A Loaded");
    }
}
