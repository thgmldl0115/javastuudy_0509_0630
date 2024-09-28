package 예제240509;
// 양수 5개를 입력받아 배열에 저장하고, 가장 큰 수를 출력하는 프로그램을 작성하라.
import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5]; // 배열 생성
		
		int max = 0; // 현재 가장 큰 수
		System.out.println("Enter 5 positive integers.");
		for (int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt(); // 입력 받은 정수를 배열에 저장
			if (intArray[i] > max) // intArray[i]가 현재 가장 큰 수보다 크면
				max = intArray[i]; // intArrat[i]를 max로 변경
		}
		System.out.print("Max: " + max);
		
		scanner.close();
	}
}

// for 반복문의 제어변수 i를 배열의 인덱스로 사용하는 경우가 많다.