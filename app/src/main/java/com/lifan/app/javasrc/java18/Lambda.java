package com.lifan.app.javasrc.java18;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @author by LiFan
 * @date 2019/2/25
 */

class Lambda {
    public static void main(String[] args) {
        new Lambda().setLambda(() -> {
            System.out.println("OK");
        });

        //=============================================================

        Arrays.asList( "a", "b", "d" ).forEach(
                e -> {
                    System.out.println( e );
                    System.out.println( e );
                }
        );

        Arrays.asList( "a", "b", "d" ).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println( s );
            }
        });

//        对比而言Kotlin更优雅
//        listOf(1,2,3,4,5).forEach {
//            println(it)
//        }

    }

    @FunctionalInterface
    public interface InterfaceX {
        void doIt();
    }
    public void setLambda(InterfaceX interfaceX){
        interfaceX.doIt();
    }

}
