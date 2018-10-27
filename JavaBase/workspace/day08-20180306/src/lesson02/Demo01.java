package lesson02;

import java.util.concurrent.Executors;

import com.gyf.model.Dog;
import com.gyf.model.Pig;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	1.简单工厂模式概述
			又叫静态工厂方法模式，它定义一个具体的工厂类负责创建一些类的实例
		2.优点
			客户端不需要在负责对象的创建，从而明确了各个类的职责
		3.缺点
			这个静态工厂类负责所有对象的创建，如果有新的对象增加，
			或者某些对象的创建方式不同，就需要不断的修改工厂类，
			不利于后期的维护
*/
		//创建对象，通过静态工厂类创建
		Executors.newCachedThreadPool();
		Dog dog = (Dog) AnimalFactory.createDog();
		Pig pig = AnimalFactory.createPig();
	}

}