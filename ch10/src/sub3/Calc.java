package sub3;

public class Calc {

	public int plus(int a, int b) {
		int c =  a + b;
		return c;
	}
	public int minus(int a, int b) {
		int c =  a - b;
		return c;
	}
	public int mult(int a, int b) {
		int c =  a * b;
		return c;
	}
	
	// ������ �߻��Ҷ� �޼��带 ȣ���ϴ� ������ ������ ������. (Ŭ������ �ᱹ try catch�ϰų�, �ո��ο��� throws exception��)
	public int div(int a, int b) throws Exception{
		int c =  a / b;
		return c;
	}
}
