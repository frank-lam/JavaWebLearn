package lesson04;

import java.io.File;

public class Demo01 {

	public static void main(String[] args) {
		/*File 的删除文件功能
		public boolean delete():删除文件或者文件夹
		
		删除注意事项：
		1.Java中的删除不走回收站。
		2.要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹*/

		//需求：删除桌面a文件夹下面的b文件夹
		//1.创建一个文件对象关联b文件夹
		File file = new File("C:/Users/10301/Desktop/a/b");
		
		//2.删除
		boolean b1 = file.delete();
		System.out.println("删除是否成功:" + b1);
	}
}
