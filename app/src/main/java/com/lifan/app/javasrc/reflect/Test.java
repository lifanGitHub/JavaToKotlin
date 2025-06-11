package com.lifan.app.javasrc.reflect;

/**
 * @author by LiFan
 * @date 2019/2/15
 */
@AAnnotation(classValue = "Test")
class Test {

    @AAnnotation(strValue = "OK")
    public String testAnnotation = "Hello";

    @AAnnotation(classValue = "Annotation Message")
    public void print(String s){
        System.out.println(s);
    }

}
