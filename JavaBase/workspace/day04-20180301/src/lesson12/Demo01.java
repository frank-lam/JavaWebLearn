package lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		//SequenceInputStream 序列流
		/**
		 * InputStream:输入流
		 * Sequence:序列 连续
		 * 
		 * 序列流可以把多个字节输入流整合成一个, 从序列流中读取数据时, 
		 * 将从被整合的第一个流开始读, 读完一个之后继续读第二个, 以此类推.
		 */
		test2();
		
	}

	public static void test2() throws FileNotFoundException, IOException {
		//需求：a.txt,b.txt 依次写c.txt
		
		//创建序列流
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		
		//创建输出流
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		//读写 
		int b = 0;
		while((b = sis.read()) != -1){
			fos.write(b);
		}
		
		fis2.close();
		sis.close();
		fos.close();
	}

	public static void test1() throws FileNotFoundException, IOException {
		//需求：a.txt,b.txt 依次写c.txt
		//1.创建两个输入流
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		
		//2.创建一个输出流
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		//3.先把a文件的内容写到c.txt
		int b = 0;
		while((b=fis1.read()) != -1){
			fos.write(b);
		}
		
		fos.write("\r\n".getBytes());//换行
		
		//4.再把b文件内容写到c.txt
		while((b=fis2.read()) != -1){
			fos.write(b);
		}
		
		//5.关流
		fis1.close();
		fis2.close();
		fos.close();
	}
}
