package sub2;
/*
 * 날짜 : 2019/10/23
 * 이름 : 양인서
 * 내용: 자바 내장클래스 String 실습하기 교재 p496
 */
public class StringTest {
	
	public static void main(String[] args) {
		
		//문자열 = 문자 + 배열
		String s = "Hello";
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		
		//문자열 객체생성
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello"; //리터럴 선언(약식으로 아래처럼 쓴다)
		String str4 = "Hello";
		
		//문자열 참조값 비교
		if(str1 == str2) {
			System.out.println("str1과 str2의 참조값(주소값)이 같다.");
		}else {
			System.out.println("str1과 str2의 참조값(주소값)이 다르다.");
		}
		
		if(str3 == str4) {
			System.out.println("str3과 str4의 참조값(주소값)이 같다."); //같은 개체 참조(리터럴 선언을 했기때문에)
		}else {
			System.out.println("str3과 str4의 참조값(주소값)이 다르다.");
		}
		
		//문자열 비교(str1~4 모두같음)
		if(str1.equals(str2)) {
			System.out.println("str1과 str2의 참조값(주소값)이 같다.");
		}else {
			System.out.println("str1과 str2의 참조값(주소값)이 다르다.");
		}
	}

}
