package lesson09;

public class Demo01 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//throws�ķ�ʽ�����쳣
		/**
		 * �Լ������쳣:
		 * 1.try-catch
		 * 2.try-catch-catch(���catch)
		 * 3.throws ʹ��
		 * 
		 * 
		 * ʵ�ַ�ʽ��
			 1.���幦�ܷ���ʱ����Ҫ�ѳ��ֵ����Ⱪ¶�����õ�����ȥ����
				  �����߿���try-catch������
				 ������Ҳ������������һ��throws
			 2.��ô��ͨ��throws�ڷ����ϱ�ʶ��
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

	//throws ���Ը�����쳣�������ö��Ÿ���
	//public void setAge(int age)throws Exception,ArithmeticException 
	public void setAge(int age)throws Exception{
		
		//����Ҫ1~150����
		if(age >= 1 && age <=150){
			this.age = age;
		}else{
			//System.out.println("�������Ի���");
			throw new Exception("�������Ի���");//��������쳣������
			//System.out.println("...");
		}
	}
	
	public void say(){
		System.out.println("�ҽ���"+ age);
	}
}
