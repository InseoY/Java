package p210p211;

public class Car {
	//�ʵ�
	public String company = "�����ڵ���";
	public String model;
	public String color;
	int maxSpeed;
	
	// ������
	Car(){}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
