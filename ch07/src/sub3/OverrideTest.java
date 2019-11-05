package sub3;

/*
 * 날짜: 2019/10/21
 * 이름: 양인서
 * 내용: 오버라이드 메서드 실습하기 교재 295
 */

public class OverrideTest {
	public static void main(String[] args) {
		
	BBB b =  new BBB();  // 자식쪽에서 실행됨(자식이 부모것을 덮어서 씀, 오버라이드)
		
		b.method1();
		b.method2();
		b.method2(1); // -> 얘는 오버로드 메서드
		b.method3();
		
		// final 실습
		// -final 변수: 상수
		// -final 메서드: 오버라이드 금지
		// -final 클래스: 상속금지
		
		final int NUM = 1;
		final double PI = 3.04;
		// NUM = 2; final은 마지막변수 즉, 바꿀수 없다. 상수는 값을 대입 할수 없다. 계속 그 숫자로 사용
		
	}

}
