package lesson05;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try…catch多个异常-另一种写法:把多个异常放在一个catch中，用|或符号连接
		try {
			int[] arr = {1,2,3};
			System.out.println(arr[1]);//ArrayIndexOutOfBoundsException数组越界异常
		
			int a = 10 / 0;//ArithmeticException：算术异常
			System.out.println(a);
			
		//catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e)
		} catch (ArrayIndexOutOfBoundsException  | ArithmeticException e) {
			System.out.println(e.getClass());
			System.out.println("数组越界异常或者算法异常...");
		}
	}

}
