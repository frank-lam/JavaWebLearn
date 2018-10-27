package lesson08;

/**
 * 掌握notify和notifyAll方法的区别
 * 1.notify是随机唤醒一个线程
 * 2.notifyAll是唤醒所有线程
 * @author gyf
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		//三个线程间的通讯
		MyTask task = new MyTask();
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
		new Thread(){
			public void run() {
				while(true){
					try {
						task.task3();
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
	
	//标识 1:可以执行任务1，2:可以执行任务2, 3:可以执行任务3 
	int flag = 1;
	
	public synchronized void task1() throws InterruptedException{
		if(flag != 1){
			this.wait();//当前线程等待
			//this.wait(timeout);
		}
		
		System.out.println("1.银行信用卡自动还款任务...");
		flag = 2;
		//this.notify();//唤醒随机线程
		this.notifyAll();//唤醒所有等待线程
		
	}
	
	public synchronized void task2() throws InterruptedException{
		
		if(flag != 2){
			this.wait();//线程等待
		}
		
		System.out.println("2.银行储蓄卡自动结算利息任务...");
		flag = 3;
		//this.notify();//唤醒其它线程
		this.notifyAll();
		//Thread.sleep(millis);
	}
	
	public synchronized void task3() throws InterruptedException{
			if(flag != 3){
				this.wait();//线程等待
			}
			
			System.out.println("3.银行短信提醒任务...");
			flag = 1;
			//this.notify();//唤醒其它线程
			this.notifyAll();
	}
}
