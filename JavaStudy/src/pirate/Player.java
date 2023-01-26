package pirate;

public class Player {
	String name;
	int win;
	int lose;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void win() {
		++win;
	}
	
	public void lose() {
		++lose;
	}
	
	public void modifyName(String name) {
		this.name = name;
	}
	
	public void resetRecord() {
		this.win = 0;
		this.lose = 0;
	}
	
	public void info() {
		System.out.printf("%s님의 승률은 %.2f%%입니다.\n", name, win / (double)(win + lose));
	}
	
	
}
