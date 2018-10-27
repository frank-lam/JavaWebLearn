package lesson02;

public class Demo01 {

	public static void main(String[] args) {
		//适配器设计模式(掌握)
	/*	什么是适配器
		在使用监听器的时候, 需要定义一个类事件监听器接口.
		通常接口中有多个方法, 而程序中不一定所有的都用到, 但又必须重写, 这很繁琐.
		适配器简化了这些操作, 我们定义监听器时只要继承适配器, 然后重写需要的方法即可.

		适配器原理
		适配器就是一个类, 实现了监听器接口, 所有抽象方法都重写了, 但是方法全是空的.
		适配器类需要定义成抽象的,因为创建该类对象,调用空方法是没有意义的
		目的就是为了简化程序员的操作, 定义监听器时继承适配器, 只重写需要的方法就可以了
*/
		
		//1.创建按钮对象
		Button btn = new Button();
		btn.addMouseListner(new MouseListner() {
			
			@Override
			public void rightClick() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onceClick() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void doubleClick() {
				// TODO Auto-generated method stub
				
			}
		});
		btn.addMouseListner(new MouseAdapter() {
			@Override
			public void onceClick() {
				System.out.println("单击。。");
			}
		});
		
	}
}

interface MouseListner{
	public void onceClick();//单击
	public void doubleClick();//双击
	public void rightClick();//右击
}

abstract class MouseAdapter implements MouseListner{
	@Override
	public void onceClick() {}
	
	@Override
	public void doubleClick() {}
	
	@Override
	public void rightClick() {}
}

class Button{
	
	public void addMouseListner(MouseListner m){
		
	}
}
