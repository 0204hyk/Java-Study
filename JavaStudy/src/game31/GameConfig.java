package game31;

public class GameConfig {
	int lastNum;
	int players;
	int bound;
	
	public GameConfig(int lastNum, int players, int bound) {
		this.lastNum = lastNum;
		this.players = players;
		this.bound = bound;
	}
	
	@Override
	public String toString() {
		return "[마지막 번호 = " + lastNum + ", 플레이어 " + players + "명, 숫자범위 1~ " + bound + "]";
	}
	
}
