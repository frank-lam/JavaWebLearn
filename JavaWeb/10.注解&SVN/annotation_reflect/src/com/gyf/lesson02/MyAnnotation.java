package com.gyf.lesson02;

import java.lang.annotation.Annotation;
public @interface MyAnnotation{
    int age() default 1;
    String name() default "gyf";
    String[] values() default "";
    Class clazz() default Object.class;
}
