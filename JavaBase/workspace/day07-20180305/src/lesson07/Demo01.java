package lesson07;

public class Demo01 {

	public static void main(String[] args) {
/*		什么时候需要通信
		1.多个线程并发执行时, 在默认情况下CPU是随机切换线程的
		如果我们希望他们有规律的执行, 就可以使用通信, 例如每个线程执行一次打印
		2.怎么通信？
		》如果希望线程等待, 就调用wait()
		》如果希望唤醒等待的线程, 就调用notify();
		》这两个方法必须在同步代码中执行, 并且使用同步锁对象来调用
		》如果方法中没有同步锁，会有异常IllegalMonitorStateException*/
		
		
		//1.创建任务对象
		MyTask task = new MyTask();
		
		//2.开启两个线程执行2个任务
		new Thread(){
			public void run() {
				while(true){
					try {
						task.task1();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}.start();
		
		new Thread(){
			public void run() {
				while(true){
					try {
						task.task2();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}.start();
	}
}

class MyTask{
	
	//标识 1:可以执行任务1，2:可以执行任务2
	int flag = 1;
	
	public synchronized void task1() throws InterruptedException{
		if(flag != 1){
			this.wait();//当前线程等待
		}
		
		System.out.println("1.银行信用卡自动还款任务...");
		flag = 2;
		this.notify();//唤醒其它线程
		
	}
	
	public synchronized void task2() throws InterruptedException{
		
		if(flag != 2){
			this.wait();//线程等待
		}
		
		System.out.println("2.银行储蓄卡自动结算利息任务...");
		flag = 1;
		this.notify();//唤醒其它线程
	}
}
