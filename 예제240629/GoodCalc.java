package 예제240629;
// 추상 클래스 Calculator를 상속받은 GoodCalc 클래스를 구현하라.

abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

public class GoodCalc extends Calculator {
	@Override // 오버라이드 로테이션. 컴파일러에게 힌트를 주는 코드. 이후에 나온 메소드는 오버라이딩 되어있다.
	public int add(int a, int b) { // 추상 메소드 구현
		return a + b;
	}
	@Override
	public int subtract(int a, int b) { // 추상 메소드 구현
		return a - b;
	}
	@Override
	public double average(int[] a) { // 추상 메소드 구현
		double sum = 0;
		for (int i = 0; i<a.length; i++)
			sum += a[i];
		return sum/a.length;
	}
	
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int[] {2, 3, 4})); // int타입의 배열 객체 생성
	}
}

// 만약,
// @Override
// public int plus(int a, int b) {
//     return a + b;
// }
// 위와 같이 하면 컴파일 오류 발생.
