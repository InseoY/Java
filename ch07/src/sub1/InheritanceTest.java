package sub1;

/*
 * ��¥: 2019/10/17
 * �̸�: ���μ�
 * ����: Ŭ���� ��� �ǽ��ϱ� ���� p288
 */

public class InheritanceTest {
	
		public static void main(String[] args) {
			
			StockAccount kw = new StockAccount("Ű������", "121-11-1231", "������", 100000, "�Ｚ����", 10, 30000);
			kw.deposit(30000);
			kw.buy(15);
			kw.sell(5);
			kw.info(); // override�� �θ�,�ڽ� �����̸��ΰ� �θ� ���డ��(super.info..?)
			
			Smartphone iphone = new Smartphone("A10", "4GB", "128GB", "iphone 10", "010-1234-5698", 100);
			Smartphone galaxy = new Smartphone("2.3GHz", "4GB", "516GB", "galaxy s10", "010-2222-5698", 110);
			
			iphone.info();
			iphone.call();
			iphone.internet();
			
			galaxy.info();
			galaxy.call();
			galaxy.calc();
		}

}
