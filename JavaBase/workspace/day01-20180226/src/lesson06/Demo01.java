package lesson06;

public class Demo01 {

	public static void main(String[] args) {
		//����쳣�����һ��ע������
		/*����쳣ʱ�����ܰ�Exception�쳣������ǰ��,
		�൱��Exception�������쳣�ĸ��࣬�������ദ���Ӳ��ܴ������ɸ��ദ��*/
		
		try {
			//1.�п��ܳ�������Խ���쳣
			int[] arr = {1,2,3};
			System.out.println(arr[1]);
			
			//2.�����쳣
			int a = 10 / 2;
			
			//3.��ָ���쳣
			int[] arr1 = null;
			//NullPointerException np;
			System.out.println(arr1[0]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ���쳣");
		} catch (ArithmeticException e) {
			System.out.println("�����쳣");
		} catch (Exception e) {
			System.out.println("�����쳣");
		} 
	}
}
