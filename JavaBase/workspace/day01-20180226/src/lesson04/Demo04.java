package lesson04;

/**
 * try...catch使用注意事项
 * 1.将可能出现异常的代码放在try里面
 * 2.catch 是用于处理各种具体异常
 * 3.catch 是可以写多个
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		//自己将该问题/异常处理方式
		/**
		 * 方式一：try…catch(捕获)
		 * ArithmeticException:算术异常
		 * 方式二：try…catch多个异常
		 */
		
		try {
			int[] arr = {1,2,3};
			System.out.println(arr[2]);//ArrayIndexOutOfBoundsException数组越界异常
		
			int a = 10 / 2;//ArithmeticException：算术异常
			System.out.println(a);
			
			int[] arr1 = null;
			System.out.println(arr1[0]);//NullPointerException空指针
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界异常...");
		} catch (ArithmeticException e){
			System.out.println("算术异常...");
		} catch(NullPointerException e){
			System.out.println("空指针异常...");
		}
		
		System.out.println("......");
		
	}
}
