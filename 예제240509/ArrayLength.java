package 예제240509;
// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램을 작성하라.
import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int intArray[] = new int[5]; // 배열의 선언과 생성
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter" + intArray.length + "integers >>");
		for (int i=0; i<intArray.length; i++)
			intArray[i] = scanner.nextInt(); // 키보드에서 입력받은 정수 지정
		
		for (int i=0; i<intArray.length; i++)
			sum += intArray[i]; // 배열에 저장된 정수 값을 더하기
		
		System.out.print("Average: " + (double)sum/intArray.length);
		scanner.close();
	}
}