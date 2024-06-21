package day14.api.util.date;

import java.util.Calendar;

public class CanlendarEx {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); // 안에 날짜, 시간 등이 들어있음
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // month는 1달 느리게 나오기 때문에 +1을 해줘야 한다
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "-" + month + "-" + day + "-" + hour + ":" + minute + "" + second);
	}
}
