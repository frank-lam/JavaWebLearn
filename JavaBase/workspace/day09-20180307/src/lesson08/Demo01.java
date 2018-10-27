package lesson08;

public class Demo01 {

	public static void main(String[] args) {
/*		校验qq号码. 
		1:要求必须是5-15位数字 
		2:0不能开头 
		3:必须都是数字*/
		
		String qq = "10a101";
		
		//1:要求必须是5-15位数字 
		if(qq.length() >=5 && qq.length() <= 15){
			System.out.println("qq号的长度正确 ");
			
			//2: 0不能开头 
			if(!qq.startsWith("0")){
				
				//3.字符中是否有非数字字符
				for(int i=0;i<qq.length();i++){
					char ch = qq.charAt(i);
					if( !(ch >= '0' && ch <= '9')){
						System.out.println("不合法字符:" + ch);
					}
				}
				
			}else{
				System.out.println("qq号不能以0开头");
			}
		}else{
			System.out.println("qq号码的长度不正确");
		}
		

	}
}