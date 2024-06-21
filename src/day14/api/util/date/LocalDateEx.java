package day14.api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateEx {

	public static void main(String[] args) {
		
		/*
		 * LocalDate - 년 월 일
		 * LocalTime - 시 분 초
		 * LocalDateTime - 년 월 일 시 분 초
		 */
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
	
		System.out.println("------------------------");
		
		// LocalDateTime을 String으로 형변환
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
		String now = dtf.format(datetime);
		System.out.println(now);
		
		System.out.println("-------------------------");
		// String을 LocalDateTime으로 형변환
		LocalDateTime nowDate = LocalDateTime.parse(now, dtf); // DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"); -> parse(문자, 문자에 대한 포맷 형식)
		System.out.println(nowDate);
	}
}
