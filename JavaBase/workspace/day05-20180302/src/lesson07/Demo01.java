package lesson07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//打印流的概述和特点 (掌握)
	/*	什么是打印流 
		1.该流可以很方便的将对象的toString()结果输出, 并且自动加上换行, 而且可以使用自动刷出的模式
		2.System.out就是一个PrintStream, 其默认向控制台输出信息
		3.PrintStream和PrintWriter分别是打印的字节流和字符流*/
		
		//1.打印的字节流【打印到控制台】
		PrintStream ps = System.out;
		ps.println("你好，元宵节快乐");//打印字符串
		ps.println(19.6);
		
		//2.打印的字符流
		/**
		 * 1.PrintWriter调用打印方法，控制台是没有内容，它是把内容写到文件中
		 * 2.如果打印了内容，没有调用flush或者close，内容在文件中也不存在
		 */
		PrintWriter pw = new PrintWriter("test.txt");
		pw.println("吃汤圆了...");
		pw.print("超市一包汤圆10几块钱");
		pw.print(13.01);
		//pw.flush();
		pw.close();

	}

}
