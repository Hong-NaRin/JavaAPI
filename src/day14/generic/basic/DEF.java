package day14.generic.basic;

public class DEF<T, C> { // 멀티 제네릭 - 여러 타입 사용

	// t = 키, C = 값
	private T key;
	private C value;
	
	public void put(T key, C value) {
		this.key = key;
		this.value = value;
	}
	
	public C get(T key) { // key를 주면 C타입을 줌
		return value;
	}
}
