package lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		//练习:根据用户输入的文件[图片]拷贝文件到当前项目目录
		//C:/Users/10301/Desktop/a/cm2.jpg
		
		//1.获取用户输入的文件路径
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个文件的路径[请不要输入文件夹路径]:");
		String path = scanner.nextLine();
		
		//2.判断这个路径是否为文件
		File file = new File(path);
		if(file.isDirectory()){
			System.out.println("您输入的路径不是一个文件");
			return;
		}
		
		//3.如果是文件就拷贝
		//3.1 输入流
		FileInputStream fis = new FileInputStream(path);
		
		//3.2输出流
		FileOutputStream fos = new FileOutputStream(file.getName());
		
		//3.3读写【性能】
		byte[] buf = new byte[8 * 1024];
		
		int len = 0;
		while((len = fis.read(buf)) != -1){
			fos.write(buf, 0, len);
		}
		
		//3.4关流
		fis.close();
		fos.close();
		
		System.out.println("文件拷贝完成...");
		
	}
}
