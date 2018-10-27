package lesson14;

/**
 * �Զ����쳣�Ĳ��裺
 * 1.дһ����(AgeException)�̳�Exception�������Ǳ���ʱ�쳣
 * 2.�������쳣AgeException�ṩһ�����ַ��������Ĺ��췽��
 * 		public AgeException(String msg){
		super(msg);
		}
   3.�Զ����쳣ʱ��Ҳ���Լ̳�RuntimeException,����������ʱ�쳣	
 * @author gyf
 *
 */
public class Demo01 {

	public static void main(String[] args){
		//�Զ����쳣�����ͻ���ʹ��
		/**
		 * 1.�Զ���һ�������쳣AgeException
		 */
		
		//ArithmeticException ae;
		//int a = 10 / 0;//�׳�Exception������
		
		Person p = new Person();
		p.setAge(180);
		p.say();
	}
}

class Person{
	private int age;

	/**
	 * age��1~150�귶Χ
	 * �ڷ������׳��쳣
	 * @param age
	 */
	public void setAge(int age) throws AgeException{
		if(age >=1 && age <= 150){
			this.age = age;
		}else{
			throw new AgeException("���ǻ������ģ����䲻�Ϸ�");//�׳��쳣����
		}
		
	}
	
	public void say(){
		System.out.println("����" + age + "��");
	}
}

//����ʱ�쳣
/*class AgeException extends Exception{
	
	public AgeException(String msg){
		super(msg);
	}
}*/

//����ʱ�쳣
class AgeException extends RuntimeException{
	
	public AgeException(String msg){
		super(msg);
	}
}