package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	// ����ȭ(���ÿ� ���� ����, �� ���ϴ°� �ƴ�) synchronized
	// ����ȭ ���������� �����尣 ������ ���´�.
	public synchronized void setNum() {
		
		this.num++;
	}

}
