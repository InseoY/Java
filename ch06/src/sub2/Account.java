package sub2;

public class Account {
	
	// Ư��(��� ����) ��ȣ�� ��������-ĸ��ȭ �ؾ��Ѵ�. ������ private
	private String bank;
	private String id;
	private String name;
	private int money;
	
	// ������ - ��ü ���� �� �� ��������� �ʱ�ȭ �ϴ� �޼���
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	
	// ���(��� �޼���)
	public void deposit(int money) {
		this.money += money; //this.money = this.money + money;
	}
	public void withdraw(int money) {
		this.money -= money;
	}
	public void info() {
		System.out.println("===============");
		System.out.println("�����: "+this.bank);
		System.out.println("���¹�ȣ: "+id);
		System.out.println("�Ա���: "+name);
		System.out.println("�����ܾ�: "+money);
		System.out.println("===============");
	}
}