package blackjack;

public class BlackJack {
	
	static int[] values = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	
	// 1. 카드 배열을 전달받으면 총합을 구하는 메서드
	public static int getValue(Card[] card) {
		int value = 0;
		int aCount = 0;
		for (int i = 0; i < card.length && card[i] != null; ++i) {
			value += values[card[i].rank];
			
			// 21이 넘는 경우 A의 개수만큼 10을 빼기 위해 A의 개수를 세놓는다.
			if (card[i].rank == 0) {
				++aCount;
			}
		}
		
		// 카드 가치 합이 21이 넘고, A를 보유하고 있다면 보유하고 있는 A의 개수만큼 10 감소
		while(value > 21 && aCount > 0) {
			value -= 10;
			--aCount;
		}
		
		return value;
	}
	
}
