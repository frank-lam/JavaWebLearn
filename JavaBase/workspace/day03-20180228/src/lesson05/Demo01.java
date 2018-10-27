package lesson05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//BufferedOutputStream的flush和close方法的区别
	/*	flush()方法
			1.用来刷新缓冲区的,刷新后可以再次写出 
		close()方法
			2.用来关闭流释放资源的
			3.如果是带缓冲区的流对象的close()方法,不但会关闭流,还会再关闭流之前刷新缓冲区,关闭后不能再写出 
*/
		
		//案例：把a文件的内容拷贝到b文件
		
		//1.输入流
		FileInputStream fis = new FileInputStream("a.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		//2.输出流
		FileOutputStream fos = new FileOutputStream("b.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//3.读写操作
		int b = 0;
		while( (b = bis.read()) != -1){
			bos.write(b);
		}
		
		bos.flush();
		bos.write(97);
		//bos.flush();
		//4.关闭流
		bis.close();
		bos.close();
		
		
	}

}
