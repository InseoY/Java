package sub3;

/*
 * ��¥: 2019/10/21
 * �̸�: ���μ�
 * ����: �������̵� �޼��� �ǽ��ϱ� ���� 295
 */

public class OverrideTest {
	public static void main(String[] args) {
		
	BBB b =  new BBB();  // �ڽ��ʿ��� �����(�ڽ��� �θ���� ��� ��, �������̵�)
		
		b.method1();
		b.method2();
		b.method2(1); // -> ��� �����ε� �޼���
		b.method3();
		
		// final �ǽ�
		// -final ����: ���
		// -final �޼���: �������̵� ����
		// -final Ŭ����: ��ӱ���
		
		final int NUM = 1;
		final double PI = 3.04;
		// NUM = 2; final�� ���������� ��, �ٲܼ� ����. ����� ���� ���� �Ҽ� ����. ��� �� ���ڷ� ���
		
	}

}
