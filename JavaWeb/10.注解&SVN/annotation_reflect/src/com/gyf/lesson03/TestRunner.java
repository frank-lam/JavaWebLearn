package com.gyf.lesson03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class TestRunner {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        //1.获取字节码
        Class clz = Demo01.class;
        //2.获取方法
        Method[] methods = clz.getMethods();
        for (Method method : methods){
            //3.获取方法上的注解
            MyTest myTest = method.getAnnotation(MyTest.class);
            if(method.getName().startsWith("test") && myTest != null){
                System.out.println("方法名:" + method.getName());
                System.out.println("注解的name属性=" + myTest.name());
                //4.调用方式
                method.invoke(clz.newInstance());
                System.out.println("---------------");
            }

        }
    }
}
