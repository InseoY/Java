package sub3;

/*
 * 날짜: 2019/10/16
 * 이름: 양인서
 * 내용: 클래스 메모리 생성 실습하기                                                      
 */
public class AddTest {

	public static void main(String[] args) {
		
		Adder ad1 = new Adder();
		ad1.x = 100;
		
		int[] arr = {10, 20, 30}; // 배열은 heap 객체에 생성
		
		ad1.add(100);
		System.out.println("ad.x = "+ad1.x);
		
		ad1.add(ad1);
		System.out.println("ad.x = "+ad1.x);
		
		ad1.add(arr);
		System.out.println("arr[0] = "+arr[0]);
		
		ad1 = ad1.addNew(ad1);
		System.out.println("ad1.x = "+ad1.x);
		
		
		
	}
}
