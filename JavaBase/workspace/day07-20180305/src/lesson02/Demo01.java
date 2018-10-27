package lesson02;

public class Demo01 {

	private static String s1 = "筷子左";
	private static String s2 = "筷子右";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//死锁(了解)
		//多线程同步的时候, 如果同步代码嵌套, 使用相同锁, 就有可能出现死锁
		
		new Thread(){
			public void run() {
				while(true){
					synchronized (s1) {
						System.out.println("线程A 拿到" + s1 + " 等待" + s2);
						synchronized (s2) {
							System.out.println("线程A 拿到" + s2 + " 开动吃饭...");
						}
					}
				}
				
			};
		}.start();
		
		new Thread(){
			public void run() {
				while(true){
					synchronized (s2) {
						System.out.println("线程B 拿到" + s2 + " 等待" + s1);
						synchronized (s1) {
							System.out.println("线程B 拿到" + s1 + " 开动吃饭。。");
						}
					}
				}
			};
		}.start();
	}

}
