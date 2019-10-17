package sub2;

/*
 * 날짜 : 2019/10/14
 * 이름: 양인서
 * 내용: While문 실습하기
 */
public class WhileTest {
	public static void main(String[] args) {
		
		// 1부터 10까지 합 // while(조건식)
		int k = 1;
		int sum = 0;
		
		while(k <= 10) {
			sum += k;
			k++;
			
		}
		System.out.println("1부터 10까지 합: "+sum);
		
		// do ~ while : 무조건 최초 1번은 박복을 시작하는 반복문
		int total = 0;
		int i = 1;
		
		do { //한번은 무조건 실행하라
			if(i%2 == 1) {
				total += i;
			}
			
			i++;
		}while(i<=10);
		
		System.out.println("1부터 10까지 홀수 합 :" +total);
		
		// break
		int num = 0;
		
		while(true) {
			num++;
			
			if(num%5 == 0 && num%7 == 0) {
				break; // 반복문 종료
			}
			
		}
		System.out.println("5와 7의 최소공배수 :" +num);
		
		// continue 다시 상단으로 올라가서 반복
		int tot = 0;
		
		for(int a=1 ; a<=10 ; a++) {
			
			if(a%2 == 0) {
				continue; // 반복문의 상위로 이동
			}
			
			tot += a;
			
		}
		System.out.println("1부터 10까지 홀수합 :"+tot);
		
	}

}
