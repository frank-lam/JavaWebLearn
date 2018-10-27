package lesson03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		//BufferedReader的readLine()&BufferedWriter的newLine()方法
		/**
		 * 1.readLine()，每次读取一行数据
		 */
		
		
		//1.创建Reader
		FileReader fr = new FileReader("a.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//2.读一行数据
/*		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());*/
		String line = null;
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		
		//3.关流
		br.close();
	}
}
