package day16.ramda.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass02 {

	public static void main(String[] args) {
		
		//리스트에 랜덤한 값을 저장
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 100; i++) {
			list.add( new Random().nextInt(100) + 1  ); 
		}
		
		System.out.println("원본:" + list.toString());
		
		System.out.println("----------------------------------------------");
		
		//중간처리메서드 -> 반환이 다시 Stream
		//distinct() - 중복제거
		list.stream().distinct().forEach( a -> System.out.print(a + " ") );
		
		System.out.println();
		//컬렉트 -> 다시 컬렉션으로 반환
		List<Integer> newList = list.stream().distinct().collect( Collectors.toList() );
		System.out.println(newList.toString()  );
		
		//filter - 걸러내기(리턴에 true인 값만 필터링)
		list.stream().filter( t -> t % 2 == 0 ).forEach( t -> System.out.print(t + " ") );
		System.out.println();
		
		//sorted - 정렬
		list.stream()
			.filter( t -> t % 2 == 0 )
			.sorted()
			.forEach( t -> System.out.print(t + " ") );
		
		System.out.println();
		//map - 리턴에 담긴 값으로 새로운 Stream을 생성 
		List<String> list2 = list.stream().map( a -> a % 2 == 0 ? "짝" : "홀" ).collect( Collectors.toList() );
		System.out.println(list2.toString() );
		
		
		System.out.println("------------------------------------------------------");
		/*
		 * 원본 list를 가지고
		 * 중복은 제거하고, 
		 * 65 보다는 큰 수들만, 
		 * 정렬해서, 
		 * 이값들을 아스키코드 문자로 변환하여, 리스트로 생성
		 */
		 List<Character> list3 = list.stream()
							.distinct()
							.sorted()
							.filter( z -> z >= 65 )
							.map( a -> (char)a.intValue() ) //Character리스트로 변경
							.collect( Collectors.toList() );
			
		System.out.println(list3.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
