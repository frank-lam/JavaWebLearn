package lesson16;

public class Demo01 {

	public static void main(String[] args) {
/*		���ʹ���쳣����
		1.ԭ��:����Լ��ܴ�������⣬����try-catch, ����Լ����ܽ�������⣬��throws
		
		2.try-catch��throws������:
			����������Ҫ�������о���try
			����������Ҫ�������о�throws
					
		3.���JDKû���ṩ��Ӧ���쳣����Ҫ�Զ����쳣��*/

		
		//����������Ҫ�������о���try
		/*try {
			int a = 10 / 0;
			System.out.println("a=" + a);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���쳣...");
		}
		
		System.out.println(".......");*/
		
		//����������Ҫ�������о�throws
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
			//����������Ҫ�������о�throws
			throw new AgeException("���䲻�Ϸ�");
		}
		System.out.println("AAAAAAA");
		
	}
}
