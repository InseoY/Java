package sub1;

/*
 * ��¥: 2019/10/15
 * �̸�: ���μ�
 * ����: �޼��� Ÿ�� �ǽ��ϱ�
 */
public class MethodTypeTest {
	
	public static void main(String[] args) {
		
		int rs1 = type1(2, 4);
		System.out.println("rs1 : "+rs1);
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		type2(arr); // ����
		
		double rs2 = type3() * 5 * 5;
		System.out.println("�������� 5�� ���� ����: "+rs2);
		
		type4(); //�����Ұ� ���� (������ ���� Ÿ��1,2,3,4)
		
		// ������ �Լ� ����
	
		gugudan(2);
		gugudan(5);
		gugudan(7);
		
		
	}
	
	// ������ �Լ� ����
	public static void gugudan(int n) {
		System.out.println(n+"��");
		for(int i=1; i<=9; i++) {
			System.out.println(n+"x "+i+"="+n*i);
		}
		
	}
	
	
	// Ÿ��1 - �Ű�����o, ���ϰ�o
	public static int type1(int a, int b) {
		int c = a + b;
		return c;
	}
	
	// Ÿ��2 - �Ű�����o, ���ϰ�x (return�� ������ void �״�ε�)
	public static void type2(int[] score) {
		int sum = 0;
		for(int s : score) {
			sum += s;
		}
		System.out.println("�迭�� ��: "+sum);
	}
	
	// Ÿ��3 - �Ű�����x, ���ϰ�o (void�ڸ�-> �Ҽ��� ����, true�� boolean)
	public static double type3() {
		return 3.14;
	}
	
	// Ÿ��4 - �Ű�����x, ���ϰ�x
	public static void type4() {
		int result = type1(3, 7);
		System.out.println("type4�� result: "+result);
	}
	
	
}