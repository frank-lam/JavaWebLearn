package lesson13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * 以后读纯文本文件，使用FileReader这个类，为什么？因为我们不用考虑乱码问题
 * 1.read方法是读取字符char
   2.一个字符可能占用1个字节，2个字节，或者3个字节
   3.占用字节个的数根据码表决定(ASCII:1字节，GBK:2字节 unicode:3个字节)
   4.用int表示字节，假如读取到2个字节，int有4个字节，前个两个字节可以补0
   5.GBK,unicode中，中文的字符的第一个字节都是负数，所以知道怎么去读取
   6.FileReader读取的方式与FileInputStream字节流差不多，会用FileInputStream，就会用FileReader
 */
public class Demo01 {

	public static void main(String[] args) throws IOException {
		//读字节
		FileInputStream fis = new FileInputStream("a.txt");
		//int 00000000 00000000 00000000 11111111
		System.out.println((byte)fis.read());
		System.out.println((byte)fis.read());
		System.out.println((byte)fis.read());
		
		System.out.println((byte)fis.read());
	
		System.out.println((byte)fis.read());
		System.out.println((byte)fis.read());
		System.out.println((byte)fis.read());
	}

	public static void test1() throws FileNotFoundException, IOException {
		//FileReader 
		/**
		 * FileReader 用于读取字符
		 */
		
		//1.创建对象
		FileReader reader = new FileReader("a.txt");
		
		//2.读取数据
		/**
		 * reader.read() : 先读取到字节数据, 然后转为字符
		 */
/*		System.out.println((char)reader.read());
		System.out.println((char)reader.read());
		System.out.println((char)reader.read());
		System.out.println((char)reader.read());
		System.out.println((char)reader.read());
		System.out.println(reader.read());*/
		
		int c;
		while((c = reader.read()) != -1){
			System.out.println((char)c);
		}
		
		//3.关闭流
		reader.close();
	}
}
