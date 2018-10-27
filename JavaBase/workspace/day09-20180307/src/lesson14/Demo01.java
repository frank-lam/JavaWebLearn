package lesson14;

public class Demo01 {

	public static void main(String[] args) {
		//正则表达式的替换功能
		//public String replaceAll(String regex,String replacement)
		
		String s = "520 java 520 h5 520 c";
		
		//把520都改成"我爱你"
		//s = s.replaceAll("\\d{3}", "我爱你");
		s = s.replaceAll("520", "我爱你");
		System.out.println(s);


	}
}
