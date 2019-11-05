package sub1;

public class Account {
	
	// 특성(멤버 변수) 보호막 씌워야함-캡슐화 해야한다. 무조건 private
	/*
	 * public: 클래스 외부 또는 클래스 내부에서 별도 제한 없이 멤버 함수 호출뿐만이 아닌 변수의 데이터 입/출력이 가능한 레벨
	 * protected: 클래스 내부 멤버나 클래스를 상속한 하위 클래스의 멤버만 접근할 수 있음
	 * private: 접근을 허용하는 수준이 가장 낮은 레벨로 오로지 해당 클래스 또는 구조체 내 멤버만 접근할 수 있음
	 */
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
	
	}
}
