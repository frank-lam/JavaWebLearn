package com.gyf.lesson01;

public class Demo {
    @SuppressWarnings({"unused"})//忽略警告
    public static void main(String[] args){
        int i = 10;
        test();
    }

    @Deprecated//过期
    public static void test(){
        System.out.println("AA");
    }
}
