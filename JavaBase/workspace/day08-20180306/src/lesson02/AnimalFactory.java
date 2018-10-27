package lesson02;

import com.gyf.model.Animal;
import com.gyf.model.Dog;
import com.gyf.model.Pig;

public class AnimalFactory {

	/*public static Dog createDog(){
		Dog dog = new Dog();
		return dog;
	}*/
	
	//返回值可以是抽象类，接口，具体的类
	public static Animal createDog(){
		Dog dog = new Dog();
		return dog;
	}
	
	public static Pig createPig(){
		Pig pig = new Pig();
		return pig;
	}
}
