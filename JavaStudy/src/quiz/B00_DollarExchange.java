package quiz;

import java.util.Scanner;

public class B00_DollarExchange {
	
	// 원(￦)을 입력받으면 달러($)로 얼마인지 계산해주는 프로그램을 만들어보세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int won;
		double dollar;
		
		System.out.print("원(￦)을 입력하세요 >> ");
		won = sc.nextInt();
		
		// * 정수와 실수의 계산 결과는 실수가 된다.
		dollar = won / 1400.8;
		System.out.printf("%d원(￦)은 %.2f달러($)입니다.", won, dollar);
		
		sc.close();
	}

}
