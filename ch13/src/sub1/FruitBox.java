package sub1;

public class FruitBox <T>{
	// 제네릭 기호 T 사과, 바나나 동시 선언가능
	private T fruit;
	
	// Getter : 외부로 클래스의 멤버를 전달하기 위한 메서드
	public T getFruit() {
		return fruit;
	}
	
	// Setter : 외부에서 클래스의 멤버를 전달 받기위한 메서드
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}

}
