package day14.api.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		// HashMap 객체 생성
//		HashMap<Integer, String> map = new HashMap<>(); // <key 타입, value 타입>
		Map<Integer, String> map = new HashMap<>();
		
		// 값을 추가
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길동");
		map.put(4, "홍길자");
		map.put(5, "신사임당");
		
		System.out.println("맵의 크기: " + map.size());
		System.out.println(map.toString());
		
		// 맵에 같은 key를 넣으면 키는 고유하기 때문에 동일한 키를 넣으면 추가하지 않고 해당하는 값을 수정
		map.put(5, "강감찬");
		System.out.println(map.toString());
		
		// 값 얻기
		String value = map.get(3); // 키를 매개변수로 주면, 값을 반환
		System.out.println("3번 키에 해당하는 값은: " + value);
		
		// 키의 포함여부
		if(map.containsKey(3)) { // 3번 키가 있다면 true
			System.out.println("3번 키가 존재함");
		}
		
		// 값의 포함여부
		if(map.containsValue("이순신")) {
			System.out.println("이순신 값이 있음");
		}
		
		// 값의 삭제
		map.remove(3); // 키
		System.out.println(map.toString());
		System.out.println("------------------------------");
		
		// 맵의 반복 -> entrySet을 이욯해서 set으로 변경한 다음에 회전
		Set<Entry<Integer, String>> set = map.entrySet(); // entrySet() : Set<Entry<키 타입, 값 타입>>
			
		for(Entry<Integer, String> entry : set) {
			System.out.println("키: " + entry.getKey() + ", 값:" + entry.getValue());
		}
	}
}