package sub4;
/*
 * 날짜 : 2019/10/23
 * 이름 : 양인서
 * 내용: 자바 Math클래스 실습하기 교재 p533
 */
public class MathTest {
	
	public static void main(String[] args) {
		
		//Math는 객체를 생성 할 수 없는 클래스
		//Math m = new Math(); -> x
		
		System.out.println("PI : "+Math.PI); //파이값
		System.out.println("절대값 : "+Math.abs(-5));
		System.out.println("절대값 : "+Math.abs(-3.14));
		System.out.println("제곱근 : "+Math.sqrt(9)); //9에다 루트씌움
		System.out.println("올림값 : "+Math.ceil(1.2)); 
		System.out.println("올림값 : "+Math.ceil(1.8)); 
		System.out.println("내림값 : "+Math.floor(1.8)); 
		System.out.println("내림값 : "+Math.floor(1.1)); 
		System.out.println("반올림 : "+Math.round(1.1)); 
		System.out.println("내림값 : "+Math.round(1.5)); 
		
		// random
		double num1 = Math.random();
		System.out.println("num1 : "+num1); // 0~1사이 실수
		
		double num2 = num1 * 10;
		System.out.println("num2 : "+num2); // 0~10사이 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : "+num3); // 1~10사이 정수
		
		double num4 = Math.ceil(Math.random() * 45); //1~45 정수
		System.out.println("num4 : "+num4);
	}

}
