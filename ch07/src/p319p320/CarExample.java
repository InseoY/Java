package p319p320;

import p314p315p316p317.Tire;

public class CarExample {
	
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			if(problemLocation !=0) {
				System.out.println(car.tires[problemLocation-1].location+ "HankookTire�� ��ü");
				car.tires[problemLocation-1] = new Tire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("--------------------------");
		}
	}
}
