package quiz;

import java.util.Random;

public class B12_Count369 {
	/*
	 	랜덤 양의 정수를 하나 생성하고 해당 숫자까지 369 게임이 진행된다면 박수를 총 몇번 쳐야하는지 출력해보세요
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(1000);
		
		System.out.println("생성된 양의 정수 >> " + num);
		
		// 1. 문자열을 활용하는 방식
		int clap = 0;
		for (int i = 3; i <= num; ++i) {
			// 검사할 숫자를 문자열로 변환
			String check = "" + i;
			//System.out.println(check + "검사 결과: ");
			
			// 문자열이 된 숫자를 하나씩 떼서 박수를 쳐야하는지 검사
			for (int j = 0; j < check.length(); ++j) {
				char ch = check.charAt(j);
				//System.out.printf("- %d번째 숫자 [%c]\n", j, ch);
				
				if (ch == '3' || ch == '6' || ch == '9') {
					++clap;
					//System.out.println("짝");
				} else {
					//System.out.println();
				}
			}
			
		}
		System.out.println("총 박수 " + clap + "회 입니다.");	
		
		// 2. 숫자로 바로 구하는 방법
		clap = 0;
		
		for (int i = 3; i <= num; ++i) {
			
			int check = i;
			//System.out.println("이번에 검사할 숫자 : " + i);
			
			// 십진수는 % 10으로 일의 자리를 분리할 수 있다.
			while (check > 0) {
				//System.out.printf("- %d : \n", check % 10);
				
				int digit = check % 10;
				
				// (digit % 10 == 3 || digit % 10 == 6 || digit % 10 == 9) 
				if (digit != 0 && digit % 3 == 0) {
					//System.out.println("짝");
					++clap;
				} else {
					//System.out.println();
				}
				check /= 10;
			}
		}
		System.out.println("총 박수 " + clap + "회 입니다.");
		
	}
}
