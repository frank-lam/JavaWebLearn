package lesson14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		
		//案例:拷贝图片
		/**
		 * 目的：结合输入流和输出流使用
		 * 
		 * 图片路径：C:\Users\10301\Desktop\a\cm.jpg
		 */
		
		//1.先创建输入流对象和输出流对象
		FileInputStream fis = new FileInputStream("C:/Users/10301/Desktop/a/cm.jpg");
		FileOutputStream fos = new FileOutputStream("C:/Users/10301/Desktop/a/cm2.jpg");
		
		//2.通过输入流读取图片的数据
		int b = 0;
		while( (b = fis.read()) != -1){
			//3.通过输出流写入图片数据
			fos.write(b);
		}
		
		//4.关闭流
		fos.close();
		fis.close();
		System.out.println("图片拷贝成功");
	}
}
