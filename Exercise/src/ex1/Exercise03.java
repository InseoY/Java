package ex1;
/*
 * ��¥ : 2019/10/25
 * �̸� : ���μ�
 * ����: 1��° ������(Exercise03)
 */
public class Exercise03 {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
			if(i%3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("3�� ����� ��: "+sum);
	}
}
