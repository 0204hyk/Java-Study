package quiz;

import java.util.Scanner;

public class B08_CountAlphabet02 {
	/*
		사용자가 문장과 검색할 문자를 입력하면 해당 문장에 그 문자가 몇 회 등장하는지 알려주는 프로그램을 만들어보세요 
		(대/소문자 모두세어야함, 대/소문자 모두 입력 가능)
		  
		검색할 문장 >> I like Applepie 
		문자 >> e 
		-> 'e'는 총 3회 등장
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 문장 >> ");
		String text = sc.nextLine();

		// 스캐너에 문자를 입력받는 경우는 없기 때문에 next로 문자열을 받은 후 첫 번째 문자만 출력
		System.out.print("문자 >> ");
		String keyword = sc.next();

		int count = 0;

		for (int i = 0, c = keyword.charAt(0); i < text.length(); ++i) {

			if (c >= 'a' && c <= 'z') {
				if (c == text.charAt(i)) {
					count++;
				} else if (c - 32 == text.charAt(i)) {
					count++;
				}
			} else if (c >= 'A' && c <= 'Z') {
				if (c == text.charAt(i)) {
					count++;
				} else if (c + 32 == text.charAt(i)) {
					count++;
				}
			}
		}
		System.out.printf("총 %d회 등장하였습니다.", count);
	}
}
