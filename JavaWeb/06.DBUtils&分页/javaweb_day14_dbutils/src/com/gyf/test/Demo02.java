package com.gyf.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.KeyedHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.gyf.domain.Account;
import com.gyf.utils.C3P0Utils;


public class Demo02 {
	/**
	 * ��ѯ����һ
	 * @throws SQLException
	 */
	@Test
	public void test1() throws SQLException{
		//1.������ѯ����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		
		//2.�ʺ�ȡ1����¼���Ѹ�����¼��ÿ��ֵ��װ��һ��������Object[]
		Object[] objs =  qr.query("SELECT * FROM account where id = 1", new ArrayHandler());
		
		for(Object o : objs){
			System.out.println(o);
		}
	}
	
	@Test
	public void test2() throws SQLException{
		//1.������ѯ����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		
		//2.�ʺ�ȡ������¼����ÿ����¼��ÿ��ֵ��װ��һ��������Object[]���������װ��һ��List��
		List<Object[]> list =  qr.query("SELECT * FROM account", new ArrayListHandler());
		
		for(Object[] columns : list){
			System.out.println("---------------");
			for(Object o : columns){
				System.out.println(o);
			}
		}
	}
	
	
	@Test
	public void test3() throws SQLException{
		//1.������ѯ����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		
		//2.ĳһ�е����ݡ���װ��List�С�
		List<Object> list =  qr.query("SELECT * FROM account", new ColumnListHandler(2));
		
		for(Object o : list){
			System.out.println(o);
		}
	}
	//
	@Test
	public void test4() throws SQLException{
		//1.������ѯ����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		
		//2.ȡ������¼��ÿһ����¼��װ��һ��Map�У��ٰ����Map��װ������һ��Map�У�keyΪָ�����ֶ�ֵ��
		 Map<Object, Map<String, Object>>  map = qr.query("SELECT * FROM account", new KeyedHandler("name"));
		
		 for(Entry<Object, Map<String, Object>> entry : map.entrySet()){
			 System.out.println(entry.getKey());
			 for(Entry<String, Object> item : entry.getValue().entrySet()){
				 System.out.println(item.getKey() + "---" + item.getValue());
			 }
			 System.out.println("---------------------");
		 }
	}
	
	@Test
	public void test5() throws SQLException{
		//1.������ѯ����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		
		//2.�ʺ�ȡ1����¼���ѵ�ǰ��¼����������ֵ�ŵ�һ��Map��
		Map<String, Object> map = qr.query("SELECT * FROM account where id = 2", new MapHandler());
		
		for(Entry<String, Object> entry : map.entrySet()){
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
	
	@Test
	public void test6() throws SQLException{
		//1.������ѯ����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		
		//2.�ʺ�ȡ������¼����ÿ����¼��װ��һ��Map�У��ٰ�Map��װ��List��
		List<Map<String, Object>> list = qr.query("SELECT * FROM account", new MapListHandler());
		
		for(Map<String, Object> map : list){
			for(Entry<String, Object> entry : map.entrySet()){
				System.out.println(entry.getKey() + "-" + entry.getValue());
			}
			System.out.println("---------------");
		}
		
	}
	
	@Test
	public void test7() throws SQLException{
		//1.������ѯ����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		
		//2.�ʺ�ȡ���е�������
		Object o = qr.query("SELECT count(*) FROM account", new ScalarHandler());
		
		System.out.println(o);
	}
	
	@Test
	public void test8() throws SQLException{
		//1.������ѯ����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		
		//2.�ʺ�ȡ���ж�������
		Account a = qr.query("SELECT * FROM account where id = 1", new BeanHandler<>(Account.class));
		
		System.out.println(a);
	}
	
	@Test
	public void test9() throws SQLException{
		//1.������ѯ����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		
		//2.�ʺ�ȡ���ж�������
		List<Account> list = qr.query("SELECT * FROM account", new BeanListHandler<>(Account.class));
		
		System.out.println(list);
	}
}
