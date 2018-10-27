package lesson10;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		//练习:通过反射越过泛型检查

		//1.声明泛型集合
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(110);
		list.add(120);
		list.add(130);
		//list.add("gyf");
		
		//2.通过反射往集合添加字符串
		//2.1 获取字节码对象(Class)
		Class clz = list.getClass();
		
		//2.2 通过反射获取方法
		Method method = clz.getMethod("add", Object.class);
		
		//2.3 调用方法
		method.invoke(list, "gyf");
		
		System.out.println(list);
		
	}
}
