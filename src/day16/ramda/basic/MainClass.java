package day16.ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		
//		Say01 say = new Say01() {
//			@Override
//			public void talking() {
//			}
//		};
		
		Say01 say = () -> {
			System.out.println("안녕?");
		};
		
		
		//람다식으로 변경해서 사용할 수 있음
//		p.greeting(new Say01() {
//			@Override
//			public void talking() {
//				System.out.println("안녕?");
//			}
//		});
				
		//(매개변수자리) -> {실행문}
		p.greeting(() -> {
			System.out.println("안녕?"); 
		});
		
//		p.greeting(new Say02() {
//			@Override
//			public String talking(String word) { //그의 인사법
//				return word + ": hello?";
//			}
//		});
		
		
		p.greeting( (String word) -> {
			return word + ": hello?";
		});
		
		//1. 매개변수의 타입은 생략할 수 있음
		//2. 매개변수가 1개라면 () 도 생략가능
		//3. 실행구문이 1줄이라면, {}를 생략할 수 있음.
		//4. 한줄구문으로 적었을때 return을 생략하면, 자동으로 리턴이 됩니다.
		p.greeting( word -> word + ": bye?" );
		
		//calculating메서드를 람다식으로 호출시키는데
		//기능 - int의 개수만큼 word를 문자열 합을 구해서 반환
		p.calculating( (i, word) -> {
			String sum = "";
			for(int k = 1; k <= i; k++) {
				sum += word;
			}
			return sum;
		});
		 
		
		
		
		
		
		
		
		
		
		
	}
}
