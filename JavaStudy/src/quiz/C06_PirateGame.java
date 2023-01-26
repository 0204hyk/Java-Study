package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C06_PirateGame {
	/*
	 	해적아저씨 게임을 객체 지향적으로 만들어보세요
	 	
	 	1. 게임이 시작되면 우선 플레이어가 몇 명인지 정한다.
	 	
	 	2. 여러 플레이어가 돌아가며 통에 칼을 꽂는다.
	 	
	 	3. 잘못된 곳에 칼을 꽂은 플레이어가 게임에 패배한다.

	 	4. 칼을 찌를 수 있는 홈은 15개가 있고 그 중 3개가 꽝이 된다.
	 	   (꽝의 위치는 매 판마다 랜덤으로 설정된다.)
	 	   
		5. 사용자가 원한다면 게임 설정을 변경할 수 있어야 한다. 
		   (홈의 개수와 꽝의 개수 설정 기능)
	 */
	int player;
	
	static int hole = 15;
	static int[] lose = new int[3];
	
	public void gameSet() {
		System.out.println("=====================================");
		System.out.print("플레이어 수를 설정하세요 >> ");
		player = new Scanner(System.in).nextInt();
		
		while (player > hole) {
				System.out.println("플레이어의 수가 너무 많습니다.");
				System.out.print("플레이어 수를 다시 설정하세요 >> ");
				player = new Scanner(System.in).nextInt();
		}
		
		System.out.printf("플레이어 수: %d명\n홈의 총 개수는 %d개, 꽝의 개수는 %d개 입니다.\n"
				, player, hole, lose.length);
		
		for (int i = 0; i < lose.length; ++i) {
			lose[i] = (int)(Math.random() * hole + 1);
			for (int j = 0; j < i; ++j) {
				if(lose[i] == lose[j]) {
					--i;
					break;
				}
			}
		}				
		System.out.println("꽝 번호: " + Arrays.toString(lose));
	}
	
	public void gameStart() {
		System.out.println("=====================================");
		System.out.println("게임을 시작합니다.");
		
		int select = 0;
		int turn = 0;
		boolean result = true;
		
		while (result) {
			for (int i = 1; i <= player; ++i) {
				System.out.println("-------------------------------------");
				System.out.printf("%d번 플레이어의 차례입니다.(%d번째 차례)\n", i, ++turn);
				System.out.print("칼을 꽂을 곳의 번호를 입력 >> ");
				select = new Scanner(System.in).nextInt();
				
				while (select < 1 || select > hole) {
					System.out.print("번호를 다시 입력하세요 >> ");
					select = new Scanner(System.in).nextInt();
				}
				
				for (int j = 0; j < lose.length; ++j) {
					if(lose[j] == select) {
						System.out.println("꽝을 뽑았습니다.");
						System.out.println("게임을 종료합니다.");
						result = false;
						break;
					}
				}
				if (result == false) {
					break;
				}
			}
		}
	}
	
	public void setChange(int hole, int[] lose) {
		C06_PirateGame.hole = hole;
		C06_PirateGame.lose = lose;
		System.out.println("게임 설정이 변경되었습니다.");
		System.out.printf("변경된 홈의 개수는 %d개, 꽝의 개수는 %d개 입니다.\n", hole, lose.length);
	}
	
	public static void main(String[] args) {
		
		C06_PirateGame game1 = new C06_PirateGame();
		game1.setChange(20, new int[5]);
		game1.gameSet();
		game1.gameStart();
	}
	
}
