package sub1;

public interface RemoteControl {
	
	// 추상메서드 선언(abstract 생략가능) 구조화가 되어서 밑에애들 같아짐
	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp();
	public void chDown();
	
	public void soundUp();
	public void soundDown();

}
