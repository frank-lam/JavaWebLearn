package lesson05;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try��catch����쳣-��һ��д��:�Ѷ���쳣����һ��catch�У���|���������
		try {
			int[] arr = {1,2,3};
			System.out.println(arr[1]);//ArrayIndexOutOfBoundsException����Խ���쳣
		
			int a = 10 / 0;//ArithmeticException�������쳣
			System.out.println(a);
			
		//catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e)
		} catch (ArrayIndexOutOfBoundsException  | ArithmeticException e) {
			System.out.println(e.getClass());
			System.out.println("����Խ���쳣�����㷨�쳣...");
		}
	}

}
