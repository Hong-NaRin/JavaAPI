package day16.ramda.anonymous.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Car car = new Tico(); // 오버라이딩된 메서드가 실행된다.
		car.run();
		
		// 매번, Car를 구현한 클래스가 달라져야한다면? 
		// 익명객체 문법으로
		Car car2 = new Car() {
			
			@Override
			public void run() {
				System.out.println("마이뉴카~");
			}
		};
		car2.run();
		
		
		Car car3 = new Car() {
			
			@Override
			public void run() {
				System.out.println("유어뉴카~");
			}
		};
		
		System.out.println("------------------------------------------");
		
		// Tv에 있는 리모컨 사용하기
		Tv tv = new Tv();
		
		tv.remote.turnOn();
		tv.remote.volumeUp();
		tv.remote.volumeDown();
		tv.remote.turnOff();
	}
}
