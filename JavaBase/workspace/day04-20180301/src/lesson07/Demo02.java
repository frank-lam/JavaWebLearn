package lesson07;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 掌握：
 * 1.当读取文件内容，还有写入文件，可以指定编码格式
 * 2.使用InputStreamReader&OutputStreamWriter这个类
 * @author gyf
 *
 */
public class Demo02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	/*	OutputStreamWriter
		1>使用指定的编码 写入文件
		*/
		
		//1.创建Writer
		FileOutputStream fos = new FileOutputStream("c.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//2.写
		bw.write("你好，IO流...搞的我有点晕...");
		bw.newLine();
		bw.write("你好，IO流...搞的我有点晕...");
		bw.newLine();
		
		//3.关流
		bw.close();
		
		
	}

}
