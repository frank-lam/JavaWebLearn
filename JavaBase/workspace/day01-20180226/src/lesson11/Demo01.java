package lesson11;

public class Demo01 {

	public static void main(String[] args) {
	/*	finally�ؼ��ֵ��ص㼰����
		1.finally���ص�
		finally�������һ�������һ����ִ��
		�����������ִ�е�finally֮ǰjvm�˳���(����System.exit(0))
		2.finally������
		�����ͷ���Դ����IO�����������ݿ�����л����*/

		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("�����쳣..");
			System.exit(0);//�����˳�
		}finally {
			System.out.println("finally�Ĵ����ִ����....");
		}
		
	}
}
