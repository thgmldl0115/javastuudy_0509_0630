package 예제240512;
public class Foreach {
	enum Week {MONDAY, TUESDAY, WENDSEDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
	// enum 선언은 메소드 안에 할 수 없다.
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int sum = 0;
		for (int k : num)
			sum += k;
		System.out.println("sum: "+sum);
		
		String names[] = {"apple", "pear", "banana", "cherry", "strawberry", "grapes"};
		for (String s : names)
			System.out.print(s + " ");
		System.out.println();
		
		for (Week day : Week.values())
			System.out.print(day + " ");
		System.out.println();
	}
}
