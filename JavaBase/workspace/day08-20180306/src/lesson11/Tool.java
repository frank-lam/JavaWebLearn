package lesson11;

import java.lang.reflect.Field;

public class Tool {

	/**
	 * 通过反射给属性赋值
	 * @param obj 需要赋值对象
	 * @param fieldName 属性名称
	 * @param fieldValue 属性值
	 */
	public static void setFieldValue(Object obj,String fieldName,Object fieldValue){
		
		try {
			//1.获取字节码
			Class clz = obj.getClass();
			
			//2.获取属性Field
			Field field = clz.getDeclaredField(fieldName);
			
			//3.设置权限
			field.setAccessible(true);
			
			//4.赋值属性
			field.set(obj, fieldValue);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
