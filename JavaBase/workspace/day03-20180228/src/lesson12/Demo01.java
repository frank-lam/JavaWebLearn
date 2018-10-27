package lesson12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		//练习:录入数据拷贝到文件
		/**
		 * 根据用户在键盘中输入的内容，然后写到一个文件中去
		 * 
		 */
		
		//1.创建一个文件输出流
		FileOutputStream fos = new FileOutputStream("new.txt");
		
		//2.创建一个Scanner对象
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入需要录入内容...输入quit代表退出");
		
		//3.通过死循环来获取用户输入【当输入quit，代表不录入】
		while(true){
			//获取用户的输入
			String line = scanner.nextLine();
			
			//退出循环
			if(line.equals("quit")){
				break;
			}
			
			//写入文件
			fos.write(line.getBytes());
			//换行
			fos.write("\r\n".getBytes());
		}
		
		//4.关流
		fos.close();

	}
}
