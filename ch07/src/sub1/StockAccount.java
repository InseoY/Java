package sub1;
// account를 상속받음(부모) ->extends
public class StockAccount extends Account{
	
	// 특성(멤버변수)
	private String stock;
	private int amount;
	private int stockPrice;
	
	// 생성자
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int stockPrice) {
		super(bank, id, name, money);
		// super은 부모
		
		this.stock = stock;
		this.amount = amount; // 본인 멤버변수 초기화
		this.stockPrice = stockPrice;
	} //부모클래스의 생성자 실행, 자신꺼도 추가해야함
	
	// 기능(멤버 메서드)
	
	public void sell(int amount) {
		this.amount -= amount;
	}
	public void buy(int amount) {
		this.amount += amount;
	}
	public void info() {
		super.info(); // 부모의 info
		System.out.println("주식종목: "+stock);
		System.out.println("주식가격: "+stockPrice);
		System.out.println("주식수량: "+amount);
	}

}
