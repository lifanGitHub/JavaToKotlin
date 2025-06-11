package com.lifan.app.javasrc.singleinstance;

/**
 * @author by LiFan
 * @date 2019/2/21
 */
//可能会有人使用反射强行调用我们的私有构造器
//如果要避免这种情况，可以修改构造器，让它在创建第二个实例的时候抛异常）
public class Singleton3 {
    private static class Holder {
        private static Singleton3 singleton = new Singleton3();
    }

    private Singleton3(){}

    public static Singleton3 getSingleton(){
        return Holder.singleton;
    }
}
