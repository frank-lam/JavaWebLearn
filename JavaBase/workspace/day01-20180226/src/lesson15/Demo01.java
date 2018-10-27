package lesson15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo01 {

	public static void main(String[] args) {
		/*异常注意事项
		1.子类重写父类方法时，子类的方法必须抛出相同的父类异常
		2.如果被重写的方法没有异常抛出,那么子类的方法最好不要抛出异常
		3.如果子类方法内有异常发生,那么子类只能try,不能throws*/

	}
}


class A{
	public void test(){
		
	}
}

class B extends A{
	@Override
	public void test() {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//年龄异常
class AgeException extends Exception{
	
}