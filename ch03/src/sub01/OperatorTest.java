package sub01;
public class OperatorTest {

	public static void main(String[] args) {
	
		// 증감 감소
		num1++;
		++num1;
		num2--;
		--num2;
		
		// 복합대입연산자
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;
		
		n1 += 1; // n1 = n1 + 1 (자기 자신과 계산)
		n2 -= 2; // n2 = n2 - 2
		n3 *= 3; // n3 = n3 * 3
		n4 /= 4; // n4 = n4 / 4
		
		System.out.println("n1 :"+n1);
		System.out.println("n2 :"+n2);
		System.out.println("n3 :"+n3);
		System.out.println("n4 :"+n4);
		
		// 비교연산자
		int var1 = 1;
		int var2 = 2;
		
		boolean r1 = (var1  > var2); // var1이 var2보다 크다.
		boolean r2 = (var1  < var2); // var1이 var2보다 작다.
		boolean r3 = (var1 >= var2); // var1이 var2보다 크거나 같다.
		boolean r4 = (var1 <= var2); // var1이 var2보다 작거나 같다
		boolean r5 = (var1 == var2); // var1과 var2가 서로 같다.
		boolean r6 = (var1 != var2); // var1과 var2가 서로 다르다.
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		System.out.println("r5 : "+r5);
		System.out.println("r6 : "+r6);
		
		// 논리연산자
		boolean res1 = (var1 > 1) && (var2 > 3); // var1이 1보다 크고 그리고 var2가 3보다 작다.
		boolean res2 = (var1 > 0) && (var2 <= 2); // var1이 0보다 크고 그리고 var2가 2보다 작거나 같다.
		boolean res3 = (var1 > 0) || (var2 > 3); // var1이 0보다 크고 또는 var2는 3보다 크다.
		boolean res4 = (var1 < 0) || (var2 > 3); // var1이 0보다 작고 또는 var2는 3보다 크다.
		boolean res5 = !(var1 > var2); // var1이 var2보다 크지 않다.(!는 not의미)
		
		System.out.println("res1 :"+res1);
		System.out.println("res2 :"+res2);
		System.out.println("res3 :"+res3);
		System.out.println("res4 :"+res4);
		System.out.println("res5 :"+res5);
		
		
		
	}
}
