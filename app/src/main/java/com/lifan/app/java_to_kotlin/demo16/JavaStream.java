package com.lifan.app.java_to_kotlin.demo16;

import java.util.Arrays;
import java.util.List;

/**
 * @author by LiFan
 * @date 2018/12/12
 */

class JavaStream {
    public static void main(String[] args) {
        funStream(Arrays.asList("Hello","Aloha","2","hi","Good"));
    }

    public static void funStream(List<String> strings){
        strings
                .stream()
                .filter(s -> s.length() > 3)
                .map(s -> "stream:_" + s)
                .forEach(s -> System.out.println(s));
    }

}
