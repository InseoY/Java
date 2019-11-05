package sub1;
/*
 * 날짜 : 2019/10/23
 * 이름 : 양인서
 * 내용: 자바 내장클래스 Object 실습하기 교재 p457
 */
public class ObjectTest {
	
	public static void main(String[] args) {
		
		Apple a1 = new Apple("한국", 2000);
		Apple a2 = new Apple("일본", 1000);
		Banana b1 = new Banana("대만", 2500);
		Banana b2 = new Banana("제주", 3500);
		
		// 다형성에 활용되는 Object 클래스 []<- 인덱스번호(0부터 시작)
		Object fruit[] = {a1, a2, b1, b2};
		
		// 사과, 바나나로 다운캐스팅
		Apple f1 = (Apple)fruit[0];
		Banana f2 = (Banana)fruit[2];
		
		f1.info();
		f2.info();
	}

}
