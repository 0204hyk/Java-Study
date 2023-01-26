package blackjack2;

public class Card {
	static char[] shapes = {'♠', '◇', '♣', '♡'};
	static String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	static int[] values = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	
	boolean hidden;
	
	int shape;
	int rank;
	
	public Card(int shape, int rank) {
		this.shape = shape;
		this.rank = rank;
	}
	
	public static int getValue(Card[] card) {
		int value = 0;
		int aCount = 0;
		
		for (int i = 0; i < card.length && card[i] != null; ++i) {
			value += values[card[i].rank];
			if (card[i].rank == 0) {
				++aCount;
			}
		}
		
		if (value > 21 && aCount > 0) {
			value -= 10;
			--aCount;
		}
		
		return value;
	}
	
	public void hide() {
		hidden = true;
	}
	
	public void open() {
		hidden = false;
	}
	
	@Override
	public String toString() {
		return String.format("[%c%s]", shapes[shape], ranks[rank]);
	}
}
