package day16.ramda.anonymous.basic;

public class Tv {

	private int volume;
	public RemoteControl remote;
	
	// 생성될때, 리모컨 객체를 갖는다(익명객체)
	// Tv안에서만 remotecontrl을 사용할 목적으로 만들어 쓸 때가 있음.
	public Tv() {
		remote = new RemoteControl() {
			//안에서 바깥을 참조할 수 있음
			@Override
			public void volumeUp() {
				volume++;
			}
			@Override
			public void volumeDown() {
				volume--;
			}
			@Override
			public void turnOn() {
				System.out.println("TV켭니다");
			}
			@Override
			public void turnOff() {
				System.out.println("TV를끕니다");
			}
		};
	}
}
