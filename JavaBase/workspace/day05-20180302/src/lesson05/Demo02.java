package lesson05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo02 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		//案例：从list.data 读取所有的女朋友对象【反序列化、解归档】
		
		//1.创建对象输入流
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.data"));
		
		//2.读取List对象
		Object obj = ois.readObject();
		
		//把obj转list
		@SuppressWarnings("unchecked")
		List<GirlFriend> list = (List<GirlFriend>)obj;
		System.out.println(obj.getClass());
		
		//遍历
		for(GirlFriend gf : list){
			System.out.println(gf);
		}
		
		ois.close();
	}

}