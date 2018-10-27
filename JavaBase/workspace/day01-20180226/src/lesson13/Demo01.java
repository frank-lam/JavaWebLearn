package lesson13;

public class Demo01 {

	public static void main(String[] args) {
		/*面试题 ：
		    如果catch里面有return语句，请问finally的代码还会执行吗?
		    如果会，请问是在return前还是return后?
		  答：会执行，finally的代码在return之前执行
		    */
		int r = getDiv(10, 0);
		System.out.println("r=" + r);
	}
	
	//返回 a/b的结果
	public static int getDiv(int a,int b){
		int i = 0;
		try {
			i = a / b;
			return i;
		} catch (ArithmeticException e) {
			System.out.println("算术异常-除数不能为0");
			i = -1;
			return i;
		}finally {
			System.out.println("final代码执行了...");
			//最好不要在finally写return代码，这样写没什么意义
		/*	i = -2;
			return i;*/
		}
		
	}
}
