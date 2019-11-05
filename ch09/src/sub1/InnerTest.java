package sub1;

import sub1.Outer.Inner;

/*
 * 날짜 : 2019/10/22
 * 이름 : 양인서
 * 내용 : 중첩 클래스 실습하기 교재 p390 (클래스안에 클래스가 있는것)
 */
public class InnerTest {
	
	public static void main(String[] args) {
		
		Outer out = new Outer(1);
		out.info();
		
		Inner inn = out.new Inner(2); // 이너 일땐 <--이렇게 써줌
		inn.info();
		
	}

}
