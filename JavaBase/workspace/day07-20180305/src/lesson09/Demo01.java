package lesson09;

public class Demo01 {

	public static void main(String[] args) throws InterruptedException {
	/*	
		线程通讯的一些疑问
		1.在同步代码块中,用哪个对象锁,就用哪个对象调用wait方法
		2.为什么wait方法和notify方法定义在Object这类中?
				因为锁对象可以是任意对象,Object是所有的类的基类,所以wait方法和notify方法需要定义在Object这个类中
		3.sleep方法和wait方法的区别?
			》sleep方法必须传入参数,参数就是时间,时间到了自动醒来
			》wait方法可以传入参数也可以不传入参数,传入参数就是在参数的时间结束后等待,不传入参数就是直接等待
			》sleep方法在同步函数或同步代码块中,不释放锁,睡着了也抱着锁睡
			》wait方法在同步函数或者同步代码块中,释放锁
			
			/**
			 * sleep方法要传参数，抱着锁睡
			 * wait方法可以传参数，也可以不用传，释放锁
			 */

		Thread.sleep(3000);//3秒
		System.out.println("....");
	}

}
