package myobj;

import java.util.Scanner;

public class Grade {
	public String name;
	public int score;
	public static char grade;
	
	public static int max = 100;
	public static int min = 0;
	
	public Grade (String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public static void changeMaxMin(int max, int min) {
		Grade.max = max;
		Grade.min = min;
	}
	
	public void studentGrade(){
		while (score > max || score < min) {
			System.out.printf("%s의 점수를 다시 입력해주세요 >> ", name);
			this.score = new Scanner(System.in).nextInt();
		}
		
		if (score >= max / 10 * 9) {
			grade = 'A';
		} else if (score >= max / 10 * 8) {
			grade = 'B';
		} else if (score >= max / 10 * 7) {
			grade = 'C';
		} else if (score >= max / 10 * 6) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("%s의 점수는 %d, 등급은 %c입니다.\n", name, score, grade);
	}
	
}
