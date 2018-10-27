package lesson07;

import java.io.File;

public class Demo01 {

	public static void main(String[] args) {
		/*案例:输出指定目录下指定后缀的文件名
		   需求：判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称*/
		

		//打印C:\Users\10301\Desktop\a目录 下所有文件
		
		//1.创建一个File对象
		File file = new File("C:/Users/10301/Desktop/a");
		
		//2.获取目录下的所有子文件
		File[] files =  file.listFiles();
		
		//3.遍历
		for(File f : files){
			if(f.getName().endsWith(".jpg")){
				System.out.println(f.getAbsolutePath());
			}
		}
		
		
	}

	private static void test1() {
		//1.创建一个File对象
		File file = new File("C:/Users/10301/Desktop/a");
		
		//2.获取目录下的所有子文件
		String[] filenames = file.list();
		
		//3.遍历
		for(String fileName : filenames){
			//判断后缀是否为.jpg
			if(fileName.endsWith(".jpg")){
				System.out.println(fileName);
			}
		}
	}
}
