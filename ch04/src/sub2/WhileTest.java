package sub2;

/*
 * ��¥ : 2019/10/14
 * �̸�: ���μ�
 * ����: While�� �ǽ��ϱ�
 */
public class WhileTest {
	public static void main(String[] args) {
		
		// 1���� 10���� �� // while(���ǽ�)
		int k = 1;
		int sum = 0;
		
		while(k <= 10) {
			sum += k;
			k++;
			
		}
		System.out.println("1���� 10���� ��: "+sum);
		
		// do ~ while : ������ ���� 1���� �ں��� �����ϴ� �ݺ���
		int total = 0;
		int i = 1;
		
		do { //�ѹ��� ������ �����϶�
			if(i%2 == 1) {
				total += i;
			}
			
			i++;
		}while(i<=10);
		
		System.out.println("1���� 10���� Ȧ�� �� :" +total);
		
		// break
		int num = 0;
		
		while(true) {
			num++;
			
			if(num%5 == 0 && num%7 == 0) {
				break; // �ݺ��� ����
			}
			
		}
		System.out.println("5�� 7�� �ּҰ���� :" +num);
		
		// continue �ٽ� ������� �ö󰡼� �ݺ�
		int tot = 0;
		
		for(int a=1 ; a<=10 ; a++) {
			
			if(a%2 == 0) {
				continue; // �ݺ����� ������ �̵�
			}
			
			tot += a;
			
		}
		System.out.println("1���� 10���� Ȧ���� :"+tot);
		
	}

}