package lesson11;

public class Demo01 {

	public static void main(String[] args) {
	/*	finally关键字的特点及作用
		1.finally的特点
		finally的语句体一般情况下一定会执行
		特殊情况：在执行到finally之前jvm退出了(比如System.exit(0))
		2.finally的作用
		用于释放资源，在IO流操作和数据库操作中会见到*/

		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("算术异常..");
			System.exit(0);//程序退出
		}finally {
			System.out.println("finally的代码块执行了....");
		}
		
	}
}
