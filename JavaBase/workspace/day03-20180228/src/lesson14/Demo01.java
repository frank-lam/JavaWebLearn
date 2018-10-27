package lesson14;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWiter:
 * 掌握：
 * 1.write方法使用
 * 2.write方法内部实现，内部是通过一个字符数组缓冲区写入文件
 *
 */
public class Demo01 {

	public static void main(String[] args) throws Exception {
		//FileWiter 文件写入流、文件写入字符流

		//案例：使用FileWiter往一个文件a.txt写内容
		
		//1.创建writer对象
		FileWriter writer = new FileWriter("a.txt");
		
		//2.写内容
		writer.write("你好!");
		writer.write("\r\n");
		writer.write("你好!");
		writer.write("\r\n");
		writer.write("你好!");
		writer.write("\r\n");
		writer.write("你好!");
		
		//3.关闭
		writer.close();
	}
}
