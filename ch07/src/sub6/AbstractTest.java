package sub6;

/*
 * 날짜: 2019/10/21
 * 이름: 양인서
 * 내용: 추상클래스 실습하기 교재 p329
 */
public class AbstractTest {
	
	public static void main(String[] args) {
		
		// Unit unit = new Unit(); ->추상클래스는 객체생성 안됨
		
		Unit u1 = new Marin();
		Unit u2 = new Zealot();
		Unit u3 = new Zergling();
		
		u1.move();
		u1.attack();
		u1.Special();
		
		u2.move();
		u2.attack();
		u2.Special();
		
		u3.move();
		u3.attack();
		u3.Special();
	}

}
