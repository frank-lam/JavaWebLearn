package com.gyf.lesson03;

import java.lang.annotation.*;
@Documented
@Retention(RetentionPolicy.RUNTIME)//保留到运行时
public @interface MyTest {
    String name() default "gyf";
}
