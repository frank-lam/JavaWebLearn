package lesson08;

import java.io.File;
import java.io.FilenameFilter;

public class Demo01 {

	public static void main(String[] args) {
/*		文件名称过滤器FilenameFilter
		需求：指定一个文件夹(目录)，打印出这个文件夹所有jpg图片
		
		FilenameFilter-接口
		作用：返回数组之前，先把不符合条件的元素去除
		*
		*/
		
		//1.创建一个文件对象
		File file = new File("C:/Users/10301/Desktop/a");
		
		//2.返回.jpg的文件对象数组
		File[] subFiles = file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".jpg");
			}
		});
		
		//3.遍历
		for(File f : subFiles){
			System.out.println(f.getAbsolutePath());
		}
	}

	private static void test1() {
		//1.创建一个文件对象
		File file = new File("C:/Users/10301/Desktop/a");
		
		//2.获取目录下所有子文件名称
/*		String[] subFilenames = file.list();
		for(String fn : subFilenames){
			System.out.println(fn);
		}*/
		
		/**
		 * FilenameFilter:文件名称的过滤器
		 */
		String[] subFileNames= file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				System.out.println("----" + name);
				//只要是jpg结尾，就把names存在字符串数组
				return name.endsWith(".jpg");
			}
		});
		
		System.out.println("==================");
		for(String fn : subFileNames){
			System.out.println(fn);
		}
	}
}
