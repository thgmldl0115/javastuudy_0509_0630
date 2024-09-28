package 예제240524;
// 다음 코드에서 언제 가비지가 발생하는지 설명하라.
public class GarbageEx {
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		a = null;
		d = c;
		c = null;
	}
}

// null 값은 a,b,c 와 같은 레퍼런스 타입의 변수에 저장할 수 있는 값. 
// 의미 : 아무 객체의 레퍼런스도 가지고 있지 않다.