package lesson10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 读取txt文件内容
 * 1.通过FileInputStream来读取txt文件内容
 * 2.读取内容通过read方法，
 *   》read方法每次读文件1个字节(byte),把byte转成int返回
	  》当读到后的时候，返回-1，-1表示读取文件结束
   3.当读完文件后，这个输入流要关闭，释放资源
 *
 */
public class Demo01 {

	public static void main(String[] args) throws IOException {
		//FileNotFoundException fnfe;
		
/*		FileInputStream概述
		FileInputStream 从文件系统中的某个文件中获得输入字节。FileInputStream 用于读取诸如图像数据之类的原始字节流。要读取字符流，请考虑使用 FileReader

		构造方法
		FileInputStream(File file)
		FileInputStream(String name) 
		成员方法
		int read() 从此输入流中读取一个数据字节。*/
		
		
		//案例：读取txt文件内容
		//1.创建一个文件对象
		File file = new File("a.txt");
		
		//2.创建一个文件输入流【读取文件数据】对象
		FileInputStream fis1 = new FileInputStream(file);
		
		//再创建一个文件输入 流对象 
		FileInputStream fis2 = new FileInputStream("b.txt");
		
		//3.读取a.txt的数据
		/**
		 * 1.read方法每次读文件1个字节(byte),把byte转成int返回
		 * 2.当读到后的时候，返回-1，-1读取文件结束
		 */
		System.out.println(fis1.read());
		System.out.println(fis1.read());
		System.out.println(fis1.read());
		System.out.println(fis1.read());
		
		//4.关闭流
		fis1.close();
		fis2.close();

	}
}
