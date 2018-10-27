package lesson10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//JDK1.5新特性互斥锁
	/*	同步加锁
		使用ReentrantLock类[互斥锁]的lock()和unlock()方法进行同步
		通信
		使用ReentrantLock类的newCondition()方法可以获取Condition对象
		需要等待的时候使用Condition的await()方法, 唤醒的时候用signal()方法
		不同的线程使用不同的Condition, 这样就能区分唤醒的时候找哪个线程了*/
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

/**
 * 互斥锁的使用步骤
 * 1.创建互斥锁对象
 * 2.创建3个Condition
 * 3.加锁、解锁
 * 4.线程等待-Condition的await方法
 * 5.线程唤醒-Condition的signal方法
 * @author gyf
 *
 */
class MyTask{
	//创建互斥锁对象
	ReentrantLock rl = new ReentrantLock();
	//创建3个Condition
	Condition c1 = rl.newCondition();
	Condition c2 = rl.newCondition();
	Condition c3 = rl.newCondition();
	
	//标识 1:可以执行任务1，2:可以执行任务2, 3:可以执行任务3 
	int flag = 1;
	
	public void task1() throws InterruptedException{
	 rl.lock();//加锁
			if(flag != 1){
				c1.await();//当前线程等待
			}
			
			System.out.println("1.银行信用卡自动还款任务...");
			flag = 2;
			
			//指定唤醒线程2
			c2.signal();
	 rl.unlock();//解锁
	}
	
	public void task2() throws InterruptedException{
	  rl.lock();	
			if(flag != 2){
				c2.await();//线程等待
			}
			
			System.out.println("2.银行储蓄卡自动结算利息任务...");
			flag = 3;
			
			//唤醒线程3
			c3.signal();
	  rl.unlock();
	}
	
	public void task3() throws InterruptedException{
	 rl.lock();
			if(flag != 3){
				c3.await();//线程等待
			}
			
			System.out.println("3.银行短信提醒任务...");
			flag = 1;
			
			//唤醒线程1
			c1.signal();
	 rl.unlock();
	}
}