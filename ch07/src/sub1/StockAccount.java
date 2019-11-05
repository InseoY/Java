package sub1;
// account�� ��ӹ���(�θ�) ->extends
public class StockAccount extends Account{
	
	// Ư��(�������)
	private String stock;
	private int amount;
	private int stockPrice;
	
	// ������
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int stockPrice) {
		super(bank, id, name, money);
		// super�� �θ�
		
		this.stock = stock;
		this.amount = amount; // ���� ������� �ʱ�ȭ
		this.stockPrice = stockPrice;
	} //�θ�Ŭ������ ������ ����, �ڽŲ��� �߰��ؾ���
	
	// ���(��� �޼���)
	
	public void sell(int amount) {
		this.amount -= amount;
	}
	public void buy(int amount) {
		this.amount += amount;
	}
	public void info() {
		super.info(); // �θ��� info
		System.out.println("�ֽ�����: "+stock);
		System.out.println("�ֽİ���: "+stockPrice);
		System.out.println("�ֽļ���: "+amount);
	}

}
