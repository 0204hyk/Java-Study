package quiz;

import java.util.Scanner;

public class B06_ForQuiz2 {
	/*
	 	사용자로부터 숫자를 입력받으면 0부터 해당 숫자 사이에 존재하는 모든 5의 배수를 한 줄에 10개씩 출력해보세요
	 	(음수를 입력받는 경우에도 올바르게 동작해야합니다.)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 > ");
		int num = sc.nextInt();
		
		if (num >= 0) {
			for (int i = 0, count = 0; i < num; ++i) {
				if (i % 5 == 0) {
					System.out.printf("%-5d", i);
				
					if (count % 10 == 9) {
						System.out.println();
					}
					count++;
				}
			}		
		} else {
			for (int i = 0, count = 0; i > num; --i) {
				if (i % 5 == 0) {
					System.out.printf("%-5d", i);
					if (count % 10 == 9) {
						System.out.println();
					}
					count++;
				}
			}
		}
			
	}
}
