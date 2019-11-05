package sub5;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 날짜 : 2019/10/23
 * 이름 : 양인서
 * 내용: 자바 Date클래스 실습하기 교재 p538
 */
public class DateTest {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println("d :"+d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("오늘은yyyy/MM/dd HH:mm:ss 입니다.");
		String now = sdf.format(d);
		
		System.out.println(now);
	}

}
