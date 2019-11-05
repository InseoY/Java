package sub2;
/*
 * 날짜 : 2019/10/22
 * 이름 : 양인서
 * 내용 : 익명 클래스 실습하기 교재 p404
 */
public class AnonyObjectTest {
	
	public static void main(String[] args) {
		
		//익명객체 - 인터페이스를 클래스 구현없이(implements) new 연상으로 정의한 형태
		Person p = new Person() {
			
			@Override
			public void info() {
				System.out.println("Person info...");
				
			}
			
			@Override
			public void hello() {
				System.out.println("Person hello...");
				
			}
		};
		
		p.info();
		p.hello();
	}

}
