package yacht;

public class YachtDiceInfo {
	// 외부에서는 미리 생성해놓은 인스턴스만 사용할 수 있다. (접근 제어자를 이용한 디자인 패턴)
	final public static YachtDiceInfo YACHT = new YachtDiceInfo("Yacht!!!!!", 50);
	final public static YachtDiceInfo FULL_HOUSE = new YachtDiceInfo("풀 하우스!!", 40);
	final public static YachtDiceInfo FOUR_OF_A_KIND = new YachtDiceInfo("4 Dice!!", 30);
	final public static YachtDiceInfo LARGE_STRAIGHT = new YachtDiceInfo("Large Straght!!!", 35);
	final public static YachtDiceInfo SMALL_STRAIGHT = new YachtDiceInfo("Small Straght!", 25);
	final public static YachtDiceInfo NOTHING = new YachtDiceInfo("Nothing...", 0);
	
	private String name;
	private int value;
	
	private YachtDiceInfo(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%d)", name, value);
	}
}
