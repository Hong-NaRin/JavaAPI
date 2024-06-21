package day17.thread.basic;

public class MainClass2 {
	
	public static void main(String[] args) {
		
		// 객체 1개, 스레드 2개로 동시에
		// 하나의 객체를 양쪽 스레드에서 서로 침범
		MyThread m1 = new MyThread();
		
		Thread thread1 = new Thread(m1, "스레드명A");
		Thread thread2 = new Thread(m1, "스레드명B");
		
		thread1.start();
		thread2.start();
		
		System.out.println("main스레드 정상종료");
	}

}
