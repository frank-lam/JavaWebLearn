package lesson09;

public class Demo01 {

	public static void main(String[] args) {
		//递归
		/**
		 * 递归做为一种算法,在程序设计语言中广泛应用。 
		      递归：就方法内部调用自己
		      
		      递归的弊端:不能调用次数过多,容易导致栈内存溢出
		      递归的好处:不用知道循环次数
		 */
		
		//使用递归来写乘阶
		int r = jiecheng(116);
		System.out.println("r=" + r);
		
	}
	
	/**
	 * jiecheng(6)  i = 6
	 * 6 * jecheng(5)
	 * 6 * 5 * jecheng(4)
	 * 6 * 5 * 4 * jecheng(3)
	 * 6 * 5 * 4 * 3 * jecheng(2)
	 * 6 * 5 * 4 * 3 * 2 * jecheng(1)
	 * 6 * 5 * 4 * 3 * 2 * 1
	 */
	public static int jiecheng(int i){
		if(i==1){
			return 1;
		}else{
			return i * jiecheng(i - 1);
		}
	}
	
	/**
	 * 使用for循环写阶乘
	 */
	public static void test1() {
		//5！-5的阶乘，5个乘阶
		//5*4*3*2*1
		
		int r = 1;//结果
		for(int i=1;i<=5;i++){
			r = r * i;
			/**
			 * i = 1 ; r = 1*1
			 * i = 2 ; r = 1* 1 * 2
			 * i = 3 ; r = 1* 1 * 2 * 3
			 * .....
			 */
		}
		System.out.println("r=" + r);
	}
}
