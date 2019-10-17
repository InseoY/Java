package sub1;

/*
 * 날짜: 2019/10/15
 * 이름: 양인서
 * 내용: 다차원 배열 실습하기
 */
public class ArrayTest2 {
	
	public static void main(String[] args) {
		
		// 1차원 배열
		int[] score = {80, 60, 78, 69, 87, 92};  //배열의 길이= length =갯수
		
		int sum = 0;
		
		for(int i=0; i<6; i++) {
		sum += score[i];
	  }
		System.out.println("점수의 총합: "+sum);
		System.out.println("점수의 평균: "+sum/6); // =sum/score.length
		
		// 배열의 반복문 -> 반복할때마다 10...20....30..으로 더함
		int jumsu[] = {10, 20, 30, 40, 50, 60};
		int total = 0;
		
		for(int n : jumsu) {
			total += n;
		}
			System.out.println("sumsu의 합 : "+total);
		
		// 2차원 배열(행렬)
		int arr[][] = {{1, 2, 3},         //012 (인덱스번호)
					   {4, 5, 6},         //1
					   {7, 8, 9},         //2
					   {10, 11, 12}};	  //3
		    // 행  열
		
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
