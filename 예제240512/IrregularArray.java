package 예제240512;
public class IrregularArray {
	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		for (int i = 0; i<intArray.length; i++)
			for (int j = 0; j<intArray[i].length; j++)
				intArray[i][j] = (i+1)*10+j;
		
		for (int i = 0; i<intArray.length; i++) {
			for (int j = 0; j<intArray[i].length; j++)
				System.out.print(intArray[i][j] + " ");
			System.out.println();
		}
	}
}

// 중첩된 for 반복문에 주목. length 필드 이용하여 반복횟수를 정한다