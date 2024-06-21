package day13.api.util.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx {

	public static void main(String[] args) {
		
		// 배열 관련 클래스 Arrays
		int[] arr = {3, 4, 5, 1, 2, 6, 7, 9, 10 };
		
		// 배열 정렬
		Arrays.sort(arr);
		// Arrays.sort(arr, Collections.reverseOrder() ); Integer[] arr일 때 사용 가능 

		// 문자열로 출력
		System.out.println( Arrays.toString(arr)  );
		
		// 요소 검색 - binarySearch (선행조건 = 정렬)
		int index = Arrays.binarySearch(arr, 3); // 배열, 찾을값
		System.out.println("3이있는 위치:" + index);
		
		// 배열복사 - copyOf(), copyOfRange()
		int[] newArr = Arrays.copyOf(arr, arr.length * 2); // 배열, 복사할길이
		System.out.println( Arrays.toString(newArr));
		
		int[] newArr2 = Arrays.copyOfRange(arr, 3, 5); // 3~5미만 인덱스까지 복사
		System.out.println( Arrays.toString(newArr2) );
		
		// 배열비교 - equals()
		if(Arrays.equals(newArr, newArr2)) {
			System.out.println("배열요소가 같음");
		} else {
			System.out.println("배열요소가 다름");
		}
	}
}
