package lesson02;

import java.util.Random;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JVMĬ������δ����쳣��
		/*main�����յ��쳣ʱ,�������ִ���ʽ: 
			1.�Լ��������⴦��,Ȼ��������С�try-catch��
			2.�Լ�û����ԵĴ���ʽ,ֻ�н�������main��jvm������
		  
		  jvm��һ��Ĭ�ϵ��쳣�������,�ͽ����쳣���д���,
		  	�������쳣�����ơ��쳣����Ϣ���쳣���ֵ�λ�ô�ӡ���˿���̨��,ͬʱ����ֹͣ���С�

			 */
		
		//1.����Խ���쳣
		int[] arr = {2,3,4,5};
		System.out.println(arr[0]);
		//ArrayIndexOutOfBoundsException ����Խ���쳣
		//ArrayIndexOutOfBoundsException e;
		//System.out.println(arr[4]);//����Խ���쳣
		
		
		//2.��ָ���쳣
		//arr = null;
		//System.out.println(arr[0]);
		
		//3.����ת���쳣ClassCastException
//		Object s = "abc";
//		//Integer i = (Integer)s;
//		Random r = (Random)s;
		
		
		//һ����������쳣������Ĵ���Ͳ���ִ����
		System.out.println(".....");
	}

}
