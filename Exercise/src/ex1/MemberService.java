package ex1;
/*
 * ��¥ : 2019/10/25
 * �̸� : ���μ�
 * ����: 1��° ������(MemberService)
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
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
		
}
