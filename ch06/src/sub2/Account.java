package sub2;

public class Account {
	
	// 특성(멤버 변수) 보호막 씌워야함-캡슐화 해야한다. 무조건 private
	private String bank;
	private String id;
	private String name;
	private int money;
	
	// 생성자 - 객체 생성 할 때 멤버변수를 초기화 하는 메서드
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	
	// 기능(멤버 메서드)
	public void deposit(int money) {
		this.money += money; //this.money = this.money + money;
	}
	public void withdraw(int money) {
		this.money -= money;
	}
	public void info() {
		System.out.println("===============");
		System.out.println("은행명: "+this.bank);
		System.out.println("계좌번호: "+id);
		System.out.println("입금주: "+name);
		System.out.println("현재잔액: "+money);
		System.out.println("===============");
	}
}
