package 예제240526;
// 다음 코드의 두 클래스 Sample과 AccessEx 클래스는 동일한 패키지에 저장된다. 컴파일 오류를 찾아내고 이유를 설명하라.
class Sample {
	public int a;
	private int b;
	int c;
}

public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
//		aClass.b = 10;
		aClass.c = 10;
	}
}

// Sample 클래스의 a와 c는 각각 public, default 지정자로 선언이 되었으므로, 같은 패키지에 속한 AccessEx 클래스에서 접근 가능.
// b는 private으로 선언이 되었으므로 AccessEx 클래스에서 접근 불가능.
