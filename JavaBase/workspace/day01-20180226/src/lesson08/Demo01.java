package lesson08;

public class Demo01 {

	public static void main(String[] args) {
		/*Exception是一个继承Throwable的子类
		  Throwable有几个常用的方法【了解即可，平时都不怎么用】
			getMessage():获取异常信息，返回字符串。
			toString():获取异常类名和异常信息，返回字符串。
			printStackTrace():打印异常类名和异常信息，以及异常出现在程序中的位置*/
		
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());//异常描述信息
			System.out.println(e.toString());//异常类名+异常信息
			e.printStackTrace();//用的比较多
			System.out.println("算术异常");
		}
		
		/*
		 * 1.Java虚拟机处理异常打印的信息
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		   at lesson08.Demo01.main(Demo01.java:11)
		   
		   2. catch中printStackTrace();方法打印的信息
		   Java.lang.ArithmeticException: / by zero
			at lesson08.Demo01.main(Demo01.java:13)
		   */
		
	}
}
