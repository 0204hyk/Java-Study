package quiz;

import blackjack.Game;

public class C15_BlackJack {
	/*
	 	# 블랙잭을 만들어보세요 - https://www.247blackjack.com/
	 	
	 	 1. 컴퓨터(딜러)와 사람(플레이어)이 카드를 뽑는다.
	 	 
	 	 2. 처음에는 둘 모두 2장씩 받는다. 이 때 딜러의 카드는 한 장 가려놓는다.
	 	 
	 	 3. 플레이어는 카드를 받은 후 상황을 보고 더 뽑을지(hit) 
	 	 	그만 뽑고 여기서 멈출지(stand) 결정할 수 있다. 
	 	 
	 	 4. 플레이어가 stand하면 정해진 규칙에 따라 딜러가 카드를 뽑기 시작한다.
	 	 	(딜러는 가지고 있는 카드 합이 16 이하라면 무조건 뽑고, 17 이상이면 무조건 멈춰야 한다.)
	 	 
	 	 5. A는 1로 쓸 수도 있고 11로 쓸 수도 있다.
	 	 
	 	 6. JQK는 모두 10의 가치를 지닌다.
	 	 
	 	 7. 가진 카드의 합이 21이 넘으면 버스트 (무조건 패배, 딜러는 카드를 뽑지도 않는다.)
	 */
	public static void main(String[] args) {
		Game game = new Game();
	}
}
