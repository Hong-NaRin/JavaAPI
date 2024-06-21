package day14.api.util.strtoken;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		
		// split()과 유사
		// StringTokenizer 클래스 - 문자를 특정 구분자를 기준으로 잘라서 사용
	
		String str1 = "오늘은 5월 31일이며, 금요일  입니다";
		
		StringTokenizer st = new StringTokenizer(str1); // 공백을 기준으로 잘라줌 
		System.out.println("잘린 문자의 개수: " + st.countTokens());
		
		while(st.hasMoreTokens()) { // 다음이 있으면 true, 없으면 false
			 System.out.println(st.nextToken());
		}
		
		String log = "2024.05.31, 금요일, 홍길동, /no = 30, id = aaa123";
		StringTokenizer st2 = new StringTokenizer(log, ","); // 문자열을 콤마(,)기준으로 자름
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println("-----------------------------------");
		
		StringTokenizer st3 = new StringTokenizer(log, ",./="); // , . / = 구분자들 기준으로 자름
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken().replace(" ", "")); // 공백 제거
		}
		
		StringTokenizer st4 = new StringTokenizer(log, ",", true); // 콤마(,) 기준으로 자르고 구분자(,)도 잘린 문자에 포함
		while(st4.hasMoreTokens()) {
			System.out.println(st4.nextToken());
		}
	}
}
