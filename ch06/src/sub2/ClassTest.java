package sub2;
/*
 * ��¥: 2019/10/16
 * �̸�: ���μ�
 * ����: �ڹ� Ŭ���� �ǽ��ϱ�
 */

public class ClassTest {
	
	public static void main(String[] args) {
		
		// �������� ��ü���� �� �ʱ�ȭ
		Account kb = new Account("��������", "121-11-1234", "������", 10000);
		
		
		// ���Ȱ��
		kb.deposit(20000); //�Ա�
		kb.withdraw(5000); //���
		// kb.money -= 1; // ����ڵ� ������ -> �ɹ������� ĸ��ȭ(private)�� ���� ����ڵ� ����
		kb.info();
					
		// �츮���� ��ü���� �� �ʱ�ȭ
		Account wr = new Account("�츮����", "35-88-1236", "������", 5000);
		
		
		// ���Ȱ��
		wr.deposit(4000);
		wr.withdraw(8000);
		wr.info();
		
		// ��ǻ�� ��ü����
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
