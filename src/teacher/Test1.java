package teacher;

import java.lang.reflect.Method;
/**
 * ������ͨ��public����   , ���Դ���������޲���
 * @author Administrator
 *
 */
public class Test1 {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("C������÷���.Person");
			
			//��������޲�������
			Method method = c.getMethod("sayHanYu");// �õ�ĳ�������Ķ���	
			method.invoke(c.newInstance()); //����invoke() ִ�з���  ,����1��ʾ�ĸ���,
			

			//��������в�������
			Method method4 = c.getMethod("sayHello", String.class,int.class);
			method4.invoke(c.newInstance(), "����һ",30); //����Ҫ�������Ӧ��
			
			
			//��������޲�������  ����Ȩ����privateʱ
//			Method method2 = c.getMethod("sayMinZu");//��ȡ����������й��з�������Ͱ������������public�������ʹӻ���̳еġ��ӽӿ�ʵ�ֵ�����public����
//			Method method3 = c.getDeclaredMethod("sayMinZu");//��ȡ�������������������з���������public��protected��private����
//			method2.invoke(c.newInstance());//��ΪsayMinZu��˽�з������ܶ������,���Ե�16�л��׳��쳣NoSuchMethodException
//			method3.invoke(c.newInstance());//��ΪsayMinZu��˽�з������ܶ������,���Ե�19�л��׳��쳣IllegalAccessException(��ȫȨ���쳣)
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
