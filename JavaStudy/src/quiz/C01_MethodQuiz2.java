package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_MethodQuiz2 {
	/*
	 	1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 메서드
	 	
	 	2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 메서드
	 	
	 	3. 문자열을 전달하면 해당 문자열을 거꾸로 한 문자열을 반환하는 메서드
	 	
	 	4. 메서드를 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 메서드
	 */

	// 1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 메서드
	public static int basket(int apple, int size) {
		int basket;

		while (apple < 0) {
			System.out.println("사과의 개수가 잘못되었습니다.");
			System.out.print("사과 개수 다시 입력 >> ");
			apple = new Scanner(System.in).nextInt();	
		}
		
		while (size < 0) {
			System.out.println("바구니의 크기가 잘못되었습니다.");
			System.out.print("바구니 크기 다시 입력 >> ");
			size = new Scanner(System.in).nextInt();	
		}
		
		if (apple % size == 0) {
			basket = apple / size;
		} else {
			basket = apple / size + 1;
		}
			
		return basket;
	}
	
	// 2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 메서드
	public static String shuffle(String text) {
		int[] shuffle = new int[text.length()]; 
		String shuffleText = "";
		
		for (int i = 0; i < text.length(); ++i) {
			shuffle[i] = (int)(Math.random() * text.length());
			
			// 중복값 제거
			for (int j = 0; j < i; ++j) {
				if (shuffle[i] == shuffle[j]) {
					shuffle[i] = (int)(Math.random() * text.length());
					j = -1;
				}
			}
			shuffleText += text.charAt(shuffle[i]);
		}	
		
		return shuffleText;
	}
	
	// 2번 다른 풀이
	public static String shuffle2(String text) {
		char[] arr = text.toCharArray();
		//					1000번 섞기
		for (int i = 0; i < 1000; ++i) {
			int index = (int)(Math.random() * arr.length);
			
			char tmp = arr[0];
			arr[0] = arr[index];
			arr[index] = tmp;
		}
		
		return new String(arr);
	}
	
	
	// 3. 문자열을 전달하면 해당 문자열을 거꾸로 한 문자열을 반환하는 메서드
	public static String reverseText(String text) { 
		String reverse = "";
		
		for (int i = text.length() - 1; i >= 0; --i) {
			 reverse += text.charAt(i);
		}
		
		return reverse;
	}
	
	// 3번 다른 풀이
	public static String reverseText2(String text) {
		char[] ori = text.toCharArray();
		int len = ori.length;
		char[] reversed = new char[len];
		
		for (int i = 0; i < len; ++i) {
			reversed[len - 1 - i] = ori[i];
		}		
		return new String(reversed);
	}
	
	// 4. 메서드를 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 메서드
	public static int getRandomNumber() {
		return (int)(Math.random() * 45 + 1);
	}
	
	public static int[] getLottoNumber() {
		int[] lotto = new int[7];
		
		for (int i = 0; i < lotto.length; ++i) {
			lotto[i] = getRandomNumber();
			
			// 중복값 제거
			for (int j = 0; j < i; ++j) {
				if (lotto[i] == lotto[j]) {
					lotto[i] = getRandomNumber();
					j = -1;
				}
			}
		}
		return lotto;
	}
	
	public static void main(String[] args) {
		System.out.println("필요한 바구니의 개수 : " + basket(28, 10));
		System.out.println("입력한 문자열을 랜덤으로 섞은 결과 : " + shuffle("안녕하세요.반갑습니다."));
		System.out.println("입력한 문자열을 랜덤으로 섞은 결과2 : " + shuffle2("안녕하세요.반갑습니다."));
		System.out.println("입력한 문자열을 거꾸로 출력 : " + reverseText("안녕하세요.반갑습니다."));
		System.out.println("입력한 문자열을 거꾸로 출력2 : " + reverseText2("안녕하세요.반갑습니다."));
		System.out.println("랜덤 숫자 7개 출력 : " + Arrays.toString(getLottoNumber()));
	}
}
