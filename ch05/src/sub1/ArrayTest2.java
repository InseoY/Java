package sub1;

/*
 * ��¥: 2019/10/15
 * �̸�: ���μ�
 * ����: ������ �迭 �ǽ��ϱ�
 */
public class ArrayTest2 {
	
	public static void main(String[] args) {
		
		// 1���� �迭
		int[] score = {80, 60, 78, 69, 87, 92};  //�迭�� ����= length =����
		
		int sum = 0;
		
		for(int i=0; i<6; i++) {
		sum += score[i];
	  }
		System.out.println("������ ����: "+sum);
		System.out.println("������ ���: "+sum/6); // =sum/score.length
		
		// �迭�� �ݺ��� -> �ݺ��Ҷ����� 10...20....30..���� ����
		int jumsu[] = {10, 20, 30, 40, 50, 60};
		int total = 0;
		
		for(int n : jumsu) {
			total += n;
		}
			System.out.println("sumsu�� �� : "+total);
		
		// 2���� �迭(���)
		int arr[][] = {{1, 2, 3},         //012 (�ε�����ȣ)
					   {4, 5, 6},         //1
					   {7, 8, 9},         //2
					   {10, 11, 12}};	  //3
		    // ��  ��
		
		System.out.println("arr[0][0] = "+arr[0][0]);
		System.out.println("arr[0][1] = "+arr[0][1]);
		System.out.println("arr[0][2] = "+arr[0][2]);
		
		System.out.println("arr[1][0] = "+arr[1][0]);
		System.out.println("arr[1][1] = "+arr[1][1]);
		System.out.println("arr[1][2] = "+arr[1][2]);
		
		System.out.println("arr[2][0] = "+arr[2][0]);
		System.out.println("arr[2][1] = "+arr[2][1]);
		System.out.println("arr[2][2] = "+arr[2][2]);
		
		System.out.println("arr[3][0] = "+arr[3][0]);
		System.out.println("arr[3][1] = "+arr[3][1]);
		System.out.println("arr[3][2] = "+arr[3][2]);
		
		for(int i=0; i<4; i++) {
			for(int x=0; x<3; x++) {
				System.out.println("arr["+i+"]["+x+"] ="+arr[i][x]);
				
			}
		}
		

			
	}
}
