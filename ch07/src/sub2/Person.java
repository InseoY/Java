package sub2;
// ������ �����: https://github.com/nsaedae.java
public class Person {
	
	protected String name;
	protected int age;
	
	// ������
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void hello() {
		System.out.println(name+ " �Դϴ�.");
		System.out.println(age+ "�� �Դϴ�.");
		
	}

}