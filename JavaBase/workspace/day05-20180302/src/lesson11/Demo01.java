package lesson11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Period;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Demo01 {

	public static void main(String[] args) throws IOException, IOException {
		//Properties的概述和作为Map集合的使用【掌握-经常用】

		/**
		 * Properties:属性
			1.Properties 类表示了一个持久的属性集。
			2.Properties 可保存在流中或从流中加载。
			3.属性列表中每个键及其对应值都是一个字符串。
		 */
		
		//遍历properties所有属性key和值value
		//1.创建属性对象
		Properties p = new Properties();
		
		//2.关联文件
		p.load(new FileInputStream("info.properties"));
		
		//3.遍历一
		Set<Object> keys = p.keySet();
		for(Object key : keys){
			System.out.println(key + "=" + p.get(key));
		}
		//System.out.println(keys);
		
		//4.遍历二
		System.out.println("=====================");
		//p.entrySet();
		for(Entry<Object, Object> entry :p.entrySet()){
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

	public static void test2() throws IOException, FileNotFoundException {
		//使用Properties读取数据
		//1.创建属性对象
		Properties p = new Properties();
		
		//2.关联文件
		p.load(new FileInputStream("info.properties"));
		
		//3.通过key读数据
		String name = p.getProperty("name");
		String city = p.getProperty("city");
		String hometown = p.getProperty("hometown");
		System.out.println(name);
		System.out.println(city);
		System.out.println(hometown);
	}

	/**
	 * 使用Properties来存储数据
	 */
	public static void test1() throws IOException, FileNotFoundException {
		//1.创建属性对象
		Properties p = new Properties();
		
		//2.存数据
		p.setProperty("name", "gyf");
		p.setProperty("city", "广州");
		p.setProperty("hometown", "梅州");
		
		//3.关联文件
		/**
		 * 当Properties把key和value存入文件，把中文转成unicode编码
		 */
		p.store(new FileOutputStream("info.properties"), null);
	}
}
