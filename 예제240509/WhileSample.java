package 예제240509;
import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		int count = 0; // count는 입력된 정수의 개수
		int sum = 0; // sum은 합
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter numbers(-1 denotes the end of input)");
	
	    int n = scanner.nextInt(); // 정수 입력
	    while(n!=-1) { // -1이 입력되면 while 문 벗어남
		    sum += n;
		    count++;
		    n = scanner.nextInt(); // 정수 입력
    	}
    	if (count == 0) System.out.println("No input");
    	else {
	    	System.out.println("Count:" + count);
    		System.out.println("Average: " + (double)sum/count);
	    }
	    scanner.close();
	}
}

/* 통상적으로, for 반복문을 일정한 횟수만큼 작업문을 반복할 때 사용하고,
 * while 반복문은 반복 횟수를 미리 알 수 없을 때 사용한다.
 */