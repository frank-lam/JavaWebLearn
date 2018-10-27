package com.gyf.test;

import java.sql.Connection;
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

import com.gyf.dao.impl.AccountDaoImpl;
import com.gyf.domain.Account;
import com.gyf.service.IAccountService;
import com.gyf.service.impl.AccountServiceImpl;
import com.gyf.utils.C3P0Utils;


public class Demo04 {
	/**
	 * ת��һ
	 */
	@Test
	public void test1() throws Exception{
		//��ǰ�����̣߳��൱�����߳���Key,Connection��Value
		ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
		tl.set(C3P0Utils.getConnection());
		System.out.println(tl.get());
		
		new Thread(){
			public void run() {
				//�������̣߳����ܻ�ȡ���̴߳��connection
				System.out.println(tl.get());
			};
		}.start();
	}
}
