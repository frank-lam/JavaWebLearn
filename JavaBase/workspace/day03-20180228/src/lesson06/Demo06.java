package lesson06;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo06 {

	public static void main(String[] args) throws IOException {
		//字节流读写中文乱码问题
/*      字节流读取中文
 * 		1.字节流在读中文的时候有可能会读到半个中文,造成乱码
		2.解决方案：Java提供一个类Reader（字符流） */
		
		//1.读数据
		//创建文件输入流
		FileInputStream fis = new FileInputStream("a.txt");

		//读
		//定义字节数组[杯子思想，缓冲区思想]
		/**
		 * 在UTF-8编码表中，一个中文占3个字节,一个英文占1个字节
		 * 在GBK编译中，一个中文占2个字节
		 */
		byte buf[] = new byte[3];
		int len = 0;
		while( (len = fis.read(buf)) != -1){
			System.out.println("len:" + len );
			//把字节转成字符串
			String s = new String(buf, 0, len);
			System.out.println("s:" + s);
		}
	}
}
