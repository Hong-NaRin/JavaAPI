package day14.api.util.random;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		double d = ran.nextDouble(); // 0 ~ 1미만 랜덤 수
		System.out.println(d);
		
		int i = ran.nextInt(); // 정수 범위의 랜덤 수
		System.out.println(i);
		
		int j = ran.nextInt(10); // 0 ~ 10미만 랜덤 수
		System.out.println(j);
	}
}