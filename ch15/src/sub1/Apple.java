package sub1;

//자바의 모든 클래스는 Object를 상속받는다. 자바의 최상의 클래스
public class Apple extends Object {
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void info() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
	

}
