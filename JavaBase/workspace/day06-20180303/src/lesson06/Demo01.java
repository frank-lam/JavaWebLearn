package lesson06;

public class Demo01 {

	public static void main(String[] args) {
		//匿名内部类实现线程的两种方式
		/**
		 * 实现线程方式2种
		 * 1.继承Thread
		 * 2.实现Runnable接口
		 */
		
		/*Thread t1 = new Thread(){
			@Override
			public void run() {
				System.out.println("任务1...." + Thread.currentThread());
			}
		};
		
		t1.start();*/
		
		new Thread(){
			public void run() {
				System.out.println("任务1...." + Thread.currentThread());
			};
		}.start();
		
		
		/*Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("任务2...." + Thread.currentThread());
			}
		});
		t2.start();*/
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("任务2...." + Thread.currentThread());
			}
		}).start();
	}
}

/*class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//任务 ......
	}
}*/