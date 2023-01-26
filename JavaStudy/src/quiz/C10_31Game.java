package quiz;

import java.util.Scanner;

public class C10_31Game {
	/*
	 	# 31 게임을 만들어 보세요
	 	
	 	 1. 인원은 최소 2명 이상이어야 한다.
	 	
	 	 2. 번갈아가면서 숫자를 선택한다.
	 	   (1, 2, 3)
	 	 
	 	 3. 31을 말하는 사람이 패배한다.
	 */
	Scanner sc = new Scanner(System.in);
	C10_31GamePlayer[] players;
	
	public C10_31Game() {
		int playerNum;
		
		System.out.print("플레이어 수를 입력 >> ");
		playerNum = sc.nextInt();
		
		while(playerNum < 2) {
			System.out.println("인원은 최소 2명 이상이어야 합니다.");
			System.out.print("플레이어 수 재입력 >> ");
			playerNum = sc.nextInt();
		}
		
		players = new C10_31GamePlayer[playerNum];
		
		for (int i = 0; i < playerNum; ++i) {
			System.out.print((i + 1) + "번 플레이어 이름 >> ");
			players[i] = new C10_31GamePlayer(sc.next());
		}
		System.out.println("설정이 완료되었습니다.");
	}
	
	public void start() {
		System.out.println("게임을 시작합니다.");
		
		int count = 0;
		int turn = 0;

		while(true) { 
			
			int num = turn % players.length;
			System.out.printf("%s님의 차례입니다.\n", players[num].name);
			
			System.out.print("숫자를 몇 번 선택할지 입력 (1 ~ 3) >> ");
			int action = sc.nextInt();		
			while (action < 1 || action > 3) {
				System.out.println("1 ~ 3 사이의 숫자를 선택해야합니다.");
				System.out.print(">> ");
				action = sc.nextInt();
			}
			
			for (int i = 0; i < action; ++i) {
				count++;
				System.out.println(count);
				if (count == 31) {
					System.out.printf("%s님의 패배입니다.\n", players[num].name);
					
					return;
				}
			}
			++turn;
		}	
		
	}
	
	public static void main(String[] args) {
		C10_31Game game = new C10_31Game();
		
		game.start();
	}
		
}
