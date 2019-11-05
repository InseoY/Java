package sub4;

/*
 * 날짜: 2019/10/21
 * 이름: 양인서
 * 내용: 다형성(Polymorphism) 실습하기 교재 p305
 */

public class PolyTest {
	
	public static void main(String[] args) {
		
		//다형성 - 객체의 선언타입을 부모클래스 지정하는 것(참조 대상이 부모로 제한됨) 보통처럼 Tiger. t ->로하면 부모+자식 모두 참조
		// 다형성을 쓰면 코드를 유연하게 만들수 있음
		Animal t = new Tiger(); // 앞쪽에 부모타입 써도됨
		Animal e = new Eagle();
		Animal s = new Shark();
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
	}
}
