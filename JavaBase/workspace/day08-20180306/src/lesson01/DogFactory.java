package lesson01;

import com.gyf.model.Animal;
import com.gyf.model.Dog;

public class DogFactory extends AnimalFactory{

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.setName("小黑");
		dog.setColor("Black");
		//.......
		return dog;
	}

}
