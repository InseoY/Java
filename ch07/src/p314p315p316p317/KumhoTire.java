package p314p315p316p317;

public class KumhoTire extends Tire{
	//�ʵ�
	//������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+ "KumgoTire ����: "+ (maxRotation-accumulatedRotation)+"ȸ");
			return true;
		} else {
			System.out.println("***" +location+ "KumhoTire ��ũ ***");
			return false;
		}
	}

}
