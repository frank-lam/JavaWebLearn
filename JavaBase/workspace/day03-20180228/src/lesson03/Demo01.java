package lesson03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//1.创建文件输入流
		FileInputStream fis = new FileInputStream("C:/Users/10301/Desktop/a/ghsy.mp3");
		
		//2.创建文件输出流
		FileOutputStream fos = new FileOutputStream("C:/Users/10301/Desktop/a/ghsy-副本.mp3");
		
		//3.输入流读数据、输出流写数据
		int b = 0;
		while( (b = fis.read()) != -1){
			fos.write(b);
		}
		
		//4.关流
		fis.close();
		fos.close();
		
		System.out.println("音频拷贝完成...");
		
	}

	private static void test1() throws FileNotFoundException, IOException {
		/*	BufferedInputStream和BufferedOutputStream
			>这两个流是内置了缓冲区流,也就是说内部有一个字节数组
			>这个两个类没有前面我们写的好用，因为它内部每次读8kb字节，如果想读80kb,没办法
*/
			//案例：拷贝音频文件
			//1.创建缓冲输入流
			FileInputStream fis = new FileInputStream("C:/Users/10301/Desktop/a/ghsy.mp3");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			//2.创建缓冲输出流
			FileOutputStream fos = new FileOutputStream("C:/Users/10301/Desktop/a/ghsy-副本.mp3");
			BufferedOutputStream bos =new BufferedOutputStream(fos);
			
			//3.输入流读数据、输出流写数据
			
			int b = 0;
			// bis.read()方法，内部会读8kb数据
			while( (b = bis.read()) != -1){
				bos.write(b);//内部会写8kb数据
			}
			
			//4.关流,只需要关缓冲流，文件流不用关
			bis.close();//【内部会关文件流输入流】
			bos.close();//【内部会关文件流输出流】
			
			System.out.println("音频拷贝完成...");
	}

}
