package rock_paper_sicissors;

public class Rule {
	public static Rule SICISSOR = new Rule(0);
	public static Rule ROCK = new Rule(1);
	public static Rule PAPER = new Rule(2);
	
	private static String[] result = {"가위", "바위", "보자기"}; 

	int value;

	
	public Rule(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return result[value];
	}
	
}
