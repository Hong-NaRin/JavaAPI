package day16.ramda.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass03 {

	public static void main(String[] args) {
		
		/*
		 * 스트림 타입
		 * Stream - 오리지널 스트림
		 * IntStream - 정수 스트림
		 * DoubleStream - 실수 스트림
		 * LongStream - long타입 스트림
		 * 
		 * 스트림타입 변환
		 * mapToXXXX() 
		 */
		//리스트에 랜덤한 값을 저장
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 100; i++) {
			list.add( new Random().nextInt(100) + 1  ); 
		}
		
		//정수형 스트림으로 형변환 + 정수에서 사용할 수 있는 메서드 추가
		long r1 = list.stream().mapToInt( t -> t).count();
		System.out.println("총 카운트:" + r1);
		int r2 = list.stream().mapToInt(t -> t).sum();
		System.out.println("총 합:" + r2);
		double r3 = list.stream().mapToInt(t -> t).average().getAsDouble(); //더블형반환
		System.out.println("평균:" + r3);
		int r4 = list.stream().mapToInt(t -> t).max().getAsInt(); //옵셔널인트
		System.out.println("가장큰값:" + r4);
		
		int[] arr = {1, 40, 50, 23, 43, 70, 99, 94 };
		int r5 = Arrays.stream(arr).min().getAsInt();		
		System.out.println("최소값:" + r5);
		
		//boxed() -> 원본스트림으로 형변환
		List<Integer> list2 = IntStream.range(1, 10).boxed().collect(Collectors.toList());
		System.out.println(list2.toString());
		
		List<Integer> list3 = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		System.out.println(list3.toString());
		//없는 숫자 더하기

		
		
		
		
		
		
	}
}
