package com.lifan.app.javasrc.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author by LiFan
 * @date 2019/2/15
 */

public class Run {

    public static void main(String[] args) throws Exception{
        // 获取要解析的类
        Test test = new Test();
        Class cls = test.getClass();
        AAnnotation a;
        //获得类注解
        a = (AAnnotation) cls.getAnnotation(AAnnotation.class);
        System.out.println("ClassAnnotation" + " = " + a.classValue());
        //反射方法
        Method methodPrint = cls.getDeclaredMethod("print",String.class);
        methodPrint.invoke(test,"new Message");
        a = methodPrint.getAnnotation(AAnnotation.class);
        System.out.println("Method" + " = " + a.classValue());


        //拿到所有Field
        Field[] declaredFields = cls.getDeclaredFields();
        for(Field field : declaredFields){
            if (!field.getName().equals("testAnnotation"))
                return;
            System.out.println(field.getName() + " = " +field.get(test));
            // 获取Field上的注解
            a = field.getAnnotation(AAnnotation.class);
            // 获取注解值
            System.out.println("Annotation"  + " = " + a.strValue());
        }

    }
}
