package lesson09;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile这个类用于文件断点下载
 * @author gyf
 *
 */
public class Demo01 {

	public static void main(String[] args) throws IOException {
		//随机访问流概述和读写数据
/*		随机访问流概述
		RandomAccessFile概述
		RandomAccessFile类不属于流，是Object类的子类。但它融合了InputStream和OutputStream的功能。
		支持对随机访问文件的读取和写入。*/

		/**
		 * 构造方法两个参数：
		 * name:文件名称、路径
		 * mode:模式 ，r=read 只读、 w=write
		 */
		//1.创建一个随机访问流对象，以读写的方式打开文件
		RandomAccessFile raf = new RandomAccessFile("a.txt", "rw");
		
		//2.读字符
		/**
		 * 使用RandomAccessFile的readChar/readLine方法读文件有乱码问题
		 */
/*		System.out.println(raf.readChar());
		System.out.println(raf.readChar());
		System.out.println(raf.readChar());
		System.out.println(raf.readLine());*/
		
		//使用字节数组来读比较好
/*		byte[] buf = new byte[1024];
		int len;
		while((len = raf.read(buf)) != -1){
			System.out.println(new String(buf,0,len));
		}*/
		
		//3.写数据
		//raf.writeChars("abc");
		//raf.writeBytes("abc");
		raf.seek(4);//指定位置
		raf.write(97);
		raf.write(98);
		raf.write(99);
	}
}