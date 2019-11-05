package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {

public static void main(String[] args) throws Exception {
		
		// DB정보
		String host = "jdbc:mysql://192.168.44.9:3306/yis";
		String user = "yis";
		String pass = "1234";
			//Connection conn = null;
		
			//try문
		// 1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
			
			// conn = 이하같음
		// 3단계 - SQL 실행객체 생성
		Statement stmt = conn.createStatement();
		
		// 4단계 - SQL 실행
		String sql = "DELETE FROM `USER2` WHERE `uid`='B101';";  //stmt.executeUpdate("DELETE FROM `USER2` WHERE `uid`='B101';"); ->try일때..
		
		stmt.executeUpdate(sql);	//try일때 이것만 쓰는듯
		
		// 5단계 - SELECT 결과셋 처리

			
		// 6단계 -  데이터베이스 종료
		conn.close();
		
			//catch 문
		System.out.println("DELETE 완료...");
	}
}
