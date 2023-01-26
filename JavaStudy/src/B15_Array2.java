
public class B15_Array2 {
	/*
	 	배열 안에 배열을 넣을 수 있다.
	 	(배열로 이루어진 배열을 만들 수 있다.)
	 */
	public static void main(String[] args) {

		String[] animals = {"abc", "lion", "tiger", "cat", "dog"};
		int[] lotto = {1, 3, 99, 84, 0x123};
		
		int[] numbers = {1, 2, 3, '4', 5, 6};
		
		int[][] arr2 = {
				lotto,						// arr2[0][n],
				lotto,						// arr2[1][n]
				numbers,				 	// arr2[2][n]
				{1, 2, 3, 4, 5},			// arr2[3][n]
				{'a', '3', 'b', '가', '힣'},	// arr2[4][n]
				{3, 3, 3, 3, 3, 3, 3}		// arr2[5][n]
		};
		
		System.out.println(arr2[0][4]);
		System.out.println(arr2[4][2]);
		System.out.println((char)arr2[4][2]);
		
		// arr2[0], arr2[1], lotto는 모두 같은 배열을 가리키고 있다.
		System.out.println(arr2[1][2]);
		System.out.println(lotto[2]);
		
		// arr2[0][2]를 변경시켜도 다른 모든 배열의 값이 변한다.
		arr2[0][2] = 7;
		System.out.println(arr2[1][2]);
		System.out.println(lotto[2]);
		
		// n차원 배열은 n중 반복문으로 모두 탐색할 수 있다.
		
		// arr2.length : 배열이 몇 개 있는지를 의미함 (배열의 개수)
		for (int i = 0; i < arr2.length; ++i) {
			
			// arr2[i].length : 내부에 있는 i번째 배열의 길이를 의미함
			for (int j = 0; j < arr2[i].length; ++j) {
				System.out.printf("arr2[%d][%d] == %d\n", i, j, arr2[i][j]);
			}
		}
		
		
		
	}
	
}
