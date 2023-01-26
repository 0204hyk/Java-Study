package quiz;

import java.util.Scanner;

public class B00_CalcAge {
	
	// 사용자로부터 태어난 해를 입력받으면 한국 나이를 출력해주는 프로그램을 만들어보세요.
	public static void main(String[] args) {
		
		Scanner yearScanner = new Scanner(System.in);
		
		System.out.print("올해와 태어난 해를 입력해주세요 >> ");
		int thisYear = yearScanner.nextInt();
		int birthYear = yearScanner.nextInt();
		
		int age = thisYear - birthYear + 1;
		System.out.printf("당신의 나이는 %d살 입니다.\n", age);
		
		yearScanner.close();
	}

}
