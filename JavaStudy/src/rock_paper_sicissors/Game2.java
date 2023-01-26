package rock_paper_sicissors;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Game2 {
	
	// FileWriter, FileReader은 char 타입을 입/출력하기 때문에 65536까지 가능
	
	public int winCount;
	public int loseCount;
	public int drawCount;
	
	public Rule computerAction = new Rule((int)(Math.random() * 3));
	public Rule playerAction;
	
	public void result() {
		if (playerAction.getValue() == computerAction.getValue()) {
			System.out.printf("플레이어 [%s], 컴퓨터 [%s]\n무승부!\n", playerAction, computerAction);
			drawCount++;
		} else if (playerAction.getValue() == 0) {
			if (computerAction.getValue() == 1) {
				System.out.printf("플레이어 [%s], 컴퓨터 [%s]\n컴퓨터 승리!\n", 
						playerAction, computerAction);
				loseCount++;
			} else if (computerAction.getValue() == 2) {
				System.out.printf("플레이어 [%s], 컴퓨터 [%s]\n플레이어 승리!\n", 
						playerAction, computerAction);
				winCount++;
			}
		} else if (playerAction.getValue() == 1) {
			if (computerAction.getValue() == 0) {
				System.out.printf("플레이어 [%s], 컴퓨터 [%s]\n플레이어 승리!\n", 
						playerAction, computerAction);
				winCount++;
			} else if (computerAction.getValue() == 2) {
				System.out.printf("플레이어 [%s], 컴퓨터 [%s]\n컴퓨터 승리!\n", 
						playerAction, computerAction);
				loseCount++;

			}
		} else {
			if (computerAction.getValue() == 0) {
				System.out.printf("플레이어 [%s], 컴퓨터 [%s]\n컴퓨터 승리!\n", 
						playerAction, computerAction);
				loseCount++;
			
			} else if (computerAction.getValue() == 1) {
				System.out.printf("플레이어 [%s], 컴퓨터 [%s]\n플레이어 승리!\n", 
						playerAction, computerAction);
				winCount++;
			}
		}
	}
	
	public void saveGame() {
		try {
			FileWriter out = new FileWriter("myFiles/save2.txt");
			
			out.write(winCount);
			out.write(loseCount);
			out.write(drawCount);
			
			out.close();
		} catch (Exception e) {
			System.out.println("저장 실패");
			return;
		}
		System.out.println("=========================");
		System.out.println("저장 완료.");
	}
	
	public void loadGame() {
		try {
			FileReader in = new FileReader("myFiles/save2.txt");
			
			winCount = in.read();
			loseCount = in.read();
			drawCount = in.read();
			
			in.close();
		} catch (Exception e) {
			System.out.println("불러오기 실패");
			return;
		}
		System.out.printf("현재 전적 : [%d승/%d무/%d패]\n", winCount, drawCount, loseCount);
	}
	
	public void reset() {
		winCount = 0;
		loseCount = 0;
		drawCount = 0;
	}
	
	public Game2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임을 시작합니다.");
		
		loadGame();
		
		while (true) {
			System.out.println("=========================");
			System.out.println("1.가위 2.바위 3.보자기 >> ");
			
			playerAction = new Rule(sc.nextInt() - 1);
			
			if (playerAction.value < 0 || playerAction.value > 2) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요");
			} else {
				break;
			}
		}			
		
		result();
		saveGame();

	}

	public static void main(String[] args) {
		new Game2();
		
		
	}

}
