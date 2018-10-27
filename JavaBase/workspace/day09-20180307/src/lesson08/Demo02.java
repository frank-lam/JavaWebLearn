package lesson08;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//使用正则表达式检测是否合法的QQ号码
	/*	1:要求必须是5-15位数字 
		2:0不能开头 
		3:必须都是数字*/
		
		//1.qq的正则
		String regex = "[1-9]\\d{4,14}";
		
		//2.打印匹配结果
		System.out.println("1030103135".matches(regex));
		System.out.println("01030103135".matches(regex));
		System.out.println("1030".matches(regex));
		System.out.println("1030103135111112".matches(regex));
		System.out.println("10a30".matches(regex));
	}

}