package lesson11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		//案例：读取txt文件内容另外一种写法
		
		//1.创建文件输入流对象
		FileInputStream fis = new FileInputStream("a.txt");
		
		//2.读取数据
		int b = 0;
		while( (b = fis.read()) != -1){
			System.out.println(b);
			//System.out.println((char)b);//把int转char类型
		}
		
		//3.关闭流
		fis.close();
	}
}
