package lesson13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01 {

	public static void main(String[] args) {
/*		Java的内置线程池
		1.JDK5新增了一个Executors工厂类来产生线程池，有如下几个方法
			public static ExecutorService newFixedThreadPool(int nThreads)
			public static ExecutorService newSingleThreadExecutor()
		2. 这些方法的返回值是ExecutorService对象，该对象表示一个线程池，
		      可以执行Runnable对象或者Callable对象代表的线程。
		      它提供了如下方法
				Future<?> submit(Runnable task)
				<T> Future<T> submit(Callable<T> task)
			
		3.使用步骤：
			1.创建线程池对象
			2.创建Runnable实例
			3.提交Runnable实例
			4.关闭线程池es.shutdown();
		4.Runnable和Callable的区别
		  Runnable的run方法没有返回值
		  Callable的call方法有返回值，一般返回值也没用
*/
		
		//案例：10个线程完成10个洗车任务
		/*for(int i = 0;i<10;i++){
			new Thread(){
				public void run() {
					System.out.println("洗车任务 " + Thread.currentThread());
				};
			}.start();
		}*/
		
		//案例:5个线程完成10个洗车的任务
		//1.创建线程池
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		//2.添加任务-方式一
		/*for(int i=0;i<10;i++){
			es.submit(new Runnable() {
				@Override
				public void run() {
					System.out.println("洗车任务 " + Thread.currentThread());
				}
			});
		}*/
		
		//3.添加任务-方式二
		for(int i=0;i<10;i++){
			es.submit(new MyTask());
		}
		
		
		
		
	}
}

class MyTask implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("洗车任务 " + Thread.currentThread());
		return 110;
	}
	
}