package lesson02;

import java.util.Scanner;

import com.gyf.domain.User;
import com.gyf.service.UserService;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.�û�����
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û�����");
		String name = scanner.nextLine();
		System.out.println("����������:");
		String password = scanner.nextLine();
		
		//2.��ѯ�û�
		UserService service = new UserService();
		User user = service.findUser(name,password);
		if(user != null){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ�ܣ��û����������벻��ȷ");
		}
		
		scanner.close();
	}

}
