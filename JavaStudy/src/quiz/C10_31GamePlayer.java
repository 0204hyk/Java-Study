package quiz;

public class C10_31GamePlayer {
	String name;
	int win;
	int lose;
	
	public C10_31GamePlayer(String name) {
		this.name = name;
	}
	
	public void win() {
		++win;
	}
	
	public void lose() {
		++lose;
	}
	
	public void info() {
		System.out.printf("%s님의 승률은 %.2f입니다.\n", name, win / (double)(win + lose));
	}
	
}
