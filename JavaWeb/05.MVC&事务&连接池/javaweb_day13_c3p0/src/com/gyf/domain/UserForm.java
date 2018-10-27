package com.gyf.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class UserForm {
	private String username;
	private String password;
	private String repassword;
	private String email;
	private String birthday;
	Map<String,String> err = new HashMap<String,String>();//�洢���Ĳ��Ϸ���Ϣ
	
	//У��
	public boolean validate(){
		if(username == null || "".equals(username.trim())){
			err.put("username", "�û�������Ϊ��");
		}else if(!password.matches("\\w{3,12}")){
			err.put("password", "�û���������3~12λ");
		}
		
		if(password == null || "".equals(password.trim())){
			err.put("password", "���벻��Ϊ��");
		}else if(!password.matches("\\d{6,12}")){
			err.put("password", "�������6~12������");
		}
		
		if(!password.equals(repassword)){
			err.put("repassword", "�������벻һ��");
		}
		
		if(!email.matches("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$")){
			err.put("email", "�����ʽ����ȷ��");
		}
		//���գ��������룬����yyyy-MM-dd�ĸ�ʽ<br>
		if("".equals(birthday)){
			err.put("birthday", "���ղ���Ϊ�գ�");
		}else {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				sdf.parse(birthday);
			} catch (ParseException e) {
				err.put("birthday", "���ո�ʽ����ȷ��");
			}
		}
		
		return !err.isEmpty();
	}
	
	public UserForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserForm(String username, String password, String email, String birthday) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.birthday = birthday;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Map<String, String> getErr() {
		return err;
	}

	public void setErr(Map<String, String> err) {
		this.err = err;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
}
