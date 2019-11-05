package sub4;
/*
 * 날짜: 2019/10/21
 * 이름: 양인서
 * 내용: 다형성(Polymorphism) 실습하기 교재 p305
 */

public class PolyTest2 {
	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		Shark s = new Shark();
		
		// 객체배열 같은 타입배열이여야 함
		Animal objs[] = {t, e, s};
		
		objs[0].move();
		objs[0].hunt();
		
		objs[1].move();
		objs[1].hunt();
		
		objs[2].move();
		objs[2].hunt();
		
		// 다형성을 이용한 메서드의 매개변수
		move(t);
		move(e);
		move(s);
	}
	
	public static void move(Animal a) {
		a.move();
	}
		

}
