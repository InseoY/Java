package sub3;
/*
 * ��¥ : 2019/10/22
 * �̸� : ���μ�
 * ���� : �������̽� �ǽ��ϱ� ���� p344
 */
public class InterfaceTest3 {
	
	public static void main(String[] args) {
		
		//�������̽� �ǽ�3 - ��ü���� ���յ��� ��ȭ (���� ���ϰ���)
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);  // socket ������ ����, ���̺��� ������ �����߱⶧����
		
		socket.switchOn();
		socket.switchOff();
		
		
		
	}

}
