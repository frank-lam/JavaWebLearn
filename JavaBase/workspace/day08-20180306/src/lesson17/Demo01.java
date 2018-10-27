package lesson17;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//JDK8的新特性
/*		接口中可以定义有方法体的方法
			如果是非静态,必须用default修饰	
			如果是静态的就不用了*/
		
		Dog dog = new Dog();
		dog.eat();
		Animal.sleep();
	}

}


interface Animal{
	//接口只能声明方法，不能实现,就是不能有方法体
	//public void eat();
	
	
	//jdk1.8可以有方法体
	public default void eat(){
		System.out.println("吃饭...");
	}
	
	public static void sleep(){
		System.out.println("睡.....");
	}
}

class Dog implements Animal{
	
}