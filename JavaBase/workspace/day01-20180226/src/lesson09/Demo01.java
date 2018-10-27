package lesson09;

public class Demo01 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//throws的方式处理异常
		/**
		 * 自己处理异常:
		 * 1.try-catch
		 * 2.try-catch-catch(多个catch)
		 * 3.throws 使用
		 * 
		 * 
		 * 实现方式：
			 1.定义功能方法时，需要把出现的问题暴露出来让调用者去处理。
				  调用者可以try-catch来处理
				 调用者也还可以再往上一级throws
			 2.那么就通过throws在方法上标识。
		 */
		
		Person p = new Person();
		p.setAge(-18);
		/*try {
			p.setAge(-18);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		p.say();
	}
}

class Person {
	private int age;

	public int getAge() {
		return age;
	}

	//throws 可以跟多个异常类名，用逗号隔开
	//public void setAge(int age)throws Exception,ArithmeticException 
	public void setAge(int age)throws Exception{
		
		//年龄要1~150岁内
		if(age >= 1 && age <=150){
			this.age = age;
		}else{
			//System.out.println("你是来自火星");
			throw new Exception("你是来自火星");//告诉外界异常的类型
			//System.out.println("...");
		}
	}
	
	public void say(){
		System.out.println("我今年"+ age);
	}
}
