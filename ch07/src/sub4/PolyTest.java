package sub4;

/*
 * ��¥: 2019/10/21
 * �̸�: ���μ�
 * ����: ������(Polymorphism) �ǽ��ϱ� ���� p305
 */

public class PolyTest {
	
	public static void main(String[] args) {
		
		//������ - ��ü�� ����Ÿ���� �θ�Ŭ���� �����ϴ� ��(���� ����� �θ�� ���ѵ�) ����ó�� Tiger. t ->���ϸ� �θ�+�ڽ� ��� ����
		// �������� ���� �ڵ带 �����ϰ� ����� ����
		Animal t = new Tiger(); // ���ʿ� �θ�Ÿ�� �ᵵ��
		Animal e = new Eagle();
		Animal s = new Shark();
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
	}
}
