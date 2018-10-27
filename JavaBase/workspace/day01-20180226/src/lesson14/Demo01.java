package lesson14;

/**
 * 自定义异常的步骤：
 * 1.写一个类(AgeException)继承Exception，这种是编译时异常
 * 2.在子类异常AgeException提供一个带字符串参数的构造方法
 * 		public AgeException(String msg){
		super(msg);
		}
   3.自定义异常时，也可以继承RuntimeException,这种是运行时异常	
 * @author gyf
 *
 */
public class Demo01 {

	public static void main(String[] args){
		//自定义异常概述和基本使用
		/**
		 * 1.自定义一个年龄异常AgeException
		 */
		
		//ArithmeticException ae;
		//int a = 10 / 0;//抛出Exception的子类
		
		Person p = new Person();
		p.setAge(180);
		p.say();
	}
}

class Person{
	private int age;

	/**
	 * age在1~150岁范围
	 * 在方法里抛出异常
	 * @param age
	 */
	public void setAge(int age) throws AgeException{
		if(age >=1 && age <= 150){
			this.age = age;
		}else{
			throw new AgeException("你是火星来的，年龄不合法");//抛出异常对象
		}
		
	}
	
	public void say(){
		System.out.println("今年" + age + "岁");
	}
}

//编译时异常
/*class AgeException extends Exception{
	
	public AgeException(String msg){
		super(msg);
	}
}*/

//运行时异常
class AgeException extends RuntimeException{
	
	public AgeException(String msg){
		super(msg);
	}
}