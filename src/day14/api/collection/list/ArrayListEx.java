package day14.api.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		// ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();		
		
		// List에 값 추가
		list.add("java");
		list.add("jsp");
		list.add("git");
		list.add("database");
		list.add("java"); // 동일한 값 중복 가능
		list.add("python");
		
		// 리스트 크기
		System.out.println("크기: " + list.size());
		
		// 리스트를 문자열로
		System.out.println(list.toString());
		
		// list 중간에 추가
		list.add(2, "홍길동");
		System.out.println(list.toString());
		
		// list 값 수정
		list.set(2, "값의 수정"); // 메서드를 통해 삭제, 수정
		System.out.println(list.toString());
		
		// list 값 얻기
		String s = list.get(0);
		System.out.println("0번째에 있는 값: " + s);
		
		// list 값 삭제
		list.remove(2); // 지우고, 지운 값 반환
		list.remove("java"); // 첫 번째 발견되는 java를 지움
		
		System.out.println(list.toString());
		
		System.out.println("-----------------------");
		
		// 배열로 리스트 빨리 만들기
//		List<String> newList = Arrays.asList("a","b","c","d","e");
		
		String[] arr = {"a","b","c","d","e"};
		List<String> newList = Arrays.asList(arr);
		System.out.println(newList.toString());
		
		// 리스트 병합
		list.addAll(newList);
		System.out.println(list.toString());
		
		// 리스트에 값의 포함여부 확인
		if(list.contains("C")) {
			System.out.println("C는 포함되어 있음");
		}
	}
}
