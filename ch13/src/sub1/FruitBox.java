package sub1;

public class FruitBox <T>{
	// ���׸� ��ȣ T ���, �ٳ��� ���� ���𰡴�
	private T fruit;
	
	// Getter : �ܺη� Ŭ������ ����� �����ϱ� ���� �޼���
	public T getFruit() {
		return fruit;
	}
	
	// Setter : �ܺο��� Ŭ������ ����� ���� �ޱ����� �޼���
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}

}
