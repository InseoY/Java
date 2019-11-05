package sub2;
/*
 * 날짜 : 2019/10/28
 * 이름 : 양인서
 * 내용 : 쓰레드(Thread) 실습하기 교재 p576
 */
public class CountThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start(); //각각(ct1~3) 1000번 카운터 할 동안 메인쓰레드는 끝내버림.(값이 불일정) run은쓰레드 아닌듯..(?)
		ct2.start();
		ct3.start();
		
		// 서브쓰레드가 메인쓰레드로 다시 합류되기까지 메인쓰레드 대기
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("결과: "+count.getNum());
	}
}
