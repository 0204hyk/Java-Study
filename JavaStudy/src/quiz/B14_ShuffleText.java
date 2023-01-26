package quiz;

import java.util.Random;
import java.util.Scanner;

public class B14_ShuffleText {
	/*
	 	사용자로부터 문장을 입력받으면 해당 문장을 랜덤으로 뒤섞어 출력하는 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {
		System.out.print("문장을 입력하세요 >> ");
		String sentence = new Scanner(System.in).nextLine();
		char[] sentenceArr = sentence.toCharArray();
		
		int[] shuffle = new int[sentence.length()];
		
		for (int i = 0; i < sentence.length(); ++i) {
//ex) 길이 45일때 shuffle[0~44] = {0 ~ 44}  --> 0~44가 한번씩만 나와야한다.
			shuffle[i] = (int)(Math.random() * sentence.length());
			
			// 중복값 제거
			for (int j = 0; j < i; ++j) {
				if (shuffle[i] == shuffle[j]) {
					shuffle[i] = (int)(Math.random() * sentence.length());
					j = -1;
				}
			}
			System.out.print(sentenceArr[shuffle[i]]);				
		}
		
		
		
	}
}
