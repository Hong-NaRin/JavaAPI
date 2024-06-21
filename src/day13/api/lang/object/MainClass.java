package day13.api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * Object클래스의 메서드들
		 * 1. equals() : 동일객체인지 확인
		 * 2. toString() : 객체주소를 문자열로 반환 - 오버라이딩해서 많이사용함.
		 * 3. hashCode() : 객체의 (거의)고유한 숫자값 반환
		 * 4. clone() : 객체를 복사
		 * 5. finallize() : 객체가 소멸되기 전에 실행 - deprecated됨 
		 */
		
		Person a = new Person("홍길동");
		Person b = new Person("홍길동");
		
		// 오버라이딩 시켜봄
		boolean result = a.equals(b);
		System.out.println("같은객체?:" + result);
		
		System.out.println(a.toString() );
		
		System.out.println("중복이 없는 고유한 숫자값:" + a.hashCode() );
		System.out.println("중복이 없는 고유한 숫자값:" + b.hashCode() );
	
		// clone
		try {
			Person clone = (Person)a.clone();
			System.out.println("복제인간:" + clone.toString() );
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//finallize - 가비지 컬렉터가 순서를 보장하지 않기 때문에 권장하지 않음
		a = null;
		b = null;
		System.gc(); //가비지 컬렉터 호출
	}
}
