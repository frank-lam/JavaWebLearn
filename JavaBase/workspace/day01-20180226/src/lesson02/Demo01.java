package lesson02;

import java.util.Random;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JVM默认是如何处理异常的
		/*main函数收到异常时,会有两种处理方式: 
			1.自己将该问题处理,然后继续运行【try-catch】
			2.自己没有针对的处理方式,只有交给调用main的jvm来处理
		  
		  jvm有一个默认的异常处理机制,就将该异常进行处理,
		  	并将该异常的名称、异常的信息、异常出现的位置打印在了控制台上,同时程序停止运行。

			 */
		
		//1.数组越界异常
		int[] arr = {2,3,4,5};
		System.out.println(arr[0]);
		//ArrayIndexOutOfBoundsException 数组越界异常
		//ArrayIndexOutOfBoundsException e;
		//System.out.println(arr[4]);//数组越界异常
		
		
		//2.空指针异常
		//arr = null;
		//System.out.println(arr[0]);
		
		//3.类型转换异常ClassCastException
//		Object s = "abc";
//		//Integer i = (Integer)s;
//		Random r = (Random)s;
		
		
		//一旦程序出现异常，后面的代码就不会执行了
		System.out.println(".....");
	}

}
