package sub6;

/*
 * ��¥: 2019/10/21
 * �̸�: ���μ�
 * ����: �߻�Ŭ���� �ǽ��ϱ� ���� p329
 */
public class AbstractTest {
	
	public static void main(String[] args) {
		
		// Unit unit = new Unit(); ->�߻�Ŭ������ ��ü���� �ȵ�
		
		Unit u1 = new Marin();
		Unit u2 = new Zealot();
		Unit u3 = new Zergling();
		
		u1.move();
		u1.attack();
		u1.Special();
		
		u2.move();
		u2.attack();
		u2.Special();
		
		u3.move();
		u3.attack();
		u3.Special();
	}

}
