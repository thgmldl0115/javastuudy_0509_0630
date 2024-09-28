package 예제240509;
// 5개의 정수를 입력받고 그 중 양수들만 합하여 출력하는 프로그램을 작성하라.
import java.util.Scanner;
public class ContinueExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers.");
		int sum = 0;
		for (int i=0; i<5; i++) {
			int n=scanner.nextInt(); // 키보드에서 정수 입력
			if (n<=0)
				continue; // 양수가 아닌 경우 다음 반복으로 진행
			else
				sum += n; // 양수인 경우 덧셈
		}
		System.out.println("Sum of positive numbers: " + sum);
		
		scanner.close();
	}
}