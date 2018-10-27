package lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo_Client {

	public static void main(String[] args) throws IOException {
		
		//1.创建Socket对象
		Socket socket = new Socket("192.168.1.125", 9999);
		
		//2.获取输入流出
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintWriter pw = new PrintWriter(os);
		
		//3.发送数据给服务端面
		pw.write("Java 还是不错的...\r\n");
		pw.flush();
		
		//4.读服务响应的数据
		System.out.println("读取响应数据:" + br.readLine());
		
		//关流
		br.close();
		socket.close();
		
		
	}
}