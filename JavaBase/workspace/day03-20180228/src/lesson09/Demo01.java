package lesson09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args)throws Exception {
		//流的标准处理异常代码1.7版本
		/**
		 * 1.把流对象的声明放在try() 括号里面
		 * 2.操作流【读写数据】的代码放在花括号里面
		 * 3.这样写不用关闭流，java自动关闭流
		 * 4.在try的括号里的对象，必须是实现AutoCloseable的接口
		 */
		try(
			FileInputStream fis = new FileInputStream("a.txt");
			FileOutputStream fos = new FileOutputStream("b.txt");
			//Person p = new Person();
			//声明一个自己输入流
			MyInputStream myis = new MyInputStream();
		){
			int b = 0;
			while((b = fis.read()) != -1){
				fos.write(b);
			}
		}
	}
}

class Person{
	
}

class MyInputStream implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("我的输入流关闭了...");
	}
}

