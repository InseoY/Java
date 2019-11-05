package sub2;
/*
 * 날짜 : 2019/10/22
 * 이름 : 양인서
 * 내용 : 인터페이스 실습하기 교재 p344
 */
public class InterfaceTest2 {
	public static void main(String[] args) {
		
		
		// 인터페이스 실습2 -  다중 상속의 역할(부모와 인터페이스를 사용) (다형성으로 메인되는 애 못씀, 다형성적용x)
		SmartTV stv = new SmartTV();
		
		stv.powerOn();
		stv.booting();
		stv.internet();
		stv.powerOff();
	}

}
