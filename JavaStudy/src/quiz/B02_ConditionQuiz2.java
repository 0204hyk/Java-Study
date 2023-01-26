package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {
	/*
	 	# 알맞은 조건식을 만들어보세요
	 	
	 	 1. char형 변수 a가 'q' 또는 'Q'일 때 true
	 	 2. char형 변수 b가 공백이나 탭이 아닐 때 true
	 	 3. char형 변수 c가 '0' ~ '9' 일 때 true
	 	 4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	 	 5. char형 변수 e가 한글일 때 true
	 	 6. 사용자가 입력한 문자열이 quit일 때 true
	 */
	public static void main(String[] args) {
		// 1. char형 변수 a가 'q' 또는 'Q'일 때 true 
		char a = 'Q';
		
		boolean result1 = a == 'q' || a == 'Q';
		
		System.out.println("1번 결과 : " + result1);
		
		// 2. char형 변수 b가 공백이나 탭이 아닐 때 true
		char b = ' ';
		
		boolean result2 = (b != ' ' && b != '\t');
		//다른 풀이
		//boolean result2 = (!(b == ' ' || b == '\t'));
		
		System.out.println("2번 결과 : " + result2);
		
		// 3. char형 변수 c가 '0' ~ '9' 일 때 true
		char c = '6';
		
		boolean result3 = c >= '0' && c <= '9';
		
		System.out.println("3번 결과 : " + result3);
		
		// 4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
		char d = 'N';
		
		boolean result4 = d >= 65 && d <= 90 || d >= 97 && d <= 122;
		
		System.out.println("4번 결과 : " + result4);

		// 다른 풀이
		boolean isUpperCase = d >= 'A' && d <= 'Z';  
		boolean isLowerCase = d >= 'a' && d <= 'z';
		
		System.out.println("4번 다른 풀이 : " + (isUpperCase || isLowerCase));
		
		// 5. char형 변수 e가 한글일 때 true
		char e = '철';
		
		//System.out.println((int)'ㄱ');
		//System.out.println((int)'ㅎ');
		//System.out.println((int)'ㅏ');
		//System.out.println((int)'ㅣ');
		//System.out.println((int)'가');
		//System.out.println((int)'힣');
		
		boolean result5 = e >= 12593 && e <= 12643 || e >= 44032 && e <= 55203;
		System.out.println("5번 결과 : " + result5);
		
		// 다른 풀이 
		// 자음, 모음만 쓰는 경우는 배제
		System.out.println("5번 다른 풀이 : " + (e >= '가' && e <= '힣')); 
		//System.out.println("5번 다른 풀이 : " + (e >= 0xAC00 && e <= 0xD7A3));
		
		// 6. 사용자가 입력한 문자열이 quit일 때 true
		Scanner sc = new Scanner(System.in);
		
		String command;
		
		System.out.print("> ");
		command = sc.next();
		
		System.out.println("Quit? : " + command.equals("quit"));	
		
		sc.close();
	}

}
