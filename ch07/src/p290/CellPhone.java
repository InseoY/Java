package p290;

public class CellPhone {
	//�ʵ�
	public String model;
	public String color;
	
	//������
	
	//�޼ҵ�
	public void powerOn() {System.out.println("������ ��ϴ�.");}
	public void powerOff() {System.out.println("������ ���ϴ�.");}
	public void bell() {System.out.println("���� �︳�ϴ�.");}
	public void sendVoice(String message) {System.out.println("�ڱ�: " + message);}
	public void receiveVoice(String message) {System.out.println("����: "+message);}
	public void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}

}