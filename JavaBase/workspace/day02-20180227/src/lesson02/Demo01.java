package lesson02;

import java.io.File;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//File类的创建功能
	/*	创建功能
		public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
		public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
		public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来

		注意事项：
		如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。*/

		//1.在指定的路径下创建一个文件
		File file1 = new File("C:/Users/10301/Desktop/a/a.txt");
		boolean b1 = file1.createNewFile();
		System.out.println("创建文件是否成功：" + b1);
		
		//2.在指定的路径下创建文件夹
		File file2 = new File("C:/Users/10301/Desktop/a/c");
		boolean b2 = file2.mkdir();//mk=make,dir=directory
		System.out.println("创建文件夹是否成功:" + b2);
		
		//3.创建多层文件夹
		File file3 = new File("C:/Users/10301/Desktop/a/d/d/d");
		boolean b3 = file3.mkdirs();
		System.out.println("创建多层文件夹是否成功:" + b3);
		
		//4.在项目路径下创建一个a.txt文件
		/***
		 * 注意事项：
			如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下
		 */
		File file4 = new File("b.txt");
		System.out.println("file4:" + file4);
		file4.createNewFile();
	}

}
