package lesson01;

import com.gyf.model.Animal;
import com.gyf.model.Dog;
import com.gyf.model.Pig;

public class Demo01 {

	public static void main(String[] args) {
		//Java设计模式-工厂设计模式
		/**
		 * 工厂设计模式
		 * 1.工厂方法模式
		 * 2.简单工厂模式 Executors.newCachedThreadPool();
		 */
		//Executors.newCachedThreadPool();
		// 1.工厂方法模式
/*		1.工厂方法模式概述
		    >工厂方法模式中抽象工厂类负责定义创建对象的接口，
		    >具体对象的创建工作由继承抽象工厂的具体类实现。
		2.优点
		     客户端不需要在负责对象的创建，从而明确了各个类的职责
		     如果有新的对象增加，只需要增加一个具体的类和具体的工厂类即可，不影响已有的代码
		     后期维护容易，增强了系统的扩展性
		3.缺点
		   需要额外的编写代码，增加了工作量*/
		
		
		//以前创建对象
		Dog dog = new Dog();
		dog.setName("小黑");
		dog.setColor("Black");
/*		
		Dog dog2 = new Dog();
		dog2.setName("小黑");
		dog2.setColor("Black");
		
		Dog dog3 = new Dog();
		dog2.setName("小黑");
		dog2.setColor("Black");*/
		
		Pig pig = new Pig();
		dog.eat();
		pig.eat();
		
		System.out.println("-------------");
		//使用工厂方法模式创建对象
		DogFactory dogFactory = new DogFactory();
		Animal dog1 = dogFactory.createAnimal();
		dog1.eat();
		
		PigFactory pigFactory = new PigFactory();
		Animal pig2 = pigFactory.createAnimal();
		pig2.eat();
	}
}