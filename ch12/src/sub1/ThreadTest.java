package sub1;
/*
 * 날짜 : 2019/10/28
 * 이름 : 양인서
 * 내용 : 쓰레드(Thread) 실습하기 교재 p576
 */
public class ThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("서브1");
		SubThread sub2 = new SubThread("서브2");
		
		sub1.start(); // start -> 비동기방식(각자 실행)
		sub2.start();
		
		for(int i=1; i<=10; i++) {
			
			Thread.sleep(1000);  //1초마다 실행
			
			System.out.println("메인 쓰레드 실행...");
		}
		
		System.out.println("메인 쓰레드 종료...");
	}

}
