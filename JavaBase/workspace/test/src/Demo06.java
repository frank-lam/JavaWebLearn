public class Demo06 {
	private static String s1 = "������";
	private static String s2 = "������";

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				while (true) {
					synchronized (s1) {
						System.out.println("�߳�1...�õ�" + s1 + "�ȴ�" + s2);
						synchronized (s2) {
							System.out.println("�߳�1...�õ�" + s2 + "����");
						}
					}
				}
			}
		}.start();

		new Thread() {
			public void run() {
				while (true) {
					synchronized (s2) {
						System.out.println("�߳�2...�õ�" + s2 + "�ȴ�" + s1);
						synchronized (s1) {
							System.out.println("�߳�2...�õ�" + s1 + "����");
						}
					}
				}
			}
		}.start();
	}
}
