package sub2;
/*
 * 날짜: 2019/10/17
 * 이름: 양인서
 * 내용: 클래스 상속 실습하기
 */

public class InheritTest {
	
	public static void main(String[] args) {
		
		SalaryStudent ss1 = new SalaryStudent("김유신", 21, "부경대", "영문학", "삼성");
		SalaryStudent ss2 = new SalaryStudent("김춘추", 22, "부산대", "컴퓨터", "삼성");
		
		ss1.hello();
		ss2.hello();
	}

}
