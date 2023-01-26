package quiz;

import java.util.Random;
import java.util.Scanner;

public class B12_Updown {
	/*
	 	1. 프로그램이 시작되면 1 ~ 200 사이의 랜덤 숫자를 정답으로 선택한다.
	 	
	 	2. 사용자가 숫자를 입력하면 Up인지 Down인지 알려준다.
	 	   (잘못된 숫자가 입력되면 다시 입력)
	 	
	 	3. 사용자가 정답을 맞추면 몇 번만에 맞췄는지 출력해주고 프로그램을 종료한다.
	 	
	 	4. 5번안에 못 맞추면 정답이 뭐였는지 출력해주고 프로그램을 종료한다.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(200) + 1;
		System.out.println("정답 생성 완료 ! (" + num + ")");

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		int answer = sc.nextInt();	
		
		for (int count = 1; count <= 5; ++count) {
			
			while (answer < 1 || answer > 200) {
				System.out.print("올바른 값을 입력하세요 >>");
				answer = sc.nextInt();
			}
			
			if (answer < num) {
				if (count == 5) {
					break;
				} else {
					System.out.println("Up");
					System.out.print(count + 1 +  "번째 입력 >> ");
					answer = sc.nextInt();					
				}
			} else if (answer > num) {
				if (count == 5) {
					break;
				} else {
					System.out.println("Down");
					System.out.print(count + 1 + "번째 입력 >> ");
					answer = sc.nextInt();	
				}				
			} else {
				System.out.printf("%d회만에 정답을 맞췄습니다.\n", count);
				break;
			}
			
		}
		
		if (num != answer) {
			System.out.printf("5회 안에 맞추지 못했습니다. 정답은 %d입니다.\n", num);				
		}
		System.out.println("프로그램을 종료합니다.");
		
		
	}

}
