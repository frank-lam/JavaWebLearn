package lesson15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo01 {

	public static void main(String[] args) {
		/*�쳣ע������
		1.������д���෽��ʱ������ķ��������׳���ͬ�ĸ����쳣
		2.�������д�ķ���û���쳣�׳�,��ô����ķ�����ò�Ҫ�׳��쳣
		3.������෽�������쳣����,��ô����ֻ��try,����throws*/

	}
}


class A{
	public void test(){
		
	}
}

class B extends A{
	@Override
	public void test() {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//�����쳣
class AgeException extends Exception{
	
}