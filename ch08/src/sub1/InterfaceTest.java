package sub1;
/*
 * ��¥ : 2019/10/22
 * �̸� : ���μ�
 * ���� : �������̽� �ǽ��ϱ� ���� p344
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
		// �������̽� �ǽ�1 -  Ŭ���� ������ ǥ�� ���̵� ���� (�̰͵� ���������� ���εǴ¾ָ� ��ε� remoteControl)
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
