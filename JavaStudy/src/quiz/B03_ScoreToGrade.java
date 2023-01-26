package quiz;

import java.util.Scanner;

public class B03_ScoreToGrade {
	/*
	 	국어, 영어, 수학 점수를 차례대로 입력받아 평균 점수를 구한 후에
	 	각 과목 점수, 평균 점수, 등급을 출력해주는 프로그램을 만들어보세요
	 	
		1. 90점 이상 A
	 	   80점 이상 B
	 	   70점 이상 C
	 	   60점 이상 D
	 	   그 외 F
	 	
		2. 유효한 점수는 0 ~ 100점이다. (유효하지 않은 점수가 하나라도 있다면 F)
		
		3. 평균 점수는 소수 둘째 자리에서 반올림하여 저장
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 > ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 > ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 > ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		// * 정수끼리 나누면 몫만 구하기 때문에 실수로 나누어야한다.
		double avg = Math.round(sum / 3.0 * 100) / 100.0;
		char grade = 'F';
		
		if(avg >= 90) {
			grade = 'A';
		} else if(avg >= 80) {
			grade = 'B';
		} else if(avg >= 70) {
			grade = 'C';
		} else if(avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		
		if(kor < 0 || kor > 100) {
			System.out.println("국어 점수가 유효하지 않습니다.");
			grade = 'F';
		} 
		
		if(eng < 0 || eng > 100){
			System.out.println("영어 점수가 유효하지 않습니다.");
			grade = 'F';			
		} 
		
		if(math < 0 || math > 100){
			System.out.println("수학 점수가 유효하지 않습니다.");
			grade = 'F';			 
		} 		
		
		System.out.printf("국어 점수 : %d점\n"
				+ "영어 점수 : %d점\n"
				+ "수학 점수 : %d점\n"
				+ "평균 점수 : %.2f점\n"
				+ "등급 : %c\n"
				, kor, eng, math, avg, grade);
		
		sc.close();
		
	}
	
}
