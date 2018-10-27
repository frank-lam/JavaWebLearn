package lesson10;

public class Demo01 {

	public static void main(String[] args) {
		//正则表达式的构造摘要 -预定义字符类
//		. 任何字符
//		\d 数字：[0-9] 
//		\D 非数字： [^0-9] 
//		\s 空白字符：[ \t\n\x0B\f\r] 
//		\S 非空白字符：[^\s] 
//		\w 单词字符：[a-zA-Z_0-9] 
//		\W 非单词字符：[^\w] 
		test6();

	}
	
	
	public static void test6(){
		//\w 单词字符：[a-zA-Z_0-9] 
		String regex = "\\W";
		System.out.println("a".matches(regex));
		System.out.println("A".matches(regex));
		System.out.println("_".matches(regex));
		System.out.println("9".matches(regex));
		System.out.println("%".matches(regex));
		
	}
	
	public static void test5(){
		//\S 非空白字符 
		String regex = "\\S";
		System.out.println(" ".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("	".matches(regex));
	}
	
	public static void test4(){
		//\s 空白字符 "空格键&Tab键"
		String regex = "\\s";
		System.out.println(" ".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("	".matches(regex));
	}
	
	public static void test3(){
		// \D 非数字：[^0-9] 
		String regex = "\\D";
		System.out.println("a".matches(regex));
		System.out.println("2".matches(regex));
		System.out.println("&".matches(regex));
	}
	
	
	public static void test2(){
		// \d 数字：[0-9] 
		
		String regex = "\\d";
		System.out.println("a".matches(regex));
		System.out.println("2".matches(regex));
		System.out.println("&".matches(regex));
	}
	
	public static void test1(){
		//. 任何单个字符
		String regex = ".";
		System.out.println("a".matches(regex));
		System.out.println(" ".matches(regex));
		System.out.println("&".matches(regex));
		System.out.println("1".matches(regex));
	}
}