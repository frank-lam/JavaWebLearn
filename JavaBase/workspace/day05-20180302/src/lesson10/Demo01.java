package lesson10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//DataOutputStream&DataInputStream 数据输入输出流
/*		DataInputStream, DataOutputStream可以按照基本数据类型大小读写数据 
		例如按Long大小写出一个数字, 写出时该数据占8字节. 
		读取的时候也可以按照Long类型读取, 一次读取8个字节.*/

		//读3个long数据
		DataInputStream dis = new DataInputStream(new FileInputStream("a.txt"));
		System.out.println(dis.readLong());//读8个字节
		System.out.println(dis.readLong());//读8个字节
		System.out.println(dis.readLong());//读8个字节
		
	}

	public static void test1() throws FileNotFoundException, IOException {
		long a = 997;
		long b = 998;
		long c = 999;
		
		//使用FileOutputStream没法写入long类型数据
		FileOutputStream fos = new FileOutputStream("a.txt");
		//byte -128~127 0~255
/*		fos.write(997);只会写一个字节，不会写4个字节
		fos.write(998);
		fos.write(999);*/
		
		//fos.wr
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeLong(a);//写4个字节
		dos.writeLong(b);
		dos.writeLong(c);
		
		dos.close();
	}

}
