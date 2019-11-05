package ex3;

/**
 * ��¥ : OOOO/OO/OO
 * �̸� : ��ö��
 * ���� : �˰����� �ǽ� - ���丮�� ���ϱ�
 * 
 * ���߰���
 *  factorial(5)
 * 		-> 5 x factorial(4)
 *			-> 4 x factorial(3)
 *				-> 3 x factorial(2)
 *					-> 2 x factorial(1)
 *						-> 1 
 *					-> 2 x 1
 *				-> 3 x 2 x 1
 *			-> 4 x 3 x 2 x 1
 *		-> 5 x 4 x 3 x 2 x 1 = 120 (�������)
 */
public class FactorialTest {

	public static void main(String[] args) {
		/*
			���丮�� - 1���� n���� ������ ���ڸ� ���ʷ� ���� ��
			1! = 1
			2! = 1 x 2 = 2
			3! = 1 x 2 x 3 = 6
			4! = 1 x 2 x 3 x 4 = 24
			5! = 1 x 2 x 3 x 4 x 5 = 120
			n! = 1 x 2 x 3 x ... x (n-1) x n
		 */
		int rs = factorial(5);
		System.out.println(rs);
	}

	// factorial �޼��� ����(��� �޼��� == recursive)
	public static int factorial(int n) {
		if(n ==1){
			return 1;
		}
		
		int result = n* factorial(n-1);
		return result;
	}

}