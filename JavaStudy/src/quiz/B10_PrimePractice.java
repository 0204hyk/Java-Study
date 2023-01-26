package quiz;

import java.util.Scanner;

public class B10_PrimePractice {
	/*
 	사용자로부터 숫자(양수)를 입력받으면 1부터 입력한 사이에 있는 모든 소수를 출력해보세요
 	※ 사용자가 잘못된 숫자를 입력하는 경우 다시 제대로 입력하게 만들 것
 	
 	※ 소수 : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
 	ex > 2, 3, 5, 7, 11, 13 ... 
 */

	// 방법3 - i를 2부터 검사하는 숫자의 제곱근까지의 숫자로 나눈다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		for (;;) {
			System.out.print(">> ");
			num = sc.nextInt();
			if (num > 1) {
				break;
			}
			System.out.println("다시 입력하세요");
		}
		
		for (int i = 2; i <= num; ++i) {
			boolean prime = true;
			for (int j = 2; j <= Math.sqrt(i); ++j) {
				if (i % j == 0) {
					prime = false;
					break;
				} 
			}
			
			if (prime) {
				System.out.printf("%d는 소수? %s\n", i, prime);				
			}
			
			
		}
		
		
		
		
	}

}
