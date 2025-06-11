package com.lifan.app.javasrc.java18;

import java.util.Optional;

/**
 * @author by LiFan
 * @date 2019/2/25
 */

class OptionalTest {
    public static void main(String[] args) {
        String s = Optional
                .ofNullable(new A())
                .map(a -> a.b)
                .map(b -> b.c)
                .map(c -> c.str)
                .orElse("NPE");
        System.out.println(s);

    }

    static class A{
        B b = new B();
    }
    static class B{
//        C c = new C();
        C c = null;
    }
    static class C{
        String str = "OK";
    }
}
