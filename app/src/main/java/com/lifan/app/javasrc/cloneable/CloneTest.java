package com.lifan.app.javasrc.cloneable;

/**
 * @author by cloneable.CloneTest
 * @date 2018/8/3
 */

class CloneTest implements Cloneable{

    public A object = new A() ;

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest a = new CloneTest();
        System.out.println(a.object);
        System.out.println(((CloneTest) a.clone()).object);

//      深拷贝不负责递归循环拷贝属性

    }

    public static class A implements Cloneable{

    }

}
