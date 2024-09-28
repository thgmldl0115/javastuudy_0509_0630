package 예제240513;
// 10명의 학생이 수강하는 과목이 있다. 이 과목을 시험을 3회 시행하여, 점수를 2차원 배열에 저장한다.
// 각 학생의 시험점수와 시험점수 3개의 평균, 각 시험의 10명 학생의 평균 점수를 출력하시오.
public class TestAverage {
	public static void main(String[] args) {
		int[][] score = { {87, 96, 70},
				{68, 87, 90},
				{94, 100, 90},
				{100, 81, 82},
				{83, 65, 85},
				{78, 87, 65},
				{85, 75, 83},
				{91, 94, 100},
				{76, 72, 84},
				{87, 93, 73} };
		
		for (int student = 0; student<score.length; student++) { // 각 학생에 대해 반복
			for (int test = 0; test<score[test].length; test++)
				System.out.printf("%4d ", score[student][test]); // 시험점수 출력
		System.out.printf("%.1f\n ", getAverage(score[student])); // 점수 3개에 대한 평균 출력
		}
		
		for (int test = 0; test<score[test].length; test++) // 각 시험에 대해 반복
			System.out.printf("%4.1f ", getTestAverage(score, test)); // 학생 10명의 점수 평균을 출력
		System.out.println();
	}
	
	public static double getAverage(int[] arr) {
		double m = 0.0;
		for (double d : arr)
			m += d;
		return m / arr.length;
	}
	
	public static double getTestAverage(int[][] arr, int test) {
		double m = 0.0;
		for (int student = 0; student<arr.length; student++)
			m += arr[student][test];
		return m/arr.length;
	}

}
