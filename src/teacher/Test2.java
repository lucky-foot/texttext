package teacher;

import java.lang.reflect.Method;
/**
 * ����get   set  ���ַ���  ,ר�����ڶ����ԵĶ�д����  
 * 
 * @author Administrator
 *
 */
public class Test2 {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("C������÷���.Person");
			
			Object o = c.newInstance();
			
			setter(o,"name","������",String.class);
			setter(o,"age",123,int.class);
			
			
			System.out.println("�ղŸ�ֵ�Ķ�����:"+getter(o,"name")+" "+getter(o,"age"));
			
			o.toString();
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param o Ҫ�����Ķ���
	 * @param attr Ҫ��������������
	 * @param value Ҫ���õ�����
	 * @param type Ҫ���õ���������
	 */
	public static void setter(Object o , String attr , Object value, Class<?> type){
		try {
			Method method = o.getClass().getMethod("set"+initStr(attr), type);
			method.invoke(o, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Object getter(Object o , String attr){
		try {
			Method method = o.getClass().getMethod("get"+initStr(attr));
			Object invoke = method.invoke(o);
			return invoke;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static String initStr(String attr){
		String s = attr.substring(0,1).toUpperCase()+attr.substring(1);
		return s;
	}
}
