package lesson01;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		//ByteArrayOutputStream 字节数组输出流
		/**
		 * 1.前面学习的流-必需关于一个文件
		 * FileOutputStream fos = new FileOutputStream("a.txt")
		 * 
		 * 2.ByteArrayOutputStream 不需要关联文件
		 * 	
		 * 3.此类实现了一个输出流，其中的数据被写入一个 byte 数组。
		 * 	  缓冲区会随着数据的不断写入而自动增长。
		 *   可使用 toByteArray() 和 toString() 获取数据。
		 */
		
		
		
		//1.创建字节数组输出流对象
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		
		//2.输入流
		FileInputStream fis = new FileInputStream("a.txt");
		
		//3.写入输出流
		int b = 0;
		while((b = fis.read()) != -1){
			baos.write(b);
		}
		
		//自动把字节数组 转成 字符串
		System.out.println(baos.toString());
		System.out.println(baos.toString("UTF-8"));//指定编码格式的字符串
		
		//获取文件数据
		byte[] bytes = baos.toByteArray();
		System.out.println(new String(bytes));
		System.out.println(new String(bytes, "UTF-8"));//指定编码格式的字符串
		
		//4.关流
		fis.close();
		
	}
}
