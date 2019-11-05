package sub3;
/*
 * ��¥ : 2019/10/28
 * �̸� : ���μ�
 * ���� : ������(Thread) �ǽ��ϱ� ���� p576
 */
public class SumThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
	
		SubThread st1 = new SubThread(1, 50);
		SubThread st2 = new SubThread(51, 100);
		
		Thread t1 = new Thread(st1); //Runnable���� ����������
		Thread t2 = new Thread(st2); 
		
		t1.start(); 
		t2.start();
		
		t1.join();
		t2.join();
		
		int rs1 = st1.getNum();
		int rs2 = st2.getNum();
		int tot = rs1 + rs2;
		
		System.out.println("���: "+tot); //1~100���� ��
	}
}