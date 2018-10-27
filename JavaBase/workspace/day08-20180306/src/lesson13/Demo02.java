package lesson13;

public class Demo02 {

	public static void main(String[] args) {
		//模版(Template)设计模式
		/**
		 * 模版模式就是定义一个算法的骨架，而将具体的算法延迟到子类中来实现
		 * 
		 * 设计一个计算耗时的模版
		 * 
		 */
		System.out.println(new Test1().getScheduleTime());
	}
}

abstract class TimeTemplate{
	//获取执行时间
	public long getScheduleTime(){
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		long delta = end - start;//设置时间差
		return delta;
	}
	
	public abstract void code();
}

class Test1 extends TimeTemplate{

	@Override
	public void code() {

		for(int i=0;i<100000;i++){
			System.out.println("我喜欢林心茹...");
		}
	}
	
}

class Test2 extends TimeTemplate{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		System.out.println("人工智能算法...");
	}
}
