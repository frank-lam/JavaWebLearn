package lesson08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException{
		//流的标准处理异常代码-jdk1.6版本及其以前
		
		//案例：a.txt的内容拷贝到b.txt
		
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		try {
			//读写数据会抛出
			int b = 0;
			while((b = fis.read()) != -1){
				fos.write(b);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			//关流
			try {
				fis.close();
			}finally {
				fos.close();
			}
			
			
		}

	}

	public static void test1() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		try {
			//读写数据会抛出
			int b = 0;
			while((b = fis.read()) != -1){
				fos.write(b);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			//关流
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
