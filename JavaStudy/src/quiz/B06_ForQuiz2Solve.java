package quiz;

import java.util.Scanner;

public class B06_ForQuiz2Solve {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아무 숫자나 입력 > ");
		int num = sc.nextInt();
		
		System.out.printf("[0부터 %d까지 모든 5의 배수 목록]\n", num);
		
		if (num >= 0) {
			for (int i = 0, count = 1; i < num; i += 5, ++count) {
				System.out.printf("%5d ", i);
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		} else {
			for (int i = 0, count = 1; i > num; i -= 5, ++count) {
				System.out.printf("%5d ", i);
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
		
	}

}
