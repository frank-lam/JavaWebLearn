package lesson03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//回顾以前说过的线程安全问题 [看源码讲解]
/*		Vector,StringBuffer,Hashtable 
 * 
 * 		//1.面试题：Vector和ArrayList有什么区别 
		  Vector是线程安全的,ArrayList是线程不安全的 
		  Vector的方法声明了synchronized
		
		//2.StringBuffer和StringBuilder有什么区别？
		StringBuffer是线程安全的,StringBuilder是线程不安全的 
		
		//3.Hashtable和HashMap的区别
		Hashtable是线程安全的,HashMap是线程不安全的*/

		Vector v;
		ArrayList al;
		StringBuffer sb;
		StringBuilder sb1;
		Hashtable ht;
		HashMap hm;
		Collections cs;//集合工具类
	}

}
