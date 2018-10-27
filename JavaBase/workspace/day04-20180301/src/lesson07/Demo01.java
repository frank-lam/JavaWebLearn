package lesson07;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo01 {

	public static void main(String[] args) throws IOException {
/*		InputStreamReader&OutputStreamWriter
		1>这两个类用于使用指定的码表读写字符*/
		
		
		//案例1：使用指定 “码表UTF-8&GBK” 读取字符
		/**
		 * charsetName：字符编码的名称
		 */
		FileInputStream fis = new FileInputStream("a.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		
		//读一个字符
	/*	System.out.println((char)isr.read());
		System.out.println((char)isr.read());*/
		
		//读一行
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
		
		br.close();
		
	}
}