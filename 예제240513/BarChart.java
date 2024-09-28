package 예제240513;
// 배열에 들어있는 값만큼 '*'를 출력하여 가로 막대그래프를 출력하시오.
public class BarChart {
	public static void main(String[] args) {
		int[] data = {5, 2, 18, 9, 6, 11, 4, 5};
		
		for (int n : data) { // 각 원소에 대해 반복
			System.out.printf("%2d ", n); // 원소의 값 출력
			for (int i=0; i<n; i++) // 원소의 값만큼 반복하여
				System.out.print('*'); // *문자를 출력
			System.out.println();
		}
	}
}
