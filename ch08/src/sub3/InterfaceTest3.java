package sub3;
/*
 * 날짜 : 2019/10/22
 * 이름 : 양인서
 * 내용 : 인터페이스 실습하기 교재 p344
 */
public class InterfaceTest3 {
	
	public static void main(String[] args) {
		
		//인터페이스 실습3 - 객체간의 결합도를 완화 (전구 소켓같은)
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);  // socket 다형성 적용, 케이블에서 소켓을 구현했기때문에
		
		socket.switchOn();
		socket.switchOff();
		
		
		
	}

}
