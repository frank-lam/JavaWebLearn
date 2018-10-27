package com.gyf.lesson03;

public class Demo01 {
    @MyTest
    public void test1(){
        System.out.println("test1 方法执行了");
    }

    @MyTest(name="gyf it edu studio")
    public void test2(){
        System.out.println("test2 方法执行了");
    }
}
