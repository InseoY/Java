package sub2;
/*
 * 날짜: 2019/10/16
 * 이름: 양인서
 * 내용: 자바 클래스 실습하기
 */

public class ClassTest {
	
	public static void main(String[] args) {
		
		// 국민은행 객체생성 및 초기화
		Account kb = new Account("국민은행", "121-11-1234", "김유신", 10000);
		
		
		// 기능활용
		kb.deposit(20000); //입금
		kb.withdraw(5000); //출금
		// kb.money -= 1; // 취약코드 허용안함 -> 맴버변수의 캡슐화(private)를 통한 취약코드 예방
		kb.info();
					
		// 우리은행 객체생성 및 초기화
		Account wr = new Account("우리은행", "35-88-1236", "강감찬", 5000);
		
		
		// 기능활용
		wr.deposit(4000);
		wr.withdraw(8000);
		wr.info();
		
		// 컴퓨터 객체생성
		Computer samsung = new Computer("INTEL i7", "8GB", "1TB");
		Computer imac 	 = new Computer("INTEL i7", "4GB", "512GB");
		
		samsung.info();
		samsung.calc();
		samsung.internet();
		
		imac.info();
		imac.calc();
		imac.internet();
		
	}	

}
