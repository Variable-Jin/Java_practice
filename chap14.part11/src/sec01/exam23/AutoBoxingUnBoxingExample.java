package sec01.exam23;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동 Boxing
		Integer obj = 100;
		System.out.println("value:" + obj.intValue());
		// 대잆시 자동 Unboxing
		int value = obj;
		System.out.println("value:" + value);
		// 연산시 자동 UnBoxing
		int result = obj + 100;
		System.out.println("result:" + result);

	}

}
