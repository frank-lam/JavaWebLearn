package lesson12;

public class Demo01 {

	public static void main(String[] args) {
/*		1.final,finally��finalize������
		final����������,���ܱ��̳�;���η���,���ܱ���д;���α���,ֻ�ܸ�ֵһ��
		
		finally��try����е�һ�������,���ܵ���ʹ��,�����ͷ���Դ
		
		finalize��һ������,������������ȷ�������ڶԸö���ĸ�������ʱ���ɶ�����������������ô˷�����*/
	
		//1.final��
/*		String s;
		Integer i;*/
		
		//2.finallyһ��Ҫ��try���һ��ʹ��
/*		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}*/
		
		for(int i = 0;i<10;i++){
			Person p1 = new Person();
			Person p2 = p1;
			System.gc();//��������
		}
	}
}

class Person{
	
	//��������ڴ����ͷ�ʱ�����
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("������ڴ��ͷ�...");
	}
}
