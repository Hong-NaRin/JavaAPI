package day14.api.collection.queue;

public class UserVO implements Comparable<UserVO>{ // <비교할 대상 타입>
 
	private String name;
	private int age;
	
	// 셍성자
	public UserVO() {
	}

	public UserVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compareTo(UserVO o) {
		// 내꺼랑 매개변수꺼랑 비교해서 정렬
		
		// 이름으로 대소비교
		// return this.name.compareTo(o.getName()); // 이름 기준 오름차순
		// return o.getName().compareTo(this.name);	// 이름 기준 내림차순
		
		// 나이로 대소비교
		// return Integer.compare(this.age, o.getAge()); // int 불가 - 나이 기준 오름차순
		return Integer.compare(o.getAge(), this.age); // 나이 기준 내림차순
	}

	// alt + shift + generate toString()
	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + "]";
	}
}
