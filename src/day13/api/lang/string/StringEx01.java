package day13.api.lang.string;

import java.util.Arrays;

public class StringEx01 {

	public static void main(String[] args) {
		
		String str = "홍길동입니다! 안녕하세요?";
		String str2 = new String("홍길동");
		String str3 = new String(new char[] {'홍', '길', '동'}); // index[0] = 홍, index[1] = 길, index[2] = 동
	
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
		// charAt() - 문자열 자르기
		System.out.println( str.charAt(0) );
		
		// substr() 
		System.out.println(str.substring(4) ); // 4미만 절삭
		System.out.println(str.substring(4, str.length() ) ); // 4 ~ 길이미만 문자열 추출
		
		// split()
		String[] arr = str.split(" "); // 구분자 기준으로 문자열을 자름
		System.out.println(  Arrays.toString(arr) );
		
		// toCharArray()
		char[] arr2 = str.toCharArray();
		System.out.println( Arrays.toString(arr2) );
		
		System.out.println("--------------------------------------------");
		
		// 문자열 찾기 - indexOf(), lastIndexOf()
		str = "아 좋다 좋아";
		System.out.println( str.indexOf("아")  ); // "아" 가 있는 위치
		System.out.println( str.lastIndexOf("아") ); // "아" 가 뒤에서 발견되는 위치
		System.out.println( str.indexOf("헐") ); // 없으면 -1 반환
		if( str.indexOf("헐") != -1) { // "헐"이라는 문자가 있다는 조건
			
		}
		// 문자열길이
		System.out.println( str.length()  ); // 문자열의 길이 반환
		
		// 알파벳의 대소문자 변경
		str = "Hello World Happy Day";
		System.out.println( str.toUpperCase() );
		System.out.println( str.toLowerCase() );
		
		System.out.println("------------------------------------------");
		
		// 양측 공백제거 
		str = "   abcaaaaaa 123 ";
		System.out.println( str.trim() );
		// 모든 공백제거 (문자열 변경)
		String s = str.replace("a", "헐"); // 대상문자, 변경할문자
		System.out.println(s); // 원본문자에는 반영되지 않음
		
		str = str.replace(" ", "");
		System.out.println(str); // 원본문자에 반영됨
		
		System.out.println("-----------------------------------------");
		
		//문자열 비교
		if("홍길동".equals("홍길동") ) { 
			System.out.println("true");
		}
		
		// 문자열 대소비교 - 사전 등재순을 기준으로 
		System.out.println( "홍길동".compareTo("이순신")  ); // 뒤에 문자가 사전적으로 앞에 있음
		System.out.println( "홍길동".compareTo("홍길자")  ); // 뒤에 문자가 사전적으로 뒤에 있음
		System.out.println( "홍길동".compareTo("홍길동")  ); // 0이 나오면 같은문자
		
		// 문자열 합치기
		System.out.println( String.join("->", "서울", "대구", "대전", "부산", "찍고!")  );
		
		// 기본타입을 문자열로 형변환
		System.out.println( String.valueOf(3) + String.valueOf(3) );
	}
}
