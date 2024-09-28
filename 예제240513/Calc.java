package 예제240513;
// 사용자가 명령행에 입력한 여러 개의 실수를 main() 메소드에서 전달받아 합을 구하는 프로그램을 작성하라.
public class Calc {
	public static void main(String[] args) {
		double sum = 0.0;
		
		for (int i=0; i<args.length; i++) // 인자 개수만큼 반복
			sum += Double.parseDouble(args[i]); // 문자열을 실수(double타입)로 변환하여 합산
		// Double.parseDouble()는 매개변수로 주어진 문자열을 실수로 변환.
		// Double.parseDouble("20.5")은 실수 20.5 리턴
		System.out.println("합계: "+sum);
	}
}