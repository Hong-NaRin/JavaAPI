package day14.generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		// 문자열로 저장
		ABC abc = new ABC();
		abc.setObj("홍길동");
		
		String str = (String)abc.getObj();
	
		// Person 타입으로 저장
		abc.setObj(new Person());
		Person p = (Person)abc.getObj();
		
		/*
		 * Object형은 무엇이든 저장할 수 있는데, 값을 사용할 때
		 * 올바른 타입으로 형변환을 진행해야 한다.
		 */
	}
}
