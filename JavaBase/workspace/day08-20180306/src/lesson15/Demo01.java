package lesson15;

public class Demo01 {

	public static void main(String[] args) {
		//枚举类的常见方法
/*		int ordinal() 枚举项都有索引，从0开始
		int compareTo(E o)
		String name() 枚举项名称
		String toString()
		<T> T valueOf(Class<T> type,String name)通过字节码对象获取枚举对象
		values() 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
*/
		//1.获取枚举对象
		Season s1 = Season.SPRING;
		Season s2 = Season.WINTER;
		System.out.println("s1:" + s1.ordinal());
		System.out.println("s2:" + s2.ordinal());
		
		//2.比较枚举[索引相减]
		System.out.println(s1.compareTo(s2));
		
		//3.打印枚举项名称
		System.out.println("s1 name:" + s1.name());
		System.out.println("s1:" + s1.toString());//枚举项名称
		
		//4.通过字节码对象获取枚举对象【没啥用】
		Season s3 = Season.valueOf(Season.class, "SPRING");
		System.out.println("s3:" + s3);
		
		//5.类方法，.values() 返回枚举数组
		System.out.println("枚举的遍历");
		Season[] seasons = Season.values();
		for(Season s : seasons){
			System.out.println(s);
		}
	}
}

enum Season{
	SPRING,SUMMER,AUTUMN,WINTER;
}