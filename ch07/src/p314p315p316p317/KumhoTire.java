package p314p315p316p317;

public class KumhoTire extends Tire{
	//필드
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+ "KumgoTire 수명: "+ (maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("***" +location+ "KumhoTire 펑크 ***");
			return false;
		}
	}

}
