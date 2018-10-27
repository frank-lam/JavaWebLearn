package lesson14;

public class Demo01 {

	public static void main(String[] args) {
	/*	枚举概述
		1.枚举是指将变量的值一一列出来,可以称为『数据集』 。
		      举例：一周只有7天，一年只有12个月，一年有四个季节等。
		2.Java中enum通过声明的类称为枚举类
		3.枚举其实就是限定范围，防止不应该发生的事情发生
		4.枚举注意事项
			定义枚举类要用关键字enum
			所有枚举类都是Enum的子类
			枚举类的第一行上必须是枚举项，最后一个枚举项后的分号是可以省略的，但是如果枚举类有其他的东西，这个分号就不能省略。建议不要省略
			枚举类可以有构造器，但必须是private的，它默认的也是private的。
			枚举类也可以有抽象方法，但是枚举项必须重写该方法
			枚举在switch语句中的使用
		5. 枚举是一个特殊类
*/

		//使用枚举
		Season season = Season.SUMMER;
		season.test();//调用枚举的方法
		
	/*	switch (season) {
		case SPRING:
			System.out.println("春天来了，树木发芽了。。。");
			break;
		case SUMMER:
			System.out.println("夏天来了，空调开起来。。。");
			break;
		case AUTUMN:
			System.out.println("秋天来了，秋装买起来。。。");
			break;
		case WINTER:
			System.out.println("冬天来了，棉袄包起来。。。");
			break;
		default:
			break;
		}*/
	}
}

//一年有四个季节
enum Season{
	//春夏秋冬
	SPRING("春天"){
		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
	},
	SUMMER("夏天"){
		@Override
		public void test() {
			// TODO Auto-generated method stub
			System.out.println("夏天夏天夏天悄悄过去...");
			
		}
	},
	AUTUMN("秋天"){
		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
	},
	WINTER("冬天"){
		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
	};
	
	/*Season(){
		System.out.println("空参的构造方法");
	}*/
	
	private String s;
	private Season(String s){
		this.s = s;
	}
	
	public abstract void test();
}