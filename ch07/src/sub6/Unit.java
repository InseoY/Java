package sub6;

// �߻�Ŭ����(�̿ϼ� Ŭ����)
// - �߻�޼��带 ���� Ŭ����
// - ����� ���� Ŭ����
// - ����ȭ�� Ŭ���� ���踦 �����Ѵ�.
public abstract class Unit {
	
	public void move() {
		System.out.println("Unit move...");
	}
	
	// �߻� �޼��� ����(����x)
	public abstract void attack();
	public abstract void Special();

}
