package sec02.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		// 익명 겍체 필드 사용
		anony.field.turnOn();
		// 익명 객체 매가값 사용
		anony.method2(
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("SmartTV를 켭니다.");
					}
					@Override
					public void turnOff() {
						System.out.println("SmartTV를 끕니다.");
					}
				}
			);
		}

}
