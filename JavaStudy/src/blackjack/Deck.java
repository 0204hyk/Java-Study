package blackjack;

public class Deck {
	Card[] cards;
	
	int cursor = 0;
	
	public Deck() {
		this(1);	// this() : 내 클래스의 다른 생성자에게 일을 맡김
					// Deck(1)로 생성하는 것과 같다.
	}
	
	// 카드를 여러 벌 사용하고 싶은 경우
	public Deck(int size) {
		int slen = Card.shapes.length;
		int rlen = Card.ranks.length;
		
		cards = new Card[slen * rlen * size];
		
		for (int i = 0; i < size; ++i) {
			// index : 입력한 size값 * 52개의 카드를 만듦
			int index = i * slen * rlen;
			for (int shape = 0; shape < slen; ++shape) {
				for (int rank = 0; rank < rlen; ++rank) {
					// shape * rlen + rank : cards[0 ~ 51]까지 구하는 공식
					cards[index + shape * rlen + rank] = new Card(shape, rank);	
				}
			}
		}
		shuffle();

	}
	
	public void shuffle() {
		// 카드 장수 * 2만큼 섞기
		for (int i = 0; i < cards.length * 2; ++i) {
			int ran = (int)(Math.random() * cards.length);
			
			Card tmp = cards[0];
			cards[0] = cards[ran];
			cards[ran] = tmp;
		}
	}
	
	public Card draw() {
		// 카드를 한장 씩 뽑는다. 
		// 다 뽑으면 0으로 돌아가서 다시 셔플
		if (cursor == cards.length) {
			cursor = 0;
			shuffle();
		}
			
		return cards[cursor++];
	}
	
}
