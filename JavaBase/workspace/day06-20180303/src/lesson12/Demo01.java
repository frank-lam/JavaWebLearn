package lesson12;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//加入线程
/*		join(), 当前线程暂停, 等待指定的线程执行结束后, 当前线程再继续
		join(int), 可以等待指定的毫秒之后继续*/
		
		
		Thread t1 = new Thread(){
			@Override
			public void run() {
				
				for(int i=0;i<100;i++){
					System.out.println("线程A " + i);
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t2 = new Thread(){
			@Override
			public void run() {
				
				for(int i=0;i<100;i++){
					System.out.println("线程B " + i);
					if(i == 10){
						//加入
						try {
							//t1.join();//t2暂停，直接到t1执行完后，t2才可以继续执行
							t1.join(50);//t2暂停50毫秒，让t1先执行50毫秒，然后t2会继续执行
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		
		//开启两个线程
		t1.start();
		t2.start();
		
	}

}
