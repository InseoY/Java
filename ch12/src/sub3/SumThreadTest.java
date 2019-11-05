package sub3;
/*
 * 날짜 : 2019/10/28
 * 이름 : 양인서
 * 내용 : 쓰레드(Thread) 실습하기 교재 p576
 */
public class SumThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
	
		SubThread st1 = new SubThread(1, 50);
		SubThread st2 = new SubThread(51, 100);
		
		Thread t1 = new Thread(st1); //Runnable때메 만들어줘야함
		Thread t2 = new Thread(st2); 
		
		t1.start(); 
		t2.start();
		
		t1.join();
		t2.join();
		
		int rs1 = st1.getNum();
		int rs2 = st2.getNum();
		int tot = rs1 + rs2;
		
		System.out.println("결과: "+tot); //1~100까지 합
	}
}
