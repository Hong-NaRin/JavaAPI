package day13.api.lang.system;

import java.util.Properties;

public class SystemEx01 {

	public static void main(String[] args) {
		
		// 시스템 클래스는 static 메서드로 전부 정의되어 있음
		// System.exit(0); // 프로그램 종료
		// System.out.println("???");
		
//		Properties p = System.getProperties(); // 운영체제 관련된 내용들을 얻을 수 있음.
//		System.out.println(p);
		
		long start = System.currentTimeMillis();
		
		//프로그램 코드
		String str = "";
		for(long i = 1; i <= 100000L; i++ ) {
			 str += "A";			
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간:" + (end - start) * 0.001 ); // 프로그램이 몇초 걸리는가 출력
	}
}
