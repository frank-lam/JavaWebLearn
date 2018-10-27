package lesson11;

public class Demo01 {

	public static void main(String[] args) {
		//守护线程【了解，开发中很少用】
/*		setDaemon(), 设置一个线程为守护线程, 该线程不会单独执行, 
		当其他非守护线程都执行结束后, 自动退出*/
		
		//1.创建两个线程
		Thread t1 = new Thread(){
			public void run() {
				
				for(int i = 0;i < 5;i++){
					System.out.println("线程-女 " + i);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		};
		
		Thread t2 = new Thread(){
			public void run() {
				
				for(int i = 0;i < 15;i++){
					System.out.println("线程-男 " + i);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		};
		
		//设置t2为守护线程
		t2.setDaemon(true);
		
		//开启线程
		t1.start();
		t2.start();
		
	}
}