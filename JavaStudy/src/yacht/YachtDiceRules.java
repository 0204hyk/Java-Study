package yacht;

import java.util.Collections;
import java.util.List;

public class YachtDiceRules {
	
	// 역의 이름과 점수를 함께 리턴하기 위해 클래스를 사용할 수 있다. (DTO)
	public static YachtDiceInfo check(Dice dice) {
		List<Integer> hand = dice.hand;
		
		for (int i = 1; i <= 6; ++i) {
			int i_count =Collections.frequency(hand, i); 
			
			if (i_count == 5) {
				return YachtDiceInfo.YACHT;
			} else if (i_count == 4) {
				return YachtDiceInfo.FOUR_OF_A_KIND;
			} else if (i_count == 2 || i_count == 3){
				for (int j = 1; j <= 6; ++j) {
					if (j == i) {
						continue;
					}
					if (Collections.frequency(hand, j) >= (5 - i_count)) {
						return YachtDiceInfo.FULL_HOUSE;
					}
				}
			} else if (i == 1 || i == 2) {
				if (hand.contains(i) && hand.contains(i + 1) 
						&& hand.contains(i + 2) && hand.contains(i + 3)
						&& hand.contains(i + 4)) {
					return YachtDiceInfo.LARGE_STRAIGHT;
				}
			} 
			
			// i가 1, 2인 경우 라지스트레이트 조건문에 한번 걸리기 때문에 if문을 따로 떼어냄
			if (i == 1 || i == 2 || i == 3) {
				if (hand.contains(i) && hand.contains(i + 1) 
						&& hand.contains(i + 2) && hand.contains(i + 3)){
					return YachtDiceInfo.SMALL_STRAIGHT;
				}
			} 	
			
		} 
		return YachtDiceInfo.NOTHING;
	}
	
}
