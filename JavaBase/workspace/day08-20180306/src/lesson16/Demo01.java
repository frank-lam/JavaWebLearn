package lesson16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		//JDK7的六个新特性回顾和讲解
//		A:二进制字面量
		System.out.println(0b1000);
		
//		B:数字字面量可以出现下划线
		System.out.println(1000_0000);
//		C:switch 语句可以用字符串
		String s = "A";
		switch (s) {
		case "A":
			
			break;
		case "B":
					
			break;
		default:
			break;
		}
		
//		D:泛型简化,菱形泛型
		//List<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<>();
		
//		E:异常的多个catch合并,每个异常用或|
		try{
			int i = 10 / 0;//算术异常
			int[] arr = null;
			System.out.println(arr[0]);//空指针异常
		}catch (ArithmeticException | NullPointerException e) {
			// TODO: handle exception
		}
		
//		F:try-with-resources 语句 //这样写不用关流
		try(
			FileInputStream fis = new FileInputStream("a.txt");
		){
			fis.read();
		}

	}
}
