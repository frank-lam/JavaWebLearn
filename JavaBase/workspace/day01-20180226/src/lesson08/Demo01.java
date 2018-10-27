package lesson08;

public class Demo01 {

	public static void main(String[] args) {
		/*Exception��һ���̳�Throwable������
		  Throwable�м������õķ������˽⼴�ɣ�ƽʱ������ô�á�
			getMessage():��ȡ�쳣��Ϣ�������ַ�����
			toString():��ȡ�쳣�������쳣��Ϣ�������ַ�����
			printStackTrace():��ӡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ��*/
		
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());//�쳣������Ϣ
			System.out.println(e.toString());//�쳣����+�쳣��Ϣ
			e.printStackTrace();//�õıȽ϶�
			System.out.println("�����쳣");
		}
		
		/*
		 * 1.Java����������쳣��ӡ����Ϣ
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		   at lesson08.Demo01.main(Demo01.java:11)
		   
		   2. catch��printStackTrace();������ӡ����Ϣ
		   Java.lang.ArithmeticException: / by zero
			at lesson08.Demo01.main(Demo01.java:13)
		   */
		
	}
}
