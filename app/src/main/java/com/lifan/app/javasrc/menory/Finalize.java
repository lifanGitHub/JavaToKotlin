package com.lifan.app.javasrc.menory;

/**
 * @author by LiFan
 * @date 2018/8/14
 */

class Finalize {
    public static void main(String[] args) {
        //finalize 只会执行一次
        A a = new A();
        a = null;
        System.gc();
        A.mine = null;
        System.gc();

        //finalize 线程优先度低 不保证能完成
//        B b = new B();
//        b = null;
//        System.gc();
//        System.gc();
//        System.gc();

        while (true);
    }
    static class A {
        static A mine;
        private static int n = 0;
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("finalize执行:" + ++n);
            mine = this;
        }
    }

    static class B {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("finalize执行:" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("finalize执行OK");
        }
    }

}




