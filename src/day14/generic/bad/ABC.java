package day14.generic.bad;

public class ABC {

	// 무엇이든 저장 가능한 마법의 상자
	private Object obj;
	
	public void setObj(Object obj) { // 매개변수 자리에 타입 써줌
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}
}
