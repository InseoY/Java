package sub2;
/*
 * 날짜 : 2019/10/28
 * 이름 : 양인서
 * 내용 : 람다식 실습하기 교재 p678
 */
public class LambdaThreadTest {

	public static void main(String[] args) throws Exception {
		
		Runnable r = () -> {
			
			for(int i=1; i<=10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("서브 쓰레드 실행...");
			}
			
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i =1; i<=10; i++) {
			Thread.sleep(1000);
			System.out.println("메인 쓰레드 실행...");
		}
		
		System.out.println("프로그램 종료...");
	}
}
