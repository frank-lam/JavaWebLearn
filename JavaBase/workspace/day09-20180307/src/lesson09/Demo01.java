package lesson09;

public class Demo01 {

	public static void main(String[] args) {
		//正则表达式的构造摘要 - 字符类
//		[abc] a、b 或 c（简单类）
//		[^abc] 任何字符，除了 a、b 或 c（否定） 
//		[a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围）
//		[a-zA-Z_0-9] a 到 z 或 A 到 Z，_,0到9（范围）
//		[0-9] 0到9的字符都包括
//		[a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集） 
//		[a-z&&[def]] d、e 或 f（交集） 
//		[a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去） 
//		[a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去） 

		test9();
	}
	
	public static void test9(){
		//[a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去） 
		String regex =  "[a-z&&[^m-p]]";
		System.out.println("a".matches(regex));
		System.out.println("n".matches(regex));
	}
	
	public static void test8(){
		//[a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去）
		String regex =  "[a-z&&[^bc]]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
	}
	
	public static void test7(){
		//[a-z&&[def]] d、e 或 f（交集） 
		String regex =  "[a-z&&[def]]";
		System.out.println("a".matches(regex));
		System.out.println("d".matches(regex));
	}
	
	public static void test6(){
		
		//[a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集） 
		String regex = "[a-d[m-p]]";
		System.out.println("a".matches(regex));
		System.out.println("e".matches(regex));
		System.out.println("n".matches(regex));
	}
	
	
	public static void test5(){
		//[0-9] 0到9的字符都包括
		String regex = "[0-9]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("5".matches(regex));
	}
	
	public static void test4(){
		//[a-zA-Z_0-9] a 到 z 或 A 到 Z，_,0到9（范围）
		String regex = "[a-zA-Z_0-9]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("_".matches(regex));
		System.out.println("&".matches(regex));
	}
	
	public static void test3(){
		//[a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围）
		String regex = "[a-zA-Z]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("1".matches(regex));
	}
	
	public static void test2(){
		//[^abc] 任何字符，除了 a、b 或 c（否定） 
		//只要不是a,b,c,其它都返回true
		String regex = "[^abcd]";
		
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
	}
	
	public static void test1(){
		//[abc] a、b 或 c（简单类）匹配一个字符
		//正则表达式
		String regex = "[abc]";
		
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
	}
}
