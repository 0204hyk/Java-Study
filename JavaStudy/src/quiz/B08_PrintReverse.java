package quiz;

import java.util.Scanner;

public class B08_PrintReverse {
	/*
	 	사용자가 어떤 문장을 입력하면 해당 문장을 거꾸로 출력해보세요
	 	
	 	>> I have apple 
	 	-> elppa evah I
	 */
	public static void main(String[] args) {
		
		System.out.print("거꾸로 출력할 문장을 입력 >> ");
		String text = new Scanner(System.in).nextLine();
		
		int len = text.length();
		
		for (int i = 0; i < len; ++i) {
			System.out.print(text.charAt(len - i - 1));
		}
		System.out.println();
		
		// 풀이
		for (int i = text.length() - 1; i >= 0; --i) {
			System.out.print(text.charAt(i));
		}
		
	}
}

