package lesson17;

import java.util.Scanner;

/**
 * ʲôʱ�򷽷����治��Ҫдthrows
 *   ������throw���쳣���������һ������ʱ�쳣����������Ͳ���дthrows
 */
public class Demo01 {

	public static void main(String[] args)  {
		//�������Զ���һ����¼�쳣
		/**
		 * 1�����û��������벻��ȷʱ�׳���¼�쳣
		 * 2���û���admin,����Ϊ123
		 * 3���û������������û�ͨ����������
		 */
		
		//1.��ȡ�û���������û���������
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���:");
		String username = scanner.nextLine();
		
		System.out.println("���������룺");
		String password = scanner.nextLine();
		
		
		//2.�ж��û����������Ƿ���ȷ
		if("admin".equals(username) && "123".equals(password)){
			System.out.println("��¼�ɹ�");
		}else{
			//3.�׳���¼�쳣
			throw new LoginException("�û����������벻��ȷ");
		}
	}

}
