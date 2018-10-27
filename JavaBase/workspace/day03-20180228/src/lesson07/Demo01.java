package lesson07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*		字节流写入中文的问题
		字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组 
		写出回车换行 write("\r\n".getBytes());*/

		//案例：往a.txt文件写中文
		
		//1.输出流
		FileOutputStream fos = new FileOutputStream("a.txt");
		
		//2.写中文
		String s = "你好，Gosling最近好吗？";
		
		//把字符转成字节数组
		//byte[] bytes = s.getBytes();
		
		/**
		 * charsetName 字符编码 UTF-8(Unicode),GBK,ASCII
		 */
		byte[] bytes = s.getBytes("UTF-8");
		fos.write(bytes);
		
		//3.关流
		fos.close();
		
	}

}
