package teacher;

interface ����{
	public static final String NATIONAL="�л����񹲺͹�";
	
	public static final String SHOUDU = "����";
	
	public void sayHanYu();
	
	public void sayHello(String name , int age);
}

class MinZu{
	private void sayMinZu(){
		System.out.println("���Ǻ���");
	}
}

public class Person extends MinZu implements ���� {
	private String name;
	private int age;
	
	
	
	public Person() {//�޲ι���
		super();
	}

	public Person(String name) {//һ����������
		super();
		this.name = name;
	}

	public Person(String name, int age) {//2����������
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	@Override
	public void sayHanYu() {
		System.out.println("��Һ�,����:"+NATIONAL+"����,�׶���:"+SHOUDU);
		
	}


	@Override
	public void sayHello(String name, int age) {
		System.out.println("�ҵ����ֽ�"+name+",����:"+age+"��.");
		
	}
	
	
	private void sayMinZu(){
		System.out.println("�Ҳ�һ���Ǻ���");
	}
	
	
}
