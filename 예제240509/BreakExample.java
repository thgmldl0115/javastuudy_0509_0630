package 예제240509;
// "exit"이 입력되면 while 문을 벗어나도록 break 문을 활용하는 프로그램을 작성하라.
import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type exit to terminate.");
		while(true) { // 무한반복
			System.out.print(">>");
			String text = scanner.nextLine(); // 사용자가 enter 칠 때까지 한 라인을 입력받고 text에 저장
			if (text.equals("exit")) // "exit"이 입력되면 반복 종료
				// 문자열 비교시 equals() 사용. 문자열이 같으면 true, 다르면 false 리턴.
				break; // while 문을 벗어남
		}
		System.out.println("Terminating...");
		
		scanner.close();
	}
}