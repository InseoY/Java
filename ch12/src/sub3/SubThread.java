package sub3;
// ���� ���(add�� ������)
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
			setNum(k); //��ӹ��� add�� num;
		}
	}

}
