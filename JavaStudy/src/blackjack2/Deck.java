package blackjack2;

public class Deck {
	Card[] cards;
	int cursor;
	
	public Deck() {
		this(1);
	}
	
	public Deck(int size) {
		int slen = Card.shapes.length;
		int rlen = Card.ranks.length;
		
		cards = new Card[size * slen * rlen];
		
		for (int i = 0; i < size; ++i) {
			int index = i * slen * rlen;
			for (int shape = 0; shape < slen; ++shape) {
				for (int rank = 0; rank < rlen; ++rank) {
					cards[index + shape * rlen + rank] = new Card(shape, rank);
				}
			}
		}
		shuffle();
	}
	
	public void shuffle() {
		for (int i = 0; i < cards.length * 2; ++i) {
			Card temp = cards[0];
			cards[0] = cards[(int)(Math.random() * cards.length)];
			cards[(int)(Math.random() * cards.length)] = temp;
		}
	}
	
	public Card draw() {
		if (cursor == cards.length) {
			shuffle();
			cursor = 0;
		}
		
		return cards[cursor++];
	}
	
}
