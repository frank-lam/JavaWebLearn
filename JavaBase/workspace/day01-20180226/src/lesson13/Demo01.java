package lesson13;

public class Demo01 {

	public static void main(String[] args) {
		/*������ ��
		    ���catch������return��䣬����finally�Ĵ��뻹��ִ����?
		    ����ᣬ��������returnǰ����return��?
		  �𣺻�ִ�У�finally�Ĵ�����return֮ǰִ��
		    */
		int r = getDiv(10, 0);
		System.out.println("r=" + r);
	}
	
	//���� a/b�Ľ��
	public static int getDiv(int a,int b){
		int i = 0;
		try {
			i = a / b;
			return i;
		} catch (ArithmeticException e) {
			System.out.println("�����쳣-��������Ϊ0");
			i = -1;
			return i;
		}finally {
			System.out.println("final����ִ����...");
			//��ò�Ҫ��finallyдreturn���룬����дûʲô����
		/*	i = -2;
			return i;*/
		}
		
	}
}
