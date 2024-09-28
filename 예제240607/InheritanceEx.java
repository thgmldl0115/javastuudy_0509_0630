package 예제240607;
// 클래스 Student는 클래스 Person을 상속받아 각 멤버 필드에 값을 저장
// 이 예제에서 Person 클래스의 private 필드인 weight는 Student 클래스에서는 접근이 불가능하여 슈퍼클래스의 메소드를 통해서 조작한다.
class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) { // private 필드 weight의 값을 변경하기 위한 메소드
		this.weight = weight;
	}
	public int getWeight() { // 현재값을 얻기위해 호출하는 메소드
		return weight;
	}
}

class Student extends Person {
	public void set() {
		age = 30; // 슈퍼클래스의 디폴트 멤버 접근 가능
		name = "홍길동"; // 슈퍼클래스의 public 멤버 접근 가능
		height = 175; // 슈퍼클래스의 protected 멤버 접근 가능
		// weight = 99 ; 오류. 슈퍼클래스의 private 멤버 접근 불가
		setWeight(99); // private 멤버 weight은 setWeight()으로 간접접근
	}
}
public class InheritanceEx {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}

// 프로그래머가 원하면 set, get 메소드에 여러가지 조건을 추가하여 조건을 만족하는 경우에만 값을 바꾸도록 구현할 수 있다.
// 다른 클래스에서 마음대로 바꾸는 것이 아니라 통제할 수 있다는 것이 중요.
// 되도록 필드는 private으로 설정하고, 이에 접근할 수 있는 메소드를 만드는 것이 좋다.