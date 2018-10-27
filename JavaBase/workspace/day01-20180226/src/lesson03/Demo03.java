package lesson03;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//自己将该问题/异常处理方式
		/**
		 * 方式一：try…catch(捕获)
		 * ArithmeticException:算术异常
		 * 方式二：try…catch多个异常
		 */
		
		/*try{
			int a = 10 / 0;
		}catch (ArithmeticException e) {
			System.out.println("算术异常：除数不能为0");
		}*/
		
		try{
			int a = 10 / 0;
		}catch (Exception e) {
			/**
			 * 1.多态的写法
			 * 2.catch括号理解参数
			 */
			System.out.println(e.getClass());
			System.out.println("算术异常：除数不能为0");
		}
		
	}

}
