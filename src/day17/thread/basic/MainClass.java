package day17.thread.basic;

public class MainClass {
	
	public static void main(String[] args) {
	
		// runnable 인터페이스를 상속받은 경우는 쓰레드 객체를 생성해서 동작시킴
		// 객체 n개, 스레드를 n개로 동쟉 (따로따로)
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		
		Thread thread1 = new Thread(m1, "스레드명A");
		Thread thread2 = new Thread(m2, "스레드명B");
		
		thread1.start();
		thread2.start();
		
		System.out.println("main 스레드 정상종료");
	}
}