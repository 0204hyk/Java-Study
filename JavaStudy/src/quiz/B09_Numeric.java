package quiz;

import java.util.Scanner;

public class B09_Numeric {
	/*
	 	사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지 판별하는 프로그램을 만들어보세요
	 	
	 	1. 한 문자씩 꺼내면서 숫자인지 검사한다.
	 	2. 끝까지 검사했을 때 모두 숫자였으면 true
	 	3. 검사하다가 중간에 숫자가 아닌 것을 만나면 false
	 */
	public static void main(String[] args) {
		System.out.print("문자열 입력 >> ");
		String str = new Scanner(System.in).nextLine();	
		
		boolean b = true;
		
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
				
			if (ch >= '0' && ch <= '9') {
				System.out.printf("%c는 숫자입니다.\n", ch);
			} else if (ch == ' ') {
				System.out.printf("%c는 공백입니다.\n", ch);
			} else {
				System.out.printf("%c는 숫자가 아닙니다.\n", ch);
				b = false;
				break;
			}
		}
		
		if (b == true) {
			System.out.println("숫자로만 구성된 문자열입니다.");
		} else {
			System.out.println("숫자가 아닌 값이 포함되어 있습니다.");
		}
		
		System.out.println("---------------------------------");
		
		// 풀이
		String test = "123455a";
		boolean numeric = true;
		
		for (int i = 0; i < test.length(); ++i) {
			char ch = test.charAt(i);
			
			if (ch < '0' || ch > '9') {
				numeric = false;
				break;
			}
		}
		
		System.out.println("결과 : " + numeric);
		
	}
	
}

