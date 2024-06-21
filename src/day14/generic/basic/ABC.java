package day14.generic.basic;

public class ABC<T> { // generic은 인터페이스, 클래스에 <타입> 문법
	
	private T t; // 타입이 미정인 상태 (생성할 때 지정)
	
	public void setT(T t) { // T타입의 t를 받음
		this.t = t;
	}
	public T getT() { // 반환자리에 T
		return t;
	}
}
