package lesson01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		//案例:拷贝图片【优化一、这种方式在大文件下不建议使用】
		/**
		 * 前面拷贝图片问题：每次只读一个字节，写入的时候也是一个字节一个字节写
		 * 					如果有10W个字节，就要读10W次，写10W次
		 * 
		 * 字节数组拷贝之available()方法
		 */
		//1.文件输入流
		FileInputStream fis = new FileInputStream("C:/Users/10301/Desktop/a/cm.jpg");
		int size = fis.available();//是返回文件的长度【字节为单位】
		System.out.println("文件的大小:" + size);
		
		//2.现在一次读文件大小的字节
		//2.1定义一个字节数组
		byte[] bytes = new byte[size];//相当于现在是一个空杯子
		//2.2 把数据读到字节数组中
		int r = fis.read(bytes);//这个方法的返回值读取到的实际长度
		System.out.println("r:" + r);
		
		//3.把字节数组一次性写入到文件
		//3.1 输出流
		FileOutputStream fos = new FileOutputStream("C:/Users/10301/Desktop/a/cm-副本.jpg");
		//3.2 写数据
		fos.write(bytes);
		
		//4.关闭流
		fis.close();
		fos.close();
	}
}
