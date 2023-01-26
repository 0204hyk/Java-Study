package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {
	/*
	 	사용자로부터 몇 월인지 입력 받으면 해당하는 계절을 출력해보세요
	 	(반드시 switch-case문을 사용할 것)
	 */
	public static void main(String[] args) {
		
		String season;
		int month;
		
		System.out.print("몇 월인가요? ");
		
		switch (month = new Scanner(System.in).nextInt()) {
			case 3,4,5:
				season = "봄";
				break;
			case 6,7,8  :
				season = "여름";
				break;
			case 9,10,11:
				season = "가을";
				break;
			case 12,1,2:
				season = "겨울";
				break;
			default:
				season = "없음";
				System.out.println("잘못된 값입니다.");
				break;
		}
		
		if (month >= 1 && month <= 12) {
			System.out.printf("%d월은 %s입니다.\n", month, season);
		} else {
			System.out.println("다시 입력해주세요.");
		}
		
	}

}
