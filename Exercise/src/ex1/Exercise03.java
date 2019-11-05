package ex1;
/*
 * 날짜 : 2019/10/25
 * 이름 : 양인서
 * 내용: 1번째 수행평가(Exercise03)
 */
public class Exercise03 {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
			if(i%3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("3의 배수의 합: "+sum);
	}
}
