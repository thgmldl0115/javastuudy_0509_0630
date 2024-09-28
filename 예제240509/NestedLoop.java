package 예제240509;
// 2중 중첩 for 문을 사용하여 구구단을 출력하는 프로그램을 작성하시오. 한 줄에 한 단씩 출력한다.
public class NestedLoop {
	public static void main(String[] args) {
		for (int i=1; i<10; i++) { // 1단에서 9단
			for (int j=1; j<10; j++) { // 각 단의 구구셈 출력
				System.out.print(i + "*" + j + "=" + i*j); // 구구셈 출력
				System.out.print('\t'); // 하나씩 탭으로 띄기
			}
			System.out.println(); // 한 단이 끝나면 다음 줄로 커서 이동
		}
	}
}