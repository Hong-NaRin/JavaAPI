package day14.api.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	
	public static void main(String[] args) {
		
		// 우선순위 큐 -> 자동 정렬기능
		// PriorityQueue<Integer> queue = new PriorityQueue<>();
		Queue<Integer> queue = new PriorityQueue<>(); // 큐 본연의 기능만 사용할 수 있음
		
		// 추가
		queue.offer(5);
		queue.offer(2);
		queue.offer(3);
		queue.offer(10);
		queue.offer(6);
		// [2, 3, 5, 6, 10]
		System.err.println(queue.toString()); // 실제는 잘 정렬되어 있기 때문에 보이는 정렬 순서 상관없음
		
		// 삭제(꺼냄) - 보이는 거랑 다름 주의
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		// queue가 비었는지 확인
		if(queue.isEmpty() == false) { // 큐가 비었으면 true, 아니면 false
			System.out.println("큐가 비어있지 않음");
		}
		System.out.println("----------------------------");
		
		/*
		 UserVO를 담을 수 있는 Queue
		 큐가 순서를 확인할 때 compareTo 메서드를 확인한다
		 객체를 우선순위 큐에 저장할 때는 compareTo에 정의된 형식에 따라서 우선순위방법을 지정해줘야 한다
		 compable 인터페이스를 구현해서 compareTo 메서드를 오버라이딩하면 된다
		 */
		
		System.out.println("홍길동".compareTo("홍길자")); // 음수가 나오면, 홍길자가 사전적으로 뒤에 위치
		System.out.println("홍길자".compareTo("홍길동")); // 양수가 나오면, 홍길자가 사전적으로 뒤에 위치
		Queue<UserVO> que = new PriorityQueue<>();
		
		que.offer(new UserVO("홍길동", 20));
		que.offer(new UserVO("이순신", 25));
		que.offer(new UserVO("홍길자", 30));
		que.offer(new UserVO("신사임당", 40));
		
		System.out.println(que.toString()); // UserVO에 toString 메서드를 적어야 값 출력 가능
		
		// 큐 소비
		while(que.isEmpty() == false) {
			System.out.println(que.poll());
		}
	}
}
