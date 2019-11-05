package sub1;

public class Smartphone extends Computer{
	
	
	// 특성 부모에게 있는건 지워도 됨
	
	private String brand;
	private String tel;
	private int price;
	
	// 생성자
	public Smartphone(String cpu, String ram, String hdd, String brand, String tel, int price) {
		super(cpu, ram, hdd); 
	this.brand = brand;
	this.tel = tel;
	this.price = price;
	}
	
	// 기능
	public void call() {
		System.out.println(tel+"번호로 전화 거는중...");
	}
	public void info() {
		System.out.println("===============");
		System.out.println("CPU :"+super.cpu); // 외부에서 부모꺼 참조방법 private풀어야 자식에게 물려줄수 있다. protected씀.(부모=super지칭 안해도됨)
		System.out.println("RAM :"+ram);
		System.out.println("HDD :"+hdd);

		System.out.println("제품명 "+brand);
		System.out.println("폰번호 "+tel);
		System.out.println("제품가격 "+price);
	}

}
