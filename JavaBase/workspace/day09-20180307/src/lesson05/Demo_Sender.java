package lesson05;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.SocketException;
import java.util.Scanner;

public class Demo_Sender {

	public static void main(String[] args) throws Exception {
//		1.发送Send
//		创建DatagramSocket, 随机端口号
		DatagramSocket sender = new DatagramSocket();
		
		//2 Scanner
		Scanner scanner = new Scanner(System.in);
		
		while(true){
//			创建DatagramPacket【数据包】, 指定数据, 长度, 地址, 端口
			System.out.println("输入内容：");
			String s = scanner.nextLine();
			byte[] bs = s.getBytes("UTF-8");
			DatagramPacket packet = new DatagramPacket(bs, bs.length, Inet4Address.getByName("192.168.1.125"), 5288);
			
//			使用DatagramSocket发送DatagramPacket
			sender.send(packet);
		}
		

		
//		关闭DatagramSockets
		//sender.close();
	}
}
