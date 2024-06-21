package day14.api.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
//		LinkedList<String> list = new LinkedList<>(); - 사용 가능하지만 부모에게 담아서 쓴다
		List<String> list = new LinkedList<>();
		
		// ArrayList와 사용 방법이 동일함
		// 값의 추가
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		
		System.out.println(list.toString());
		
		// 값 얻기
		String n = list.get(1);
		System.out.println("1번째 요소 값: " + n);

		// 값 수정
		list.set(1, "수정할래!"); // 1번째 값 바꾸기
		System.out.println(list.toString());
	
		// 값 삭제
		list.remove("홍길동");
		System.out.println(list.toString());
//		list.clear(); // 전체 삭제
	}
}
