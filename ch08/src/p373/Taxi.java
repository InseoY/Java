package p373;

import p372.Vehicle;

public class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
