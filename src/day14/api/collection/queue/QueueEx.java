package day14.api.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	
	public static void main(String[] args) {
		
		// 자바에서 기분 큐는 LinkedList로 대신해서 사용
		Queue<String> queue = new LinkedList<>(); // Queue말고도 List 사용할 수 있음
		
		// 큐에 삽입
		queue.add("홍길동"); // 뒤에서 추가
		queue.offer("이순신"); // add와 offer은 같음 -> 뒤에서 추가
		queue.offer("홍길자"); 
		System.out.println(queue.toString());
		
		// 큐의 삭제
		String n = queue.poll(); // offer의 반대
		System.out.println(n); // 값을 반환하고 큐에서 삭제
		System.out.println(queue.poll());
		System.out.println(queue.toString());
		
		// 큐의 값 확인
		String n2 = queue.peek(); // 그 다음 값만 확인 
		System.out.println(n2); // 값을 확인만 하고 삭제하지 않음
		System.out.println(queue.toString());
		System.out.println("----------------------");
		
		// LinkedList를 LinkedList타입에 저장하면 list기능과 queue기능을 둘 다 사용할 수 있음
		LinkedList<String> list = new LinkedList<>();
		
		list.add("a");
		list.offer("b");
		list.offer("c");
		list.addFirst("반가워"); // 앞에서 추가
		list.addLast("안녕"); // 뒤에서 추가
		System.out.println(list.toString());
		
		// 삭제
		System.out.println(list.poll()); // 앞에서 삭제
		System.out.println(list.remove(0)); // 0번째 인덱스 삭제
		System.out.println(list.toString());
		
		// 값 얻기
		list.peek(); // 앞에서 얻기
		System.out.println(list.get(0)); // 인덱스 번호로 얻기
	}
}
