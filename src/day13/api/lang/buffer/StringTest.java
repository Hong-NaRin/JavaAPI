package day13.api.lang.buffer;

public class StringTest {

	public static void main(String[] args) {
		
		// 문자열과 빠른문자열의 속도비교
		long start = System.currentTimeMillis();
		
		// 일반 문자열 더하기
//		String s = "";
//		for(int i = 1; i <= 200000; i++) {
//			s += "A"; 
//		}
		
		//스트링버퍼
		StringBuffer s = new StringBuffer();
		
		for(int i = 1; i <= 200000; i++) {
			s.append("A");
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간:" + (end - start) * 0.001 );
	}
}
