package lesson01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo01 {

	public static void main(String[] args) {
		//创建一个窗口并显示
		//1.创建窗口对象
		Frame window = new Frame("我是一个窗口");
		
		//2.设置窗口的大小
		window.setSize(400, 400);
		
		//3.设置位置
		window.setLocation(200, 200);
		
		//4.设置程序图标
		window.setIconImage(Toolkit.getDefaultToolkit().createImage("qq.png"));
		
		
		//5.监听窗口x 按钮
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//释放资源
				//.....
				
				//退出程序
				System.exit(0);
			}
		});
		
		
		//6.添加按钮
		//6.1创建按钮
		Button btn1 = new Button("close");
		//6.2添加到窗口
		window.add(btn1);
		
		//6.3再添加按钮
		Button btn2 = new Button("mouse");
		window.add(btn2);
		
		
		//7.设置组件布局方式[流布局]
		window.setLayout(new FlowLayout());
		
		//8.监听按钮的点击
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("点击...");
				//关闭程序
				System.exit(0);
			}
		});
		
		//9.监听鼠标的事件
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("鼠标按下...");
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("鼠标松开...");
			}
		});
		
		//10.键盘监听
		Button btn3 = new Button("keyboard");
		window.add(btn3);
		btn3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				//键盘对应字符
				//e.getKeyCode():字符编码表
				System.out.println(e.getKeyCode() + ":" + e.getKeyChar());
			}
		});
		
		
		//显示窗口
		window.setVisible(true);
		
	}
}
