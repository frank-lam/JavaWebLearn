package lesson18;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		/*��ϰ:����������û���ֻ�ܰ���Ӣ���ַ�
			1.ʹ�ü��̻�ȡ�û�¼�����ݣ�ֻ�ܴ���Ӣ���ַ����������׳� �Ƿ��ַ� ���쳣
			2.�Ƿ��ַ� ���쳣��Ҫ�Զ���
			3.�쳣����Ϊ����ʱ�쳣*/
		
		//1.��ȡ�û�������
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���");
		String username = scanner.nextLine();
		
		//2.�ж��ַ��Ƿ�Ϸ�
		for(int i=0;i<username.length();i++){
			char ch = username.charAt(i);
			//Сд�ַ�
			boolean isSmall = (ch >= 'a' && ch <= 'z');
			
			//��д�ַ�������
			boolean isBig = (ch >= 'A' && ch <= 'Z');
			
			//��һ��д��
			/*if(isSmall || isBig){
				//System.out.println(ch + "�Ϸ��ַ�");
			}else{
				//System.out.println(ch + "���Ϸ��ַ�");
				throw new IllegalCharacterException("���Ϸ����ַ�:" + ch);
			}*/
			
			//�ڶ���д��
			if(!(isSmall || isBig)){//���Ϸ��ַ�
				throw new IllegalCharacterException("���Ϸ����ַ�:" + ch);
			}
		}
	}
}

//���� �Ƿ��ַ� ���쳣
class IllegalCharacterException extends RuntimeException{

	public IllegalCharacterException(String message) {
		super(message);//RuntimeException(String message)
	}
	
}