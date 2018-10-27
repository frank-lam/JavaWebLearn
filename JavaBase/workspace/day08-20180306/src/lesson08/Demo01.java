package lesson08;

import java.lang.reflect.Field;

import com.gyf.model.Teacher;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		//通过反射获取成员变量(属性)并使用
/*		Field类
		*1.Class.getField(String)方法可以获取类中的指定字段(可见的),
		2.如果是私有的,可以用getDeclaedField("name")方法获取
		3.通过set(obj, "李四")方法可以设置指定对象上该字段的值
		4.如果是私有的需要先调用setAccessible(true)设置访问权限,
		5.调用get(obj)可以获取指定对象中该字段的值*/

		//1.获取字节码对象
		Class clz = Teacher.class;
		
		//2.获取color字段
		Field colorField = clz.getField("color");
		System.out.println(colorField);
		
		//3.通过反射给字段赋值
		Teacher teacher = new Teacher();
		//teacher.color = "白色";
		colorField.set(teacher, "黄色");
		
		//4.获取私有name属性
		Field nameField = clz.getDeclaredField("name");	
		System.out.println(nameField);
		
		//5.通过反射给私有属性赋值
		nameField.setAccessible(true);//设置私有属性可以访问
		nameField.set(teacher, "gyf");
		
		System.out.println(teacher);
		
		//6.通过反射获取私有属性的值
		Object value = nameField.get(teacher);
		System.out.println(value);
		

	}
}