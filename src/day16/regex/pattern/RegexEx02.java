package day16.regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		
		/*
		 * \\d 	- 숫자를 찾음
		 * \\d+ - 숫자 1개 이상
		 * \\d* - 숫자 0개 이상
		 * \\d? - 숫자 0또는 1개
		 * \\d{3} - 숫자 3개
		 * \\d{3, } - 숫자 3개이상
		 * 
		 * \\w - 영문자 or 숫자
		 * 
		 * [a-z] - 소문자
		 * [0-9a-z] - 숫자영문자
		 * [a-zA-Z] - 모든 영문자
		 * [a-zA-Z가-힣] - 영문자 한글
		 * 
		 * [a-zA-Z가-힣]+ - 영문자 한글 하나이상
		 * 
		 * . + * ? 등은 정규표현식이라서 특수문자 그대로 쓰고 싶으면 \? \+ \. \*
		 */
		
		
		String info = "30세|서울시 관악구|02-123-1234|010-1234-1234|aaa@naver.com";
		
		//전화번호 형식
		String phone = "\\d{2,3}-\\d{3,4}-\\d{4}";
		//이메일 형식
		String email = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]+"; 
		
		
		Pattern p1 = Pattern.compile(phone); //정규표현식 엔진 생성
		Matcher m1 = p1.matcher(info); //적용시킬 문자열 넣음
		
		//find() - 정규표현식을 찾음
		while(m1.find()) { //찾으면 true, 아니면 false
			
			System.out.println("문자:" + m1.group()); //일치하는 정규표현식 찾음
			System.out.println("시작위치:" + m1.start() );
			System.out.println("끝위치:" + m1.end() );
			
		}
		
		System.out.println("-------------------------------------------");
		
		Matcher m2 = Pattern.compile(email).matcher(info);
		
		while(m2.find()) {
			System.out.println("이메일문자:" + m2.group());
		} 
		
		
		
		
		
		
	}
}
