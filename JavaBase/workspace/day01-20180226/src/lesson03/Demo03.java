package lesson03;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Լ���������/�쳣����ʽ
		/**
		 * ��ʽһ��try��catch(����)
		 * ArithmeticException:�����쳣
		 * ��ʽ����try��catch����쳣
		 */
		
		/*try{
			int a = 10 / 0;
		}catch (ArithmeticException e) {
			System.out.println("�����쳣����������Ϊ0");
		}*/
		
		try{
			int a = 10 / 0;
		}catch (Exception e) {
			/**
			 * 1.��̬��д��
			 * 2.catch����������
			 */
			System.out.println(e.getClass());
			System.out.println("�����쳣����������Ϊ0");
		}
		
	}

}
