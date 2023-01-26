package quiz;

import java.util.Scanner;

public class B08_Palindrome {
	/*
	 	사용자가 단어를 입력하면 해당단어가 완벽하게 좌우대칭인지 판별해주는 프로그램을 만들어보세요
	 */
	public static void main(String[] agrs) {
		System.out.print("단어를 입력하세요 >> ");
		String word = new Scanner(System.in).next();

		int len = word.length();
		int count = 0;

		for (int i = 0; i < len; ++i) {
			char ch1 = word.charAt(i);
			char ch2 = word.charAt(len - i - 1);

			if (ch1 >= 'a' && ch1 <= 'z' && ch1 == ch2 || (ch1 - 32) == ch2) {
				count++;
			} else if (ch1 >= 'A' && ch1 <= 'Z' && ch1 == ch2 || (ch1 + 32) == ch2) {
				count++;
			} else if (ch1 == ch2) {
				count++;
			}
		}

		if (count == len) {
			System.out.println("좌우대칭입니다.");
		} else {
			System.out.println("좌우대칭이 아닙니다.");
		}
		
		System.out.println("--------------------");
		
		// 풀이
		Scanner sc = new Scanner(System.in);
		String word2;
		System.out.print("단어를 입력 > ");
		word = sc.next();

		// 01234567
		// straight
		// i : 0 word.length() - i - 1 : 7
		// i : 1 word.length() - i - 1 : 6
		// i : 2 word.length() - i - 1 : 5
		// i : 3 word.length() - i - 1 : 4
		// ...
		// i : 7 word.length() - i - 1 : 0

		boolean palindrome = true;

		// (1) i번째 글자와 len-i번째 글자가 모두 일치하면 좌우 대칭
		for (int i = 0; i < word.length() / 2; ++i) {

			int i2 = word.length() - 1 - i;

			char ch1 = word.charAt(i);
			char ch2 = word.charAt(i2);

			if (ch1 == ch2) {
				System.out.printf("%d번째 [%c]와 %d번째 [%c]가 일치합니다.\n", i, ch1, i2, ch2);
			} else {
				System.out.printf("%d번째 [%c]와 %d번째 [%c]가 일치하지 않습니다.\n", i, ch1, i2, ch2);
				palindrome = false;
			}

		}
		System.out.println("좌우대칭 여부 : " + palindrome);
		
		System.out.println("--------------------");
		
		// (2) 글자를 거꾸로 뒤집은 후 거꾸로 되기 전과 똑같으면 좌우 대칭
		// 비어있는 문자열에 문자를 하나씩 계속 이어붙여 문자를 만들 수 있다
		System.out.print("문자를 입력 > ");
		String word3 = sc.next();

		String reversed = "";
		for (int i = word3.length() - 1; i >= 0; --i) {
			reversed += word3.charAt(i);
		}
		
		System.out.println("원래 문자열 : " + word3);
		System.out.println("뒤집은 문자열 : " + reversed);
		System.out.println("좌우 대칭이니? : " + word3.equals(reversed));
		
		
		
	}

}
