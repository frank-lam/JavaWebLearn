package lesson02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 杯子思想,缓冲思想
 * @author gyf
 *
 */
public class Demo01 {

	public static void main(String[] args) throws IOException {
		//案例:拷贝图片【优化二、这种方式开发中建议经常使用】
		/**
		 * 1.每次只读一个字节，又觉得太慢
		 * 2.一次性读一个文件的所有数据，又怕内存装不下
		 *   内存只有2G,视频3G,这样就会内存溢出
		 * 
		 * 3.最终解决方法：折中，定义每次读8KB
		 * 
		 */
		
		//1.输入流
		FileInputStream fis = new FileInputStream("C:/Users/10301/Desktop/a/cm.jpg");
		//2.输出流
		FileOutputStream fos = new FileOutputStream("C:/Users/10301/Desktop/a/cm-副本2.jpg");
		
		//3.定义个8kb字节数组，也叫缓冲区流
		byte[] bytes =  new byte[1024 * 8];
		
		int len = 0;
		int i = 0;
		while( (len = fis.read(bytes)) != -1){
			i++;
			//4.写入文件
			fos.write(bytes,0,len);
		}
		
		System.out.println("读取的次数:" + i);
		
		//5.关闭流
		fis.close();
		fos.close();
	}
}
