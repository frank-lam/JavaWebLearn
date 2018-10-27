package lesson15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		//案例:字符流的拷贝
		//思路：用FileReader读字符,用FileWriter写字符
		
		//1.创建 “读取流” 对象
		FileReader reader = new FileReader("a.txt");
		
		//2.创建 "写入流" 对象
		FileWriter writer = new FileWriter("b.txt");
		
		//3.读取和写入【缓冲思想】
		char[] buf = new char[8 * 1024];
		int len = 0;
		while( (len = reader.read(buf)) != -1){
			writer.write(buf, 0, len);
		}
		
		//4.关闭流
		reader.close();
		writer.close();
	}

	public static void test1() throws FileNotFoundException, IOException {
		//1.创建 “读取流” 对象
		FileReader reader = new FileReader("a.txt");
		
		//2.创建 "写入流" 对象
		FileWriter writer = new FileWriter("b.txt");
		
		//3.读取和写入
		int c = 0;
		while((c = reader.read()) != -1){
			writer.write(c);
		}
		
		
		//4.关闭流
		reader.close();
		writer.close();
	}
}
