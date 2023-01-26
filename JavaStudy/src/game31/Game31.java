package game31;

import java.util.Scanner;

public class Game31 {
	static Scanner sc = new Scanner(System.in);
	GameConfig config;
	
	int gameNum;
	int turn;
	int currentPlayer;
	
	public Game31() {
		config = new GameConfig(31, 4, 3);
	}
	
	public void viewConfig() {
		System.out.println(config);
	}
	
	public void setConfig(int lastNum, int players, int bound) {
		config.lastNum = lastNum;
		config.players = players;
		config.bound = bound;
	}
	
	private void init() {
		gameNum = 0;
		turn = 0;
		currentPlayer = 1;
	}
	
	public void start() {
		init();
		
		//진행
		while(gameNum < config.lastNum) {
			System.out.printf("1 ~ %d 사이의 숫자 (현재: %d) > ", config.bound, gameNum);
			int select = sc.nextInt();
			
			if (select < 1 || select > config.bound) {
				System.out.println("숫자를 다시 선택해주세요.");
				continue;
			}
			
			// gameNum += select;
			for (int i = 0; i < select; ++i) {
				System.out.printf("%d!\n", ++gameNum);
				if (gameNum == config.lastNum) {
					break;
				}
			}
		}
		System.out.println("게임이 끝났습니다.");
		//전적 반영
	}
	
	public static void main(String[] args) {
		
		Game31 game = new Game31();
		
		System.out.println("설정을 변경하시겠습니까? (1.예 2.아니오)");
		switch(sc.nextInt()) {
			case 1:
				int lastNum, players, bound;
				System.out.print("마지막 번호 > ");
				lastNum = sc.nextInt();
				System.out.print("플레이어 수 > ");
				players = sc.nextInt();
				System.out.print("선택 숫자 범위 > ");
				bound = sc.nextInt();
				game.setConfig(lastNum, players, bound);
				break;
			default:
				System.out.println("변경 없이 기본 설정으로 진행합니다.");
				break;
		}
		
		game.viewConfig();
		game.start();
	}
}
