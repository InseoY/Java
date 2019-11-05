package sub1;
/*
 * 날짜 : 2019/10/22
 * 이름 : 양인서
 * 내용 : 인터페이스 실습하기 교재 p344
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스 실습1 -  클래스 설계의 표준 가이드 역할 (이것도 다형성으로 메인되는애만 써두됨 remoteControl)
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.chUp();
		lg.soundDown();
		
		samsung.powerOn();
		samsung.chDown();
		samsung.powerOff();
	}

}
