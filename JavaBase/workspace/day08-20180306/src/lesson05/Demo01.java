package lesson05;

public class Demo01 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
/*		获取字节码对象(Class)的三种方式
		1.Object类的getClass()方法,判断两个对象是否是同一个字节码文件
		2.静态属性class,锁对象
		3.Class类中静态方法forName()*/
		
		//1.Object类的getClass()方法
		Person p = new Person();
		Class clz1 = p.getClass();
		
		//2.静态属性clas
		Class clz2 = Person.class;
		
		//3.Class类中静态方法forName()
		/**
		 * 参数 forName(String className) 传类全路路(包名+类名)
		 */
		Class clz3 = Class.forName("lesson05.Person");
		
		//4.字节码对象在内存中只有一个
		System.out.println("clz1:" + clz1.hashCode());
		System.out.println("clz2:" + clz2.hashCode());
		System.out.println("clz3:" + clz3.hashCode());
	}

}
