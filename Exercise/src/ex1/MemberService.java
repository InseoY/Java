package ex1;
/*
 * 날짜 : 2019/10/25
 * 이름 : 양인서
 * 내용: 1번째 수행평가(MemberService)
 */
public class MemberService {
	public boolean login(String id, String password) {
		if(id=="hong" && password=="12345") {
			return true;
		}else {
			return false;
		}
	} 
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
		
}
