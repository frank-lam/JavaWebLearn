package lesson10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//练习:图片加密
		
		//1.输入输出流
		FileInputStream fis = new FileInputStream("C:/Users/10301/Desktop/a/cm2.jpg");
		FileOutputStream fos = new FileOutputStream("C:/Users/10301/Desktop/a/cm.jpg");
		
		//2.读写数据
		/**
		 * 加密操作
		 * 解密操作
		 * 
		 * 一个数异或2次，数据不变
		 */
		int b = 0;
		while((b = fis.read()) != -1){
			fos.write(b ^ 5);
		}
		
		//3.关流
		fis.close();
		fos.close();

		System.out.println("图片加密完成");
	}

}
