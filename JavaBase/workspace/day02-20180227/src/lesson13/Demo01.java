package lesson13;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

/*		FileOutputStream:表示文件输出流，用于往文件写内容
 * 		
 * 		构造方法
 * 		FileOutputStream(String name)
 *      FileOutputStream(File file) 
 *      
 *      方法
 *      write(int b);//每次写一个字节
 *      write(byte[] b) ;//一次写多个字节
 * */
		
		//案例：往b.txt 写个内容
		//1.创建文件输出流对象
		//FileOutputStream fos = new FileOutputStream("b.txt");
		OutputStream fos = new FileOutputStream("b.txt");//多态写法
		
		//2.写数据 
//		fos.write(97);//a
//		fos.write(98);//b
//		fos.write(99);//c
		
		//一次性写多个字节
		byte[] bytes = {97,98,99,100,101};
		fos.write(bytes);
		//3.关闭流
		fos.close();
	}

}
