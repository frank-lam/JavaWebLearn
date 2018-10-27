package lesson04;

/**
 * try...catchʹ��ע������
 * 1.�����ܳ����쳣�Ĵ������try����
 * 2.catch �����ڴ�����־����쳣
 * 3.catch �ǿ���д���
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		//�Լ���������/�쳣����ʽ
		/**
		 * ��ʽһ��try��catch(����)
		 * ArithmeticException:�����쳣
		 * ��ʽ����try��catch����쳣
		 */
		
		try {
			int[] arr = {1,2,3};
			System.out.println(arr[2]);//ArrayIndexOutOfBoundsException����Խ���쳣
		
			int a = 10 / 2;//ArithmeticException�������쳣
			System.out.println(a);
			
			int[] arr1 = null;
			System.out.println(arr1[0]);//NullPointerException��ָ��
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ���쳣...");
		} catch (ArithmeticException e){
			System.out.println("�����쳣...");
		} catch(NullPointerException e){
			System.out.println("��ָ���쳣...");
		}
		
		System.out.println("......");
		
	}
}
