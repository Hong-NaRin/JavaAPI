package day16.ramda.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {
		
		//람다 스트림
		//컬렉션 요소에는, 컬렉션처리를 효율적으로 하기 위한 다양한 스트림 함수를 제공함
		
		//기존의 방식
		List<String> list = Arrays.asList("홍길동", "이순신", "홍길동", "홍길자", "신사임당");
		
		Iterator<String> iter = list.iterator(); //반복자로 형변환
		while( iter.hasNext() ) {
			System.out.println(iter.next() );
		}
		
		
		
		System.out.println("-----------------------------------------------");
		//람다스트림으로
		
		Stream<String> stream = list.stream();
		stream.forEach( t -> System.out.println(t) );
//		stream.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
