package lesson13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		//SequenceInputStream序列流使用二
		//需求，把a.txt b.txt c.txt 的内容拷贝到d.txt
		//1.Vector是集合
		Vector<InputStream> vector = new Vector<InputStream>();
		vector.add(new FileInputStream("a.txt"));
		vector.add(new FileInputStream("b.txt"));
		vector.add(new FileInputStream("c.txt"));
		
		//2.Enumeration枚举
		Enumeration<InputStream> e = vector.elements();
		
		//3.序列流
		SequenceInputStream sis = new SequenceInputStream(e);
		
		//4.创建输出流
		FileOutputStream fos = new FileOutputStream("d.txt");
		
		//读写 
		int b = 0;
		while((b = sis.read()) != -1){
			fos.write(b);
		}
		
		sis.close();
		fos.close();
	}
}
