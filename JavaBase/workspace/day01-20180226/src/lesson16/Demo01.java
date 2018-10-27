package lesson16;

public class Demo01 {

	public static void main(String[] args) {
/*		如何使用异常处理
		1.原则:如果自己能处理的问题，就用try-catch, 如果自己不能解决的问题，就throws
		
		2.try-catch和throws的区别:
			后续程序需要继续运行就用try
			后续程序不需要继续运行就throws
					
		3.如果JDK没有提供对应的异常，需要自定义异常。*/

		
		//后续程序需要继续运行就用try
		/*try {
			int a = 10 / 0;
			System.out.println("a=" + a);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("有异常...");
		}
		
		System.out.println(".......");*/
		
		//后续程序不需要继续运行就throws
		Person p = new Person();
		p.setAge(-10);
	}
}

class Person{
	int age;

	public void setAge(int age)throws AgeException {
		if(age >=1 && age<=150){
			this.age = age;
		}else{
			//后续程序不需要继续运行就throws
			throw new AgeException("年龄不合法");
		}
		System.out.println("AAAAAAA");
		
	}
}
