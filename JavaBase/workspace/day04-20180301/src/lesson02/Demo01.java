package lesson02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/**
		 * 带缓冲的字符流 BufferedReader/BufferedWriter
		 * 1.这两个类，内部都一个缓冲区，字符数组
		 * 2.br.read()方法，内部会读8192（8*1024）个字符
		 * 3.bw.write(),内部会写8192（8*1024）个字符
		 * 
		 * 回顾：带缓冲的字节流,BufferedInputStream/BufferedOutputStream
		 * 1.这两个类，内部都一个缓冲区，字节数组
		 */
		
		
		//需求：拷贝文件,a.txt -> b.txt
		//1.创建Reader
		FileReader fr = new FileReader("a.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//2.创建Writer
		FileWriter fw =new FileWriter("b.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		//3.读写
		int c = 0;
		while( (c = br.read()) != -1){
			bw.write(c);
		}
		
		//4.关流
		br.close();//内部关闭FileReader
		bw.close();//内部关闭FileWriter
		
		
	}

}