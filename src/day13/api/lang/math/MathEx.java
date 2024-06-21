package day13.api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		
		double d = Math.random();
		System.out.println(d);
		
		System.out.println(  Math.ceil(1.1)  ); // 올림
		System.out.println(  Math.floor(1.1)   ); // 내림
		System.out.println(  Math.round(1.5)   ); // 반올림
		System.out.println(  Math.abs( -3 )  ); // 절대값
		System.out.println(  Math.max(3, 3.1) ); // 큰값 리턴
		System.out.println(  Math.min(3, 1.5) ); // 작은값 리턴
	}
}