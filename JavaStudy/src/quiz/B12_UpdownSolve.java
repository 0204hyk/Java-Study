package quiz;

import java.util.Scanner;

public class B12_UpdownSolve {
	/*
 	1. 프로그램이 시작되면 1 ~ 200 사이의 랜덤 숫자를 정답으로 선택한다.
 	
 	2. 사용자가 숫자를 입력하면 Up인지 Down인지 알려준다.
 	   (잘못된 숫자가 입력되면 다시 입력)
 	
 	3. 사용자가 정답을 맞추면 몇 번만에 맞췄는지 출력해주고 프로그램을 종료한다.
 	
 	4. 5번안에 못 맞추면 정답이 뭐였는지 출력해주고 프로그램을 종료한다.
	 */
	public static void main(String[] args) {
		
		boolean win = false;
		int num = (int)(Math.random() * 200 + 1);
		
		System.out.println("정답 생성 완료 ! (" + num + ")");
		
		Scanner sc = new Scanner(System.in);
		// 사용자의 기회는 총 5번
		for (int turn = 0; turn < 5; ++turn) {
			System.out.print(turn + 1 + "번째 입력 >> ");
			int user = sc.nextInt();
			
			// 잘못된 입력을 먼저 거르는 것이 항상 좋다
			if (user < 1 || user > 200) {
				System.out.println("잘못된 값입니다. 다시 입력해주세요.");
				--turn;
				continue;
			}
			
			if (user < num) {
				System.out.println("Up!!");
			} else if (user > num) {
				System.out.println("Down!!");
			} else {
				System.out.println(turn + 1 + "회 만에 정답!");
				win = true;
				break;
			}
		}
		
		if (!win) {
			System.out.println("정답은 " + num + "이었습니다.");
		}
		System.out.println("프로그램이 끝났습니다.");	
		
	}

}
