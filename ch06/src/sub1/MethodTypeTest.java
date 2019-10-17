package sub1;

/*
 * 날짜: 2019/10/15
 * 이름: 양인서
 * 내용: 메서드 타입 실습하기
 */
public class MethodTypeTest {
	
	public static void main(String[] args) {
		
		int rs1 = type1(2, 4);
		System.out.println("rs1 : "+rs1);
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		type2(arr); // 오류
		
		double rs2 = type3() * 5 * 5;
		System.out.println("반지름이 5인 원의 넓이: "+rs2);
		
		type4(); //리턴할게 없음 (위에서 부터 타입1,2,3,4)
		
		// 구구단 함수 실행
	
		gugudan(2);
		gugudan(5);
		gugudan(7);
		
		
	}
	
	// 구구단 함수 정의
	public static void gugudan(int n) {
		System.out.println(n+"단");
		for(int i=1; i<=9; i++) {
			System.out.println(n+"x "+i+"="+n*i);
		}
		
	}
	
	
	// 타입1 - 매개변수o, 리턴값o
	public static int type1(int a, int b) {
		int c = a + b;
		return c;
	}
	
	// 타입2 - 매개변수o, 리턴값x (return이 없으면 void 그대로둠)
	public static void type2(int[] score) {
		int sum = 0;
		for(int s : score) {
			sum += s;
		}
		System.out.println("배열의 합: "+sum);
	}
	
	// 타입3 - 매개변수x, 리턴값o (void자리-> 소수점 더블, true면 boolean)
	public static double type3() {
		return 3.14;
	}
	
	// 타입4 - 매개변수x, 리턴값x
	public static void type4() {
		int result = type1(3, 7);
		System.out.println("type4의 result: "+result);
	}
	
	
}
