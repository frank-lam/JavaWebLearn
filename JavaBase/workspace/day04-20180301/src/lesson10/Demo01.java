package lesson10;

import java.io.File;

/**
 * 任务：计算一个文件夹大小：累加文件的大小
 * @author gyf
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		//递归:文件目录
		/**打印出a目录所有文件名称，包括子文件夹的文件*/
		
		//1.创建目录对象
		File dir = new File("C:/Users/10301/Desktop/a");
		
		//2.打印目录的子文件
		printSubFile(dir);
	}
	
	public static void printSubFile(File dir){
		//打印目录的子文件
		File[] subfiles = dir.listFiles();
		
		for(File f : subfiles){
			if(f.isDirectory()){//文件夹
				printSubFile(f);
			}else{//文件
				System.out.println(f.getAbsolutePath());
			}
			
		}
	}
}