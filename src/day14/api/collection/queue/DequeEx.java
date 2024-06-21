package day14.api.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
		
		// 양방향 큐 (양쪽 삽입, 삭제)
		// ArrayDeque<Integer> queue = new ArrayDeque<>();
		Deque<Integer> queue = new ArrayDeque<>();
		
		// 뒤에서 추가 - offer(), addlast() 
		queue.offer(1);
		queue.offerLast(2);
		queue.offerLast(3);
		queue.offerLast(4);
		
		// 앞에서 추가
		queue.addFirst(10);
		queue.addFirst(20);
		queue.addFirst(30);
		System.out.println(queue.toString());
		
		// 뒤에서 삭제
		System.out.println(queue.pollLast());
		System.out.println(queue.pollLast());
		
		// 앞에서 삭제 - poll(), pollFirst()
		System.out.println(queue.pollFirst());
		System.out.println(queue.pollFirst());
		System.out.println(queue.toString());
		
		// 뒤에서 값 확인하기
		System.out.println(queue.peekLast());
		// 앞에서 값 확인하기
		System.out.println(queue.peekFirst());
		// peek는 값만 확인하기 때문에 큐는 그대로
		System.out.println(queue.toString());
	}
}
