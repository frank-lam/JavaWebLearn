package lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo01 {

	public static void main(String[] args) {
	/*	 Pattern p = Pattern.compile("a*b");
		 Matcher m = p.matcher("aaaaab");
		 boolean b = m.matches();*/
		
//		检验QQ
//		boolean b1 = "101030".matches("[1-9]\\d{4,14}");
//		System.out.println(b1);
		
		
		//等效于上面一行代码
		Pattern p = Pattern.compile("[1-9]\\d{4,14}");//正则
		Matcher m = p.matcher("101030");
		boolean b = m.matches();
		System.out.println(b);
	}
}
