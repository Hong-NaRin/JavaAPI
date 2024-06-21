package day17.thread.basic;

public class MyThread implements Runnable {

	private int num;
	
	@Override
	public /*synchronized*/ void run() { // synchronized가 들어가면 A가 끝날 때까지 B가 실행되지 못하기 때문에 같이 실행 불가 
		for(int i = 1; i <= 10; i++) {
			num++; // 10번 증가
			System.out.println(Thread.currentThread().getName() + ":" + num); // 현재 스레드의 이름
			
			try {
				if(Thread.currentThread().getName().equals("스레드명A")) {
					Thread.sleep(1000); // 스레드 1초 멈춤
				}
				else {
					Thread.sleep(500); // 스레드 0.5초 멈춤
				}
//				Thread.sleep(1000);	// 한번 실행되고 스레드 1초 멈추고 다시 try~catch문 수행			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
