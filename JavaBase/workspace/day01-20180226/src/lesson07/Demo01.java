package lesson07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo01 {

	public static void main(String[] args) {
		/*Java�е��쳣����Ϊ�����ࣺ"����ʱ�쳣"��"����ʱ�쳣"��
		    �������쳣���������쳣������
		      >���е�RuntimeException�༰�������ʵ������Ϊ����ʱ�쳣
		      >�������쳣���Ǳ���ʱ�쳣
				
		    ����ʱ�쳣
		     Java���������ʾ�����������ͻᷢ�������޷�ͨ������
		
		   ����ʱ�쳣
		          ������ʾ����Ҳ���������ʱ�쳣һ������
		          ��������Խ��,��ָ�붼������ʱ�쳣*/
		
		
		//�ļ�������
		//FileInputStream fis = new FileInputStream("a.txt");
		
		try{
			FileInputStream fis = new FileInputStream("a.txt");
		}catch (FileNotFoundException e) {
			System.out.println("�ļ��Ҳ����쳣");
		}
		ArithmeticException ae;
		NullPointerException np;
		int a = 10 / 0;
		
	}
}
