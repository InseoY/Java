package sub1;
/*
 * ��¥ : 2019/10/28
 * �̸� : ���μ�
 * ���� : ������(Thread) �ǽ��ϱ� ���� p576
 */
public class ThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("����1");
		SubThread sub2 = new SubThread("����2");
		
		sub1.start(); // start -> �񵿱���(���� ����)
		sub2.start();
		
		for(int i=1; i<=10; i++) {
			
			Thread.sleep(1000);  //1�ʸ��� ����
			
			System.out.println("���� ������ ����...");
		}
		
		System.out.println("���� ������ ����...");
	}

}
