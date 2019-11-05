package sub1;

public class SubThread extends Thread{

	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	
	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {     // 오버라이드 때메 try catch할수 밖에 없음.
				e.printStackTrace();
			}
			
			System.out.println(name+ " 쓰레드 실행...");
		}
		
		System.out.println(name+ " 쓰레드 종료...");
	}
	
}
