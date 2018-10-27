package lesson12;

public class Demo01 {

	public static void main(String[] args) {
		//正则表达式的分割功能
	/*	public String[] split(String regex)
		根据给定正则表达式的匹配拆分此字符串。 */
		
		/*String s = "11-23-21-20-28";
		String[] arr = s.split("-");
		for(String str : arr){
			System.out.println(str);
		}*/
		
		String s = "11.23.21.20.28";
		/**
		 * 如果是按.拆分，注意要添加转义字符
		 */
		String[] arr = s.split("\\.");
		for(String str : arr){
			System.out.println(str);
		}
	}
}
