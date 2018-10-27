package lesson17;

import java.util.Scanner;

/**
 * 什么时候方法后面不需要写throws
 *   方法内throw的异常对象如果是一个运行时异常，方法后面就不会写throws
 */
public class Demo01 {

	public static void main(String[] args)  {
		//案例：自定义一个登录异常
		/**
		 * 1、当用户名和密码不正确时抛出登录异常
		 * 2、用户名admin,密码为123
		 * 3、用户名和密码由用户通过键盘输入
		 */
		
		//1.获取用户的输入的用户名和密码
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = scanner.nextLine();
		
		System.out.println("请输入密码：");
		String password = scanner.nextLine();
		
		
		//2.判断用户名和密码是否正确
		if("admin".equals(username) && "123".equals(password)){
			System.out.println("登录成功");
		}else{
			//3.抛出登录异常
			throw new LoginException("用户名或者密码不正确");
		}
	}

}
