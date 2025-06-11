package com.lifan.app.javasrc.reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @author by LiFan
 * @date 2019/2/15
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.TYPE,ElementType.METHOD})
public @interface AAnnotation {
    String strValue() default "null";
    String classValue() default "null";
    String methodValue() default "null";
}

