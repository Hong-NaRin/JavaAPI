package day17.thread.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyThread m1 = new MyThread();
		m1.setName("스레드명A");
		m1.start();
		
		System.out.println("main 스레드 종료");
		
		MyThread m2 = new MyThread();
		m2.setName("스레드명B");
		m2.start();
	}
}
