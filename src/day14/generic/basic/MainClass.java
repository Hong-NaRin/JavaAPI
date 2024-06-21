package day14.generic.basic;

public class MainClass {

	public static void main(String[] args) {
		
		// ABC abc = new ABC(); // 무엇이든 저장할 수 있는 상자
		
		// 문자열을 저장하는 상자 - ABC클래스의 T가 String으로 바뀜
		ABC<String> abc = new ABC<String>();
		
		abc.setT("홍길동");
		String name = abc.getT();
	
		// Person을 저장하는 상자
		ABC<Person> abc2 = new ABC<>(); // 제네릭은 뒤에 들어간 <타입>을 생략 가능, 앞에 <>만 적으면 됨
		
		abc2.setT(new Person());
		Person p = abc2.getT();
		
		// <>는 객체 타입만 사용 가능
		ABC<Integer> abc3 = new ABC<>(); // wrapper 타입으로 적기 -> <int> 불가능
		
		// 멀티 제네릭 객체 생성
		DEF<Integer, String> def = new DEF<>();
		
		def.put(1, "홍길동");
		String n = def.get(1); // 1번에 대한 타입 -> 값을 받음
	}
}
