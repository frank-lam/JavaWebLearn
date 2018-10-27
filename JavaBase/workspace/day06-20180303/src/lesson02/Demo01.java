package lesson02;

public class Demo01 {

	public static void main(String[] args) {
/*		JVM的启动是多线程的吗？【面试题】
		1.JVM启动至少启动了垃圾回收线程和主线程，所以是多线程的。
		2.main方法的代码执行的位置就是在主线程(路径)
		3.一个进程有多个线程
		4.finalize()这个方法在子线程(垃圾回收线程)执行*/
		
		System.out.println("AAAAA");
		System.out.println("BBBBB");
		System.out.println("CCCCC");
		System.out.println("DDDDD");
		
		//打印线程名称
		System.out.println(Thread.currentThread());//主线程
		
		for(int i = 0;i<2;i++){
			new Student();
			System.gc();//启动垃圾回收
		}
	}
}

class Student{
	//被垃圾回收器回收时，会调用
	//对象从内存释放时，会调用 
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("student 被回收了...");
		//打印线程名称
		System.out.println(Thread.currentThread());//子纯种
	}
}