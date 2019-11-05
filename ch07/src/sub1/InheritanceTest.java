package sub1;

/*
 * 날짜: 2019/10/17
 * 이름: 양인서
 * 내용: 클래스 상속 실습하기 교재 p288
 */

public class InheritanceTest {
	
		public static void main(String[] args) {
			
			StockAccount kw = new StockAccount("키움증권", "121-11-1231", "김춘추", 100000, "삼성전자", 10, 30000);
			kw.deposit(30000);
			kw.buy(15);
			kw.sell(5);
			kw.info(); // override로 부모,자식 같은이름인거 부모꺼 실행가능(super.info..?)
			
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
