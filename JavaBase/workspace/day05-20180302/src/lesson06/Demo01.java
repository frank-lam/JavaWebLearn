package lesson06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo01 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub

	/*	Serializable接口的ID
		1.要归档或者序列化的对象必须实现Serializable接口才能被序列化 
		2.Serializable 中有个id，但ID不是一定要加的
		3.SerialVersionUid，简言之，其目的是以序列化对象进行版本控制，有关各版本反序列化时是否兼容。
		4.如果在新版本中这个值修改了，新版本就不兼容旧版本，反序列化时会抛出InvalidClassException异常。
		5.如果修改较小，比如仅仅是增加了一个属性，我们希望向下兼容，老版本的数据都能保留，那就不用修改；
		6.如果我们删除了一个属性，或者更改了类的继承关系，必然不兼容旧数据，这时就应该手动更新版本号，即SerialVersionUid。
		7.一般不会添加ID,就算添加了ID,版本号最好不要修改
*/
		
		//save();
		//取学生
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stu.data"));
		Student stu = (Student) ois.readObject();
		System.out.println(stu);
		
	}

	public static void save() throws IOException, FileNotFoundException {
		//1.创建学生对象
		Student stu = new Student("霍建华");
		
		//2.把学生存入文件
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.data"));
		
		/**
		 * 存的学生的版本号是1
		 */
		oos.writeObject(stu);
		
		//3.关流
		oos.close();
	}

}


class Student implements Serializable{

	/**
	 * 序列化版本ID
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String hometown;

	public Student(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}