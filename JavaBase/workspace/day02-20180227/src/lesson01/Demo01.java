package lesson01;

import java.io.File;

public class Demo01 {

	public static void main(String[] args) {
/*		File:表示一个文件或者路径,路径也可以是文件夹
		构造方法
		1.File(String pathname)
			根据一个路径得到File对象
		2.File(String parent, String child)
			根据一个目录和一个子文件/目录得到File对象
		3.File(File parent, String child)
			根据一个父File对象和一个子文件/目录得到File对象*/
		
		
		//路径的写法1：如果C:\Users\10301\Desktop\a.txt，在java中需要在每个斜杠前再一个斜杠，这个代表转义
		String pathname1 = "C:\\Users\\10301\\Desktop\\a.txt";
		//路径的写法2：如果C:\Users\10301\Desktop\a.txt，可以把每个斜杠改成反斜杠
		String pathname2 = "C:/Users/10301/Desktop/a.txt";
		
		//1.创建一个文件对象
		File file1 = new File(pathname1); //文件对象已经关联桌面的文件

		System.out.println("file1:" + file1);
		
		//2.再创建一个文件对象
		File file2 = new File("C:/Users/10301/Desktop", "a");
		System.out.println("file2:" + file2);
		
		
		//3.再创建一个文件对象
		//3.1把文件夹封装成对象
		File desktopFolder = new File("C:/Users/10301/Desktop");
		File file3 = new File(desktopFolder, "a.txt");
		System.out.println("file3:" + file3);
		
	}
}
