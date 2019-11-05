package sub2;
// 선생님 저장소: https://github.com/nsaedae.java
public class Person {
	
	protected String name;
	protected int age;
	
	// 생성자
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void hello() {
		System.out.println(name+ " 입니다.");
		System.out.println(age+ "살 입니다.");
		
	}

}
