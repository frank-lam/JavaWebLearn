package lesson04;

public class Demo01 {

	public static void main(String[] args) {
/*		线程实现的方式 (2) - 定义类实现Runnable接口
		使用步骤
		1.定义类实现Runnable接口
		2.实现run方法
		3.把新线程要做的事写在run方法中
		4.创建自定义的Runnable的子类对象,创建Thread对象传入Runnable
		5.调用start()开启新线程, 内部会自动调用Runnable的run()方法*/

		
		//1.创建runable对象
		BankTask task = new BankTask();
		
		//2.创建Thread对象
		Thread t1 = new Thread(task);
		
		//3.启动线程
		t1.start();
		
		//4.再开启2个线程
		Thread t2 = new Thread(task);
		t2.start();
		
		Thread t3 = new Thread(task);
		t3.start();
	}
}

class BankTask  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("银行储蓄卡自动结算利息任务..." + Thread.currentThread());
		
		//System.out.println("线程名称:" + this.getName());
		System.out.println("线程名称:" +Thread.currentThread().getName());
	}
}
