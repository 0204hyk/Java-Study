package yacht;

import java.util.ArrayList;
import java.util.Collections;

public class Dice {
	
	private final boolean DEBUG = true;
	
	ArrayList<Integer> hand = new ArrayList<>(5);	// 5개만 쓸거라면 5개로 크기 설정을 해주는게 좋다.
	
	public Dice() {
		Collections.addAll(hand, 6, 6, 6, 6, 6);
		roll();
	}
	
	// 5개 다 던지기
	public void roll() {
		for (int i = 0; i < hand.size(); ++i) {
			roll(i);
		}
//		 hand.set(0, (int)(Math.random() * 6 + 1));
//		 hand.set(1, (int)(Math.random() * 6 + 1));
//		 hand.set(2, (int)(Math.random() * 6 + 1));
//		 hand.set(3, (int)(Math.random() * 6 + 1));
//		 hand.set(4, (int)(Math.random() * 6 + 1));
	}
	
	// 하나 정해서 던지기
	public void roll(int index) {
		if (DEBUG) {
			System.out.printf("hand[%d] 다시 던짐!\n", index);			
		}
		hand.set(index, (int)(Math.random() * 6 + 1));
	}
	
	// 여러개 던지기
	// "13" -> 1번 3번 다시 던지기, "123" -> 1,2,3번 다시 던지기
	public void roll(String indexs) {
		for (int i = 0; i < indexs.length(); ++i) {
			roll(indexs.charAt(i) - '0' - 1);	// char형식으로 가져오기 때문에 '0'과 1을 빼줘야함
//			int index = indexs.charAt(i) - '0' - 1;		
//			hand.set(index, (int)(Math.random() * 6 + 1));
		}
	}
	
	@Override
	public String toString() {
		return hand.toString();
	}
}
