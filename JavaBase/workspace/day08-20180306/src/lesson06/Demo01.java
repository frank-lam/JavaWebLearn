package lesson06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//Class类中静态方法forName() 读取配置文件
	
		//1.读取info.txt文件内容
		FileReader fr = new FileReader("info.txt");
		BufferedReader br = new BufferedReader(fr);
		String className = br.readLine();
		br.close();
		
		//2.获取字节码对象
		Class clz = Class.forName(className);
		System.out.println(clz);
	}
}
