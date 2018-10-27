package lesson06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	File类的获取功能
		public String getAbsolutePath()：获取绝对路径
		public String getPath():获取路径
		public String getName():获取名称
		public long length():获取长度。字节数
		public long lastModified():获取最后一次的修改时间，毫秒值
		public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
		public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 */
		
		//1.获取绝对路径
		File file1 = new File("a/a.txt");
		System.out.println("file1绝对路径:" + file1.getAbsolutePath());
		
		//2.获取路径
		System.out.println("file1的路径:" + file1.getPath());//path就是构造方法传的路径
		
		//3.获取文件名称
		System.out.println("file1的名称：" + file1.getName());
		
		//4.获取文件长度（文件大小）
		File file2 = new File("C:/Users/10301/Desktop/a/b.txt");
		System.out.println("file2的文件大小:" + file2.length());
		
		//5.获取文件修改的时间,毫秒值
		long time =  file2.lastModified();
		System.out.println("file2最后一次修改的时间:" + time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date(time);
		System.out.println(sdf.format(date));
		
		System.out.println("======================");
		//6.获取指定目录下的所有文件
		System.out.println("Desktop/a目录下的文件：");
		File file3 = new File("C:/Users/10301/Desktop/a");
		String[] files = file3.list();//返回所有子文件名数组
		for(String f : files){
			System.out.println(f);
		}

		System.out.println("======================");
		
		File[] fs =  file3.listFiles();//内部把文件路径封装成文件对象 
		for(File f : fs){
			System.out.println(f.getAbsolutePath());
		}
	}

}
