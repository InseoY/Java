package sub1;

/*
 * 날짜: 2019/10/15
 * 이름: 양인서
 * 내용: 오버로드 메서드(함수) 실습하기 교재 p214
 */

public class MethodOverload {
	public static void main(String[] args) {
		overload(1);
		overload(1, 9);
		overload("김유신");
		overload(false);
		
	}
	
	// overload 메서드: 메서드 이름이 똑같지만 매개변수로 구분하는 메서드
	public static void overload(int a) {
		System.out.println("첫번째 오버로드 메서드 실행...");
	}
	public static void overload(int a, int b) {
		System.out.println("두번째 오버로드 메서드 실행...");
	}
	public static void overload(String name) {
		System.out.println("세번째 오버로드 메서드 실행...");
	}
	public static void overload(boolean isOk) {
		System.out.println("네번째 오버로드 메서드 실행...");
	}

}
