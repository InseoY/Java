package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	// 동기화(동시에 동작 맞춤, 막 더하는게 아님) synchronized
	// 동기화 블럭선언으로 스레드간 경합을 막는다.
	public synchronized void setNum() {
		
		this.num++;
	}

}
