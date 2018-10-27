package lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	需求：把一个字符串中的手机号码获取出来*/
		String s = "我的手机是18988888888,我曾用过18987654321,还用过18812345678";
		
		//Matcher 的find和group方法
		
		//1.匹配手机正则表达(11位)
		String regex = "1[3789]\\d{9}";
		
		//2.创建Pattern
		Pattern p = Pattern.compile(regex);
		
		//3.创建Matcher
		Matcher m = p.matcher(s);
		
		//4.找到匹配正则的内容
/*		System.out.println(m.find());
		System.out.println(m.group());
		System.out.println(m.find());
		System.out.println(m.group());
		System.out.println(m.find());
		System.out.println(m.group());*/
		while(m.find()){
			System.out.println(m.group());
		}
		
		
	}

}
