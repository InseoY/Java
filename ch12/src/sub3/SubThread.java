package sub3;
// 이중 상속(add랑 쓰레드)
public class SubThread extends Add implements Runnable{

	private int start;
	private int end;
	
	public SubThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		
		for(int k=start; k<=end; k++) {
			setNum(k); //상속받은 add의 num;
		}
	}

}
