package lesson02;

import java.util.Scanner;

import com.gyf.domain.User;
import com.gyf.service.UserService;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.用户输入
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = scanner.nextLine();
		System.out.println("请输入密码:");
		String password = scanner.nextLine();
		
		//2.查询用户
		UserService service = new UserService();
		User user = service.findUser(name,password);
		if(user != null){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败，用户名或者密码不正确");
		}
		
		scanner.close();
	}

}
