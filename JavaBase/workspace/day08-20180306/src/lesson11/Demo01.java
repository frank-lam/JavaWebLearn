package lesson11;

import java.lang.reflect.Field;

import com.gyf.model.Teacher;

/**
 * 掌握：抽取方法的思想
 * @author gyf
 *
 */
public class Demo01 {

	public static void main(String[] args) throws Exception {
		//练习:写一个通用的方法，设置对象的属性值
		Teacher teacher = new Teacher();
		Tool.setFieldValue(teacher, "name", "gyf");
		Tool.setFieldValue(teacher, "homntown", "广州");
		Tool.setFieldValue(teacher, "height", 1.7);
		System.out.println(teacher);
	}

	public static void test1() throws NoSuchFieldException, IllegalAccessException {
		//通过反射给私有属性赋值
		Teacher teacher = new Teacher();
		
		//1.获取字节码
		Class clz = teacher.getClass();
		
		//2.获取属性Field
		Field field1 = clz.getDeclaredField("name");
		Field field2 = clz.getDeclaredField("homntown");
		Field field3 = clz.getDeclaredField("height");
		
		//3.设置权限
		field1.setAccessible(true);
		field2.setAccessible(true);
		field3.setAccessible(true);
		
		//4.赋值属性
		field1.set(teacher, "gyf");
		field2.set(teacher, "梅州");
		field3.set(teacher, 1.7);
		
		System.out.println(teacher);
	}
}
