package sub1;

public class Smartphone extends Computer{
	
	
	// Ư�� �θ𿡰� �ִ°� ������ ��
	
	private String brand;
	private String tel;
	private int price;
	
	// ������
	public Smartphone(String cpu, String ram, String hdd, String brand, String tel, int price) {
		super(cpu, ram, hdd); 
	this.brand = brand;
	this.tel = tel;
	this.price = price;
	}
	
	// ���
	public void call() {
		System.out.println(tel+"��ȣ�� ��ȭ �Ŵ���...");
	}
	public void info() {
		System.out.println("===============");
		System.out.println("CPU :"+super.cpu); // �ܺο��� �θ� ������� privateǮ��� �ڽĿ��� �����ټ� �ִ�. protected��.(�θ�=super��Ī ���ص���)
		System.out.println("RAM :"+ram);
		System.out.println("HDD :"+hdd);

		System.out.println("��ǰ�� "+brand);
		System.out.println("����ȣ "+tel);
		System.out.println("��ǰ���� "+price);
	}

}
