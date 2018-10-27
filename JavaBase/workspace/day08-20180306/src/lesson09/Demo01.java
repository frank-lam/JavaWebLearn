package lesson09;

import java.lang.reflect.Method;

import com.gyf.model.Teacher;

public class Demo01 {

	public static void main(String[] args) throws Exception{
		//通过反射获取方法并使用
		/**
		 * 1.反射中通过Method类描述方法【构造方法：Contructor,字段:Field】
		   2.通过Class的getMethod可以获取一个方法
		   3.通过getDeclaredMethod可以获取私有方法
		   4.如果要调用私有方法，设置访问权限setAccessible
		 */
		
		//1.获取字节码对象
		Class clz = Teacher.class;
				
		Teacher teacher = new Teacher();
	/*	teacher.say1();
		teacher.say2("小黄鸭");
		teacher.say3("小黄鸭",2);*/
		
		//2.通过反射调用方法
		//2.1 获取无参方法
		Method m1 = clz.getDeclaredMethod("say1");
		//2.1 获取有参方法
		Method m2 = clz.getDeclaredMethod("say2", String.class);
		Method m3 = clz.getDeclaredMethod("say3", String.class,int.class);
	
		//设置私有方法可以访问
		m1.setAccessible(true);
		m2.setAccessible(true);
		m3.setAccessible(true);
		//3.2 调用方法
		m1.invoke(teacher);
		m2.invoke(teacher, "小猪");
		m3.invoke(teacher, "小狗",98);
	}
}