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
	 * 转账一
	 */
	@Test
	public void test1() throws Exception{
		//当前是主线程，相当于主线程是Key,Connection是Value
		ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
		tl.set(C3P0Utils.getConnection());
		System.out.println(tl.get());
		
		new Thread(){
			public void run() {
				//这是子线程，不能获取主线程存的connection
				System.out.println(tl.get());
			};
		}.start();
	}
}
