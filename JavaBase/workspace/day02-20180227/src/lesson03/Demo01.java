package lesson03;

import java.io.File;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*File 的重命名功能
		  public boolean renameTo(File dest):把文件重命名为指定的文件路径
		  
		  dest:destination 目的，目标
		  
		  重命名注意事项
			如果路径名相同，就是改名。
			如果路径名不同，就是改名并剪切
		  */
		
		//需求：把C:/Users/10301/Desktop/a/a.txt 文件名改成hello.txt
		//1.创建文件对象关联a.txt
		File file = new File("C:/Users/10301/Desktop/a/a.txt");
		File dest = new File("C:/Users/10301/Desktop/a/b/hello.txt");
		
		//2.重命名
		boolean b1 = file.renameTo(dest);
		System.out.println("重命名是否成功：" + b1);
	}

}
