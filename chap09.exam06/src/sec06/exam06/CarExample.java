package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도: " + myCar.getSpeed());

		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {
			myCar.SetStop(true);
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());
	}

}
