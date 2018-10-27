package lesson18;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		/*练习:键盘输入的用户名只能包含英文字符
			1.使用键盘获取用户录入内容，只能传入英文字符串，否则抛出 非法字符 的异常
			2.非法字符 的异常需要自定义
			3.异常定义为运行时异常*/
		
		//1.获取用户的输入
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = scanner.nextLine();
		
		//2.判断字符是否合法
		for(int i=0;i<username.length();i++){
			char ch = username.charAt(i);
			//小写字符
			boolean isSmall = (ch >= 'a' && ch <= 'z');
			
			//大写字符的区间
			boolean isBig = (ch >= 'A' && ch <= 'Z');
			
			//第一种写法
			/*if(isSmall || isBig){
				//System.out.println(ch + "合法字符");
			}else{
				//System.out.println(ch + "不合法字符");
				throw new IllegalCharacterException("不合法的字符:" + ch);
			}*/
			
			//第二种写法
			if(!(isSmall || isBig)){//不合法字符
				throw new IllegalCharacterException("不合法的字符:" + ch);
			}
		}
	}
}

//定义 非法字符 的异常
class IllegalCharacterException extends RuntimeException{

	public IllegalCharacterException(String message) {
		super(message);//RuntimeException(String message)
	}
	
}